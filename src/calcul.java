import java.util.ArrayList;
import java.lang.*;

/**
* Contient les methodes qui modelise le calcul scientifique pour trouver  la
 * metrique de similarite entre 2 chaine
* d'ARN.
* Les 3 methodes sont les 3 parties pour calculer la metrique et doivent
 * absolument toutes 3 etre utiliser.
* Chaque methode sauf la premiere est dependante de la methode precedante.
*/
public class calcul {

 /**
 * Calcul la metrique de similarite entre 2 ARN ( partie 1 ).
 *
 * Prend en parametre 2 chaine d"ARN unique ou identique ainsi que la
  * distance  maximum entre 2 acides amine
 * contenu dans ces chaines.
 *
 * @param chaine1 la premiere chaine d'ARN a comparer.
 * @param chaine2,la deuxieme chaine d'ARN a comparer.
 * @param distance la distance maximum a laquelle 2 acides amine se trouvent
  *                lorsque l'on compare deux ARN.
 * @return resultat la mesure de la deviation entre 2 chaine d'ARN.
 */
    public static double calculDeviation ( ArrayList <acideAmines> chaine1,
                                           ArrayList <acideAmines> chaine2,
                                             double distance ) {
        double deviationTotal = 0;
        for (int i = 0; i < chaine1.size(); i++ ) {
            double deviationMinimal = distance;

        for(int j = 0; j < chaine2.size(); j++ ) {
            if( chaine2.get( j ).equals( chaine1.get( i ))) {
                if (( Math.abs( j - i )) < deviationMinimal ) {
                    deviationMinimal = Math.abs( j - i );
                }
            }
        }
        deviationTotal = deviationTotal + deviationMinimal;
        }

        return deviationTotal;
    }

    /**
    * Calcul la metrique de similarite entre 2 ARN ( partie 2 ).
    *
    * @param chaine1 la premiere chaine d'ARN a comparer.
    * @param chaine2,la deuxieme chaine d'ARN a comparer.
    * @param distance la distance maximum a laquelle 2 acides amine se
     *                 trouvent  lorsque l"on compare deux ARN.
    * @return resultat la mesure de la deviation entre 2 chaine d'ARN.
    */
    public static double calculDeviationPonderee
                                  ( ArrayList <acideAmines> chaine1,
                                        ArrayList <acideAmines> chaine2,
                                        double distance ) {
        double resultat;
        resultat = ((calculDeviation( chaine1,chaine2,distance )
                + calculDeviation( chaine2,chaine1,distance ) ) /
                ( ( chaine1.size() + chaine2.size()) * distance ));

        return resultat;
    }

/**
 * Calcul la metrique de similarite entre 2 ARN ( partie 3 ).
 *
 *  Cette methode fait le calcul d'une metrique de similarite entre 2
 *  chaines d'ARN a l'aide de la deviation
 *  minimal qui est passe en parametre.
 *
 *  @param devMin est la mesure de la deviation minimale des acides amines
 *                entre 2 chaines d"ARN.
 *  @return metrique la mesure de similarite entre 2 chaine d'ARN.
 */
 public static double Similarite ( double devMin ) {
    double metrique = Math.exp( -devMin / ( 2 * 23 * 23 ));

    return metrique;
 }

}
