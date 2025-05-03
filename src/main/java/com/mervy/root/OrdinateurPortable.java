package com.mervy.root;

public class OrdinateurPortable extends Materiel implements Empruntable {
    private String marque;
    private Os os;

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
    public boolean isDisponible() {
        return false;
    }

    @Override
    public String toString() {
        return "OrdinateurPortable{" +
                "marque='" + marque + '\'' +
                ", os=" + os +
                '}';
    }


}

enum Os{
LINUX,
WINDOWS
}