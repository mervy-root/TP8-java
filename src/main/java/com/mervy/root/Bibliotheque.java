package com.mervy.root;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class Bibliotheque <T extends Document, U extends Materiel, V extends Adherent> {
    /***/
    private Set<Adherent> setAdherents; //agrégation

    /**une bibliotheque contient une liste de materiels*/
    private List<Materiel> fondsMateriel;

    /**une bibliotheque contient un ensemble de document*/
    private Set<Document> fondsDocumentaire;


    public Bibliotheque() {
        super();
        this.setAdherents = new HashSet<Adherent>();
        this.fondsMateriel = new ArrayList<Materiel>();
        this.fondsDocumentaire = new HashSet<Document>();
    }

    //TODO: addAdherent
    public Boolean addAdherent(Adherent adherent){ return this.setAdherents.add(adherent);}
    //TODO: removeAdherent
    public Boolean removeAdherent(Adherent adherent){return this.setAdherents.remove(adherent);}
    //TODO: addDocument
    public Boolean addDocument(T  doc){return this.fondsDocumentaire.add(doc);}

    public Boolean addMateriel(U materiel){return this.fondsMateriel.add(materiel);}

    @Override
    public String toString() {
        return "Bibliotheque{" +
                "\n\tsetAdherents=" + setAdherents +
                ",\n\tfondsMateriel=" + fondsMateriel +
                ",\n\tfondsDocumentaire=" + fondsDocumentaire +
                "\n}";
    }
/*Ajouter une méthode void afficherFonds() à la
classe Bibliothèque qui affiche les  documents
et le matériel (chacun affichant par qui,
il a été emprunté). Ajoutez les  méthodes qui vous
semblent utiles pour cela.
 */
    public void afficherFonds(){

    }
}
