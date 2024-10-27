package Système_Bancaire;

import java.util.Date;

public class Transaction {


    private String type;
    private double montant;
    private Date date_transaction;

   public Transaction(String type , double montant , Date date_transaction){
       this.type=type;
       this.montant=montant;
       this.date_transaction=date_transaction;
   }

    // Getters et toString pour afficher les transactions
    public String getType() {
        return type;
    }

    public double getMontant() {
        return montant;
    }

    public Date getDate() {
        return date_transaction;
    }

    @Override
    public String toString() {
        return "Transaction{" +
                "type='" + type + '\'' +
                ", montant=" + montant +
                ", date=" + date_transaction +
                '}';
    }
}
