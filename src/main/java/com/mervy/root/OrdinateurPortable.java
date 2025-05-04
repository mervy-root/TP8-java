package com.mervy.root;

public class OrdinateurPortable extends Materiel implements Empruntable {
    private String marque;
    private Os os;
    private  boolean isDisponible;
    private Adherent empruntePar;

    @Override
    public boolean isDisponible() {
        return isDisponible == true;
    }

    @Override
    public void setEmpruntePar(Adherent empruntePar) {
        this.empruntePar = empruntePar;
    }

    public void setIsDisponible(boolean disponible) {
        isDisponible = disponible;
    }

    public OrdinateurPortable(String marque, Os os) {
        super();
        this.marque = marque;
        this.os = os;
    }

    public OrdinateurPortable(Os os) {
        super();
        this.os = os;
    }

    public OrdinateurPortable(String marque, Os os, boolean enpanne) {
        super(enpanne);
        this.marque = marque;
        this.os = os;
    }

    @Override
    public boolean getIsDisponible() {
        return isDisponible;
    }

    @Override
    public String toString() {
        return "OrdinateurPortable{" +
                "marque='" + marque + '\'' +
                ", os=" + os +
                '}';
    }

    public Adherent getEmpruntePar(){
        return empruntePar;
    }


}

enum Os{
LINUX,
WINDOWS
}