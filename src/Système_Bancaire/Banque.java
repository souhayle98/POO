package Système_Bancaire;
import java.util.ArrayList;

    public class Banque {

        // déclaration des attributs
        ArrayList<CompteBancaire> comptes = new ArrayList<>();
        private static int nombreComptes;


        // methode ajouter Compte
        public void ajouterCompte(CompteBancaire compte){
            comptes.add(compte);
            nombreComptes++;  // Incrémenter le nombre de comptes
        }


        // chercherCompte(
        public CompteBancaire chercherCompte(String numeroCompte){
            for (  CompteBancaire compte : comptes){
                if (compte.getNumeroCompte().equals(numeroCompte)){
                    return compte ;
                }
            }
            return null;
        }


        // methode transfert un montant
        public void transfert(String numeroSource, String numeroDest, double montant  ){

            CompteBancaire compteSource = chercherCompte(numeroSource);
            CompteBancaire compteDest = chercherCompte(numeroDest);

            if (compteSource != null && compteDest != null && montant > 0) {
                compteSource.retirer(montant);// Retirer du compte source
                compteDest.deposer(montant);     // Déposer sur le compte destination
            }
        }


        // methode statique pour afficher les comptes
        public static int afficherNombreComptes(){
            return nombreComptes;
        }


    }

