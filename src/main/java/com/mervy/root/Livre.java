package com.mervy.root;

public class Livre extends Volume implements Empruntable {
    private  boolean isDisponible;
    private Adherent empruntePar;

    @Override
    public boolean getIsDisponible() {
        return isDisponible;
    }

    @Override
    public void setIsDisponible(boolean disponible) {
        this.isDisponible = disponible;
    }

    @Override
    public boolean isDisponible() {
        return isDisponible;
    }

    /*public void setDisponible(boolean disponible) {
        isDisponible = disponible;
    }
*/
    public Livre(String titre, String auteur) {
        super(titre, auteur);
        this.isDisponible = true;
    }

    @Override
    public String toString() {
        return "Livre{" +
                "title='" + title + '\'' +
                ", auteur='" + auteur + '\'' +
                '}';
    }

    public boolean equals(Livre livre) {
        return (this.title == livre.title) && this.auteur == livre.auteur;
    }

    public void setEmpruntePar(Adherent adherent) {
        this.empruntePar = adherent;
    }

    @Override
    public Adherent getEmpruntePar() {
        return empruntePar;
    }
}
