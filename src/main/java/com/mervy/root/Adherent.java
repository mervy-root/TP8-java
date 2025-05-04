package com.mervy.root;

import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class Adherent {

    private String nom;
    private String prenom;
    private Statut statut;


    private Set<Empruntable> empruntables; //0 ou 5


    public Adherent(String nom, String prenom){
        this.empruntables = new HashSet<Empruntable>();
        this.nom = nom;
        this.prenom = prenom;
    }
    public Statut getStatut() {
        return statut;
    }

    public void setStatut(Statut statut) {
        this.statut = statut;
    }

    public String getPrenom() {
        return prenom;
    }

    public void setPrenom(String prenom) {
        this.prenom = prenom;
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    @Override
    public String toString() {
        return "Adherent{" +
                "empruntables=" + empruntables +
                ", nom='" + nom + '\'' +
                ", prenom='" + prenom + '\'' +
                ", statut=" + statut +
                '}';
    }

    public int nbreLivresEmpruntees(){
        int count = 0;
        for(Empruntable empruntable : empruntables){
            if (empruntable instanceof Livre)
                count++;
        }
        return count;
    }

    public boolean emprunter(OrdinateurPortable ordinateurPortable) throws EmprunterException.EmprunterPortableException, EmprunterException.IndexOfEmprunterException{
        for (Empruntable empruntable : empruntables) {
            if (empruntable instanceof OrdinateurPortable)
                throw new EmprunterException.EmprunterPortableException("On ne peut emprunter qu'un seul portable.");
        }
        /*
        for (Empruntable empruntable : this.empruntables) {
            if (empruntable.equals(ordinateurPortable))
                throw new EmprunterException.IndexOfEmprunterException("Un livre ne peut pas être emprunter qu'une seule fois.");
        }*/

        ordinateurPortable.setIsDisponible(false);
        ordinateurPortable.setEmpruntePar(this);
        return this.empruntables.add(ordinateurPortable);
    }
    public boolean emprunter(Livre livre) throws EmprunterException.EmprunterLivreException, EmprunterException.IndexOfEmprunterException {

        if (this.nbreLivresEmpruntees() >= 5)
        {
            throw new EmprunterException.EmprunterLivreException("L'adherent ne peut emprunter que 5 livres.");
        }
        for (Empruntable empruntable : this.empruntables) {
            if (empruntable.equals(livre))
                throw new EmprunterException.IndexOfEmprunterException("Un livre ne peut pas être emprunter qu'une seule fois.");
        }

        livre.setIsDisponible(false);
        livre.setEmpruntePar(this);
        return this.empruntables.add(livre);
    }

    public boolean emprunter(Empruntable e) throws EmprunterException, EmprunterException.IndexOfEmprunterException {
        if (this.empruntables.size() >= 5)
        {
            throw new EmprunterException("L'adherent ne peut emprunter que 5 maximum.");
        }
        for (Empruntable empruntable : this.empruntables) {
            if (empruntable.equals(e))
                throw new EmprunterException.IndexOfEmprunterException("Un livre ne peut pas être emprunter qu'une seule fois.");
        }

        e.setIsDisponible(false);
        e.setEmpruntePar(this);
        return this.empruntables.add(e);
    }

    public boolean rendre(Empruntable e){
        if (e instanceof Livre)
            ((Livre) e).setIsDisponible(true);
        return this.empruntables.remove(e);
    }

    public boolean avoirEmprunter(){
        if (this.empruntables.isEmpty())
        {
            System.out.println("L'adherent n'a rien emprunter.");
            return false;
        }
        return true;
    }

    public void afficherEmprunts(){
        System.out.println("Emprunts de l'adherent " + this + " : " + empruntables);
    }


}

enum Statut{
    ETUDIANT,
    ENSEIGNANT
}

