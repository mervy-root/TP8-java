package com.mervy.root;

public class Revue extends Document{
    private int numero;

    public Revue(int numero) {
        this.numero = numero;
    }
    public Revue(String titre, int numero) {
        super(titre);
        this.numero = numero;
    }
    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }
}
