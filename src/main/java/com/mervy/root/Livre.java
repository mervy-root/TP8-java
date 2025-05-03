package com.mervy.root;

public class Livre extends Volume implements Empruntable{
    @Override
    public boolean isDisponible() {
        return true;
    }

    public Livre(){

    }
}
