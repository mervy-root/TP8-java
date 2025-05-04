package com.mervy.root;

public class MainTest {
    public static void main(String[] args) throws EmprunterException.EmprunterPortableException, EmprunterException.IndexOfEmprunterException, EmprunterException.EmprunterLivreException {
       Bibliotheque bibliotheque = new Bibliotheque();
       Adherent adherent = new Adherent("Bobo", "Lety");

       Livre livre1 = new Livre("BOBA a l'école", "Helk");
       Livre livre2 = new Livre("BOBA au marche", "Helk");
       Livre livre3 = new Livre("jojo le comedien", "Helk");
       Livre livre4 = new Livre("jojo le danseur", "Helk");
       Livre livre5 = new Livre("jojo le musicien", "Helk");
       Livre livre6 = new Livre("jojo le joueur", "Helk");
       bibliotheque.addDocument(livre1);
       bibliotheque.addDocument(livre2);
       bibliotheque.addDocument(livre3);
       bibliotheque.addDocument(livre4);
       bibliotheque.addDocument(livre5);
       bibliotheque.addDocument(livre6);


       Adherent adherent1 = new Adherent("John", "zini");
       Adherent adherent2 = new Adherent("tiuj", "ini");
       Adherent adherent3 = new Adherent("Jane", "inied");
       bibliotheque.addAdherent(adherent1);
       bibliotheque.addAdherent(adherent2);
       bibliotheque.addAdherent(adherent3);

       Revue revue1 = new Revue(250);
       Revue revue2 = new Revue(125);
       bibliotheque.addDocument(revue1);
       bibliotheque.addDocument(revue2);

       Dictionnaire dictionnaire1 = new Dictionnaire("arabe / espagnol");
       Dictionnaire dictionnaire2 = new Dictionnaire("français / anglais");
       bibliotheque.addDocument(dictionnaire1);
       bibliotheque.addDocument(dictionnaire2);

       bibliotheque.addAdherent(adherent);

       BandeDessinee bandeDessinee1 = new BandeDessinee("Le tintin");
       BandeDessinee bandeDessinee2 = new BandeDessinee("bernard louis");
       bibliotheque.addDocument(bandeDessinee1);
       bibliotheque.addDocument(bandeDessinee2);

       OrdinateurPortable ordinateurPortable1 = new OrdinateurPortable(Os.LINUX);
       OrdinateurPortable ordinateurPortable2 = new OrdinateurPortable(Os.WINDOWS);
       bibliotheque.addMateriel(ordinateurPortable1);
       bibliotheque.addMateriel(ordinateurPortable2);

       adherent2.emprunter(ordinateurPortable1);
       adherent2.emprunter(ordinateurPortable2);
       System.out.println(adherent);
       System.out.println(bibliotheque);

       bibliotheque.afficherFonds();
    }
}