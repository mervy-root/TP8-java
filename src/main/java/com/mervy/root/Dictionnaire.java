package com.mervy.root;

public class Dictionnaire extends Volume{
    private String theme;

    public Dictionnaire(String theme) {
        super();
        this.theme = theme;
    }
    public Dictionnaire(String titre, String auteur, String theme) {
        super(titre, auteur);
        this.theme = theme;
    }
    @Override
    public String toString() {
        return "Dictionnaire{" +
                "theme='" + theme + '\'' +
                '}';
    }
}
