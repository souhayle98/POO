package Système_Bancaire;

public class CompteCourant  extends CompteBancaire {

    private  double decouvertAutorise ;

    //Constructeur
    public CompteCourant(String numeroCompte , String titulaire , double solde , double decouvertAutorise ){
        super(numeroCompte , titulaire , solde );
        this.decouvertAutorise=decouvertAutorise;
    }

    //méthode retirer
    @Override
    public void retirer(double montant) {
        if (montant > 0 && (getSolde() + decouvertAutorise) >= montant) {
            super.retirer(montant);
        } else {
            System.out.println("Retrait refusé, montant excessif.");
        }
    }
    }





