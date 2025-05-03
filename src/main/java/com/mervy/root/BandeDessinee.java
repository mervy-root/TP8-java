package com.mervy.root;

public class BandeDessinee extends Volume{
    private String dessinateur;

    public BandeDessinee(String dessinateur) {
        super();
        this.dessinateur = dessinateur;
    }
    public BandeDessinee(String titre, String auteur, String dessinateur) {
        super(titre, auteur);
        this.dessinateur = dessinateur;
    }
    @Override
    public String toString() {
        return "BandeDessinee{" +
                "dessinateur='" + dessinateur + '\'' +
                '}';
    }
}
