package Système_Bancaire;
public class CompteEpargne extends CompteBancaire {
    private  double tauxInteret;

    //Constructeur
    public CompteEpargne(String numeroCompte , String titulaire , double solde , double tauxInteret ){
        super(numeroCompte , titulaire , solde );
        this.tauxInteret=tauxInteret;
    }

    //calculer les taux et ajouter au solde du compte
    public void calculerInteret() {
        double interet = getSolde() * tauxInteret / 100;
        deposer(interet);
    }



}
