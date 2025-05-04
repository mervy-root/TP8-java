package com.mervy.root;

import java.util.*;

public class Bibliotheque <T extends Document, U extends Materiel, V extends Adherent> {
    /***/
    private Set<Adherent> setAdherents; //agrégation

    /**une bibliotheque contient une liste de materiels*/
    private List<Materiel> fondsMateriel;

    /**une bibliotheque contient un ensemble de document*/
    private Set<Document> fondsDocumentaire;

    List<Livre> livreDisponibles = new ArrayList<>();

    public Bibliotheque() {
        super();
        this.setAdherents = new HashSet<Adherent>();
        this.fondsMateriel = new ArrayList<Materiel>();
        this.fondsDocumentaire = new HashSet<Document>();
        this.livreDisponibles = new ArrayList<>();
    }

    //TODO: addAdherent
    public Boolean addAdherent(Adherent adherent){ return this.setAdherents.add(adherent);}
    //TODO: removeAdherent
    public Boolean removeAdherent(Adherent adherent){return this.setAdherents.remove(adherent);}
    //TODO: addDocument
    public Boolean addDocument(T  doc){
        if (doc instanceof Livre)
            this.livreDisponibles.add((Livre) doc);
        return this.fondsDocumentaire.add(doc);
    }

    public Boolean removeDocument(T  doc){
        if (doc instanceof Livre)
            this.fondsDocumentaire.remove(doc);
        return this.fondsDocumentaire.remove(doc);
    }

    public Boolean addMateriel(U materiel){return this.fondsMateriel.add(materiel);}

    @Override
    public String toString() {
        return "Bibliotheque{" +
                "\n\tsetAdherents=" + setAdherents +
                ",\n\tfondsMateriel=" + fondsMateriel +
                ",\n\tfondsDocumentaire=" + fondsDocumentaire +
                "\n}";
    }


    /**si le livre n'est pas emprunté, il sera dans la liste des livres disponibles*/
    public boolean livreEstEmpruntee(Livre livre){
        return !this.livreDisponibles.contains(livre);
    }
/*Ajouter une méthode void afficherFonds() à la
classe Bibliothèque qui affiche les  documents
et le matériel (chacun affichant par qui,
il a été emprunté). Ajoutez les  méthodes qui vous
semblent utiles pour cela.
 */
    public void afficherFonds(){
        System.out.println("******************Afficher fonds ******************");
        System.out.println("---------------------Document---------------------");
        /*for (Document fond : this.fondsDocumentaire){
            System.out.println(fond);
        }
        System.out.println("Documents:");*/
        for (Document doc : fondsDocumentaire) {
            System.out.println(doc);
            if (doc instanceof Empruntable) {
                Empruntable empruntable = (Empruntable) doc;
                if (!empruntable.isDisponible()) {
                    System.out.println("  Emprunté par : " + empruntable.getEmpruntePar().getNom());
                } else {
                    System.out.println("  Disponible");
                }
            }
        }

        System.out.println("---------------------Matériel---------------------");
        /*for (Materiel fond : this.fondsMateriel){
            System.out.println(fond);
        }*/
        for (Materiel mat : fondsMateriel) {
            System.out.println(mat);
            if (mat instanceof Empruntable) {
                Empruntable empruntable = (Empruntable) mat;
                if (!empruntable.isDisponible()) {
                    System.out.println("  Emprunté par : " + empruntable.getEmpruntePar().getNom());
                } else {
                    System.out.println("  Disponible");
                }
            }
        }
    }

    /**Ajouter une méthode Collection rechercherTitre(String mot), qui retourne une collection
     contenant des références vers les documents qui comportent la chaîne mot dans leur titre.*/
    public Collection rechercherTitre(String mot) {
        Collection result = new ArrayList();
        for (Document documment : this.fondsDocumentaire) {
            if (documment.getTitle().equals(mot)){
                result.add(documment);
            }
        }
        return result;
    }
}
