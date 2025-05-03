package com.mervy.root;

public class Volume extends Document{
    protected String auteur;

    public Volume(String titre, String auteur) {
        super(titre);
        this.auteur = auteur;
    }
    public Volume(){;}

    @Override
    public String toString() {
        return "Volume{" +
                "auteur='" + auteur + '\'' +
                ", title='" + title + '\'' +
                '}';
    }

    public String getAuteur() {
        return auteur;
    }

    public void setAuteur(String auteur) {
        this.auteur = auteur;
    }
}
