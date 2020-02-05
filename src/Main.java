import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.NoSuchElementException;
import java.util.Scanner;

/*
*
* Auteur: Jean-Michel Landry, Patrick Chalifour
* Code Permanent: LANJ09049206, CHAP03089503
* courriels: dj991063@ens.uqam.ca
* Date de mise a jour : 4 fevrier 2020
*/

public class Main {

    public static final String MSG_INTRO = "Bienvenue dans le programme\n\n";
    public static final String MSG_SOL_ARN1 = "Entrez la premiere chaine d'ARN";
    public static final String MSG_SOL_ARN2 = "Entrez la deuxieme chaine d'ARN";
    public static final String MSG_SOL_DIST_MAX = "Entrez la distance maximum entre les acides amines";
    public static final String MSG_ERR_ARN = "\nLa chaine d'ARN saisie est invalide. Programme terminee.";
    public static final String MSG_ERR_DIST = "\nLa distance entrez doit être plus grande que 0. Programme terminee.";
    public static final String MSG_EXCEPTION_DIST = "\nLa distance doit etre un nombre plus grand que 0. " +
                                                     "Programme terminee.";

    static ArrayList<acideAmines> chaineAcide1;
    static ArrayList<acideAmines> chaineAcide2;

    /**
     * Methode qui verifie qu'une chaine de charactere representant un codon est valide.
     *
     * Un codon valide contient un nombre de lettre divisible par 3 et contient uniquement
     * les lettres A, C, G et U. Cette methode s'assure que la chaine est de bonne longueur et Elle utilise
     * egalement la methode is valCharac pour verifier si les lettres de la chaine de charactere sont valide.
     * Si les deux conditions sont respecter elle retourne vrai.
     *
     * @param chaine est une chaine de charactere representant un ARN.
     * @return valide retourne vrai si la chaine est valide faux sinon.
     */
    public static boolean isArnValide( String chaine ) {
        boolean valide = false;
        if (( chaine.length() % 3 ) == 0 && valCharac( chaine )) {
            valide = true;
        }
        return valide;
    }

    /**
     * Methode qui verifie que chaque charactere representant un ARN est valide.
     * <p>
     * Les lettres valide dans un ARN sont A, C, G et U. La methode verifie donc chaque charactere
     * un par un et se termine si elle trouve un charactere invalide et retourne
     * faux. Si elle ne trouve aucun charactere invalide elle retourne vrai.
     *
     * @param chaine est une chaine de characteres representant un ARN.
     * @return valide retourne faux si la chaine contient une lettre autre que A, C, G ou U, sinon vrai.
     */
    public static boolean valCharac( String chaine ) {
        boolean valide = true;
        int i = 0;
        while ( i < chaine.length() & valide ) {
            if ( chaine.charAt( i ) != 'A' & chaine.charAt( i ) != 'C'
                    & chaine.charAt( i ) != 'G' & chaine.charAt( i ) != 'U') {
                valide = false;
            }
            i++;
        }
        return valide;
    }

    public static void main( String[] args ) {
        System.out.print( MSG_INTRO );
        try {
            Scanner sc = new Scanner( System.in );
            //Saisie des chainesARN par l'utilisateurs et distances Max a considerer

            //chaine1
            System.out.print( MSG_SOL_ARN1 );
            String chaine1 = sc.next();
            if ( chaine1 != null && isArnValide( chaine1 )) {
                chaineAcide1 = conversion.codonAcideAmine
                        ( conversion.nuclotideCodon( chaine1 ));
            } else {
                System.err.println( MSG_ERR_ARN );
                System.exit(-1 );
            }

            //chaine2
            System.out.print( MSG_SOL_ARN2 );
            String chaine2 = sc.next();
            if ( chaine2 != null && isArnValide( chaine2 )) {
                chaineAcide2 = conversion.codonAcideAmine
                        ( conversion.nuclotideCodon( chaine2 ));
            } else {
                System.err.println( MSG_ERR_ARN );
                System.exit(-1 );
            }

            //distance
            System.out.print( MSG_SOL_DIST_MAX );
            int distance = sc.nextInt();
            if ( distance <= 0 ) {
                System.err.println( MSG_ERR_DIST );
                System.exit(-1 );
            }

            sc.close();

            double test = calcul.calculDeviationPonderee ( chaineAcide1 , chaineAcide2 , distance );
            double metrique = calcul.Similarite( calcul.calculDeviationPonderee
                    ( chaineAcide1 , chaineAcide2 , distance ));
            System.out.println( "Resultat: " + metrique );


        } catch ( InputMismatchException IME) {
        System.err.println( MSG_EXCEPTION_DIST );
        System.exit(-1 );
        }
    }
}

