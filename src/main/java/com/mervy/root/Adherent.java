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

    public boolean emprunter(Empruntable e){
        if (this.empruntables.size() > 5)
        {
            System.out.println("L'adherent ne peut emprunter que 5 maximum.");
            return false;
        }
        return this.empruntables.add(e);
    }

    public boolean rendre(Empruntable e){

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

