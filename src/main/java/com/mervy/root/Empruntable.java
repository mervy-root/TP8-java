package com.mervy.root;

public interface Empruntable {
    //Adherent jm;
    boolean isDisponible = true;
    Adherent empruntePar = null;


    public boolean isDisponible();

    Adherent getEmpruntePar();
    void setEmpruntePar(Adherent empruntePar);
    public boolean getIsDisponible();
    public void setIsDisponible(boolean disponible);

}
