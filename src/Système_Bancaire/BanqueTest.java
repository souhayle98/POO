package Système_Bancaire;
import java.util.Date;

public class BanqueTest {
    public static void main(String[] args){


        System.out.println("======================================================================");

        System.out.println("EXERCICE 1");

        //creation une banque
        Banque CIH =new Banque();

        // creation des comptes bancaires
        CompteBancaire  C1 = new CompteBancaire( "A12345","SOUHAIL" ,0 );
        CompteBancaire  C2 = new CompteBancaire( "B12345","MOHAMED" , 0);
        CompteBancaire  C3 = new CompteBancaire( "C12345","MOUAD" , 0);

        // compte avant depot d'argent
        System.out.println("le solde du compte C2 " + C2.getSolde());

        // effectuer des depot , des retraits , des transfert
        C2.deposer(3000);
        C2.retirer( 1000);

        //afficher compte apres transactions
        System.out.println("le solde du compte C2 " + C2.getSolde());

        // ajouter des comptes dans banque CIH
        CIH.ajouterCompte(C1);
        CIH.ajouterCompte(C2);
        CIH.afficherNombreComptes();
        System.out.println("le nombre du compte dans banque CIH " + CIH.afficherNombreComptes());

        //transfert entre deux compte
        System.out.println("solde du compte 1 avant depot du 1000dh " + C1.getSolde());
        CIH.transfert("B12345","A12345",1000);
        System.out.println("solde du compte 1 apres depot du 1000dh " + C1.getSolde());
        System.out.println("======================================================================");


        System.out.println("======================================================================");

        System.out.println("EXERCICE 2");

        // creation des comptes Courant et epargne
         CompteCourant C4  =new CompteCourant( "D12345","ALI" ,0, 20000);
         CompteEpargne C5  =new CompteEpargne("E12345","sami" ,0, 20);

         // des opérations
          C4.deposer(200);
        System.out.println(C4.getSolde());
         C4.retirer(100);
        System.out.println(C4.getSolde());

        //des interets sur un compte Epargne
        C5.deposer(200);
        C5.calculerInteret();
        System.out.println( C5.getSolde());

         //Affichez les informations des comptes apr`es chaque op´ eration
        System.out.println(C5.getSolde());

        System.out.println("======================================================================");




        System.out.println("======================================================================");

        System.out.println("EXERCICE 3");

         Transaction tr1 = new Transaction("credit" , 1000 , new Date());

         System.out.println(tr1);// appel du to string automatique
         C2.afficherTransactions(); // si ne routourne pas affichage directement

        System.out.println("======================================================================");






















    }
}
