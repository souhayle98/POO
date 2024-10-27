package Système_Bancaire;

import java.util.ArrayList;
import java.util.Date;

public class CompteBancaire {

        // les attributs du compte
        private String numeroCompte;
        private double solde;
        private String titulaire;

        ArrayList<Transaction> transactions;

        //Constructeur
        public CompteBancaire(String numeroCompte , String titulaire , double solde){
            this.numeroCompte=numeroCompte;
            this.titulaire=titulaire;
            this.solde=0;
            transactions = new ArrayList<>(); // new list pour les transactions
        }


        // methode pour desposer L'argent
        public void deposer(double montant ){
            if (montant > 0){
                solde += montant;
                transactions.add(new Transaction("", montant , new Date()));//transaction
            }
        }


        //methode pour retirer de L'argent
        public void retirer(double montant ){
            if (montant > 0 && solde >=montant){
                solde -= montant;
                transactions.add(new Transaction("", montant , new Date()));
            }
        }

        //metode de afficher les transaction
        public void afficherTransactions() {
        for (Transaction transaction : transactions) {
            System.out.println(transaction);
        }
       }

        // methode D'afficher le solde actuel du compte.
        public double afficherSolde(){
            return solde;
        }


        //getters
        public String getNumeroCompte(){

            return numeroCompte;
        }


        public double getSolde(){
            return solde;
        }


        //setters
        public void  setTitulaire( String titulaire) {
            this.titulaire=titulaire;
        }



    }

