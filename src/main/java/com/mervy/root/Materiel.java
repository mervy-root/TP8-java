package com.mervy.root;

public class Materiel {
    protected boolean enPanne;

    public Materiel(boolean enPanne) {
        this.enPanne = enPanne;
    }
    public Materiel() {}

    public boolean getEnPanne() {
        return enPanne;
    }

    public void setEnPanne(boolean enPanne) {
        this.enPanne = enPanne;
    }

    @Override
    public String toString() {
        return "Materiel{" +
                "enPanne=" + enPanne +
                '}';
    }
}
