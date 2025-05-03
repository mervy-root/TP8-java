package com.mervy.root;

public class MainTest {
    public static void main(String[] args) {
       Bibliotheque bibliotheque = new Bibliotheque();
       Adherent adherent1 = new Adherent("John", "zini");
       Adherent adherent2 = new Adherent("tiuj", "ini");
       Adherent adherent3 = new Adherent("Jane", "inied");
       bibliotheque.addAdherent(adherent1);
       bibliotheque.addAdherent(adherent2);
       bibliotheque.addAdherent(adherent3);

       Livre livre1 = new Livre();
       Livre livre2 = new Livre();
       bibliotheque.addDocument(livre1);
       bibliotheque.addDocument(livre2);

       Revue revue1 = new Revue(250);
       Revue revue2 = new Revue(125);
       bibliotheque.addDocument(revue1);
       bibliotheque.addDocument(revue2);

       Dictionnaire dictionnaire1 = new Dictionnaire("arabe / espagnol");
       Dictionnaire dictionnaire2 = new Dictionnaire("français / anglais");
       bibliotheque.addDocument(dictionnaire1);
       bibliotheque.addDocument(dictionnaire2);

       BandeDessinee bandeDessinee1 = new BandeDessinee("Le tintin");
       BandeDessinee bandeDessinee2 = new BandeDessinee("bernard louis");
       bibliotheque.addDocument(bandeDessinee1);
       bibliotheque.addDocument(bandeDessinee2);

       OrdinateurPortable ordinateurPortable1 = new OrdinateurPortable(Os.LINUX);
       OrdinateurPortable ordinateurPortable2 = new OrdinateurPortable(Os.WINDOWS);
       bibliotheque.addMateriel(ordinateurPortable1);
       bibliotheque.addMateriel(ordinateurPortable2);

       System.out.println(bibliotheque);

    }
}