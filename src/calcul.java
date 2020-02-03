import java.util.ArrayList;
import java.lang.*;
public class calcul {

/**
* Cette methode calcul la deviation minimal entre 2 ARN
 *
* Nous définissons premièrement la déviation minimale de l’acide aminé 𝑠𝑖 situé
 * à la position 𝑖de l’ARN 𝑠par rapport à l’ARN 𝑡.Ilfaut trouver un acide aminé
 * 𝑡𝑗 dans l’ARN 𝑡qui estpareil à l’acide aminé 𝑠𝑖(donc 𝑠𝑖=𝑡𝑗).  La déviation entre
 * les deux est la valeur absoluede la différence de leur indice:𝑎𝑏𝑠(𝑖−𝑗).  Il faut
 * trouver l’acide aminé𝑡𝑗qui minimalise cette déviation(cela nous donne: min({𝑎𝑏𝑠(𝑖−𝑗)|𝑡𝑗∈𝑡∧𝑡𝑗=𝑠𝑖})).
 * Si cette déviation minimale est plus grande que le coefficient 𝑑(troisième entrée du programme)
 * alors elle est remplacée par la valeur de 𝑑.  Cela nous donne la déviation minimale de𝑠𝑖par
 * rapport a 𝑡.Ensuite, il suffit de faire la somme des déviations minimales de tous les
 * acides aminé de 𝑠par rapport à𝑡et de faire la somme des déviations minimales de
 * tous les acides aminé de 𝑡par rapport à 𝑠.Additionnez ces deux sommes pour obtenir
 * la déviation minimale totaleentre les deux ARNs.
*
* @param1 chaine1 la premiere chaine d'ARN a comparer.
 * @param2 chaine2,la deuxieme chaine d'ARN a comparer.
 * @param3 distance la distance minimal a laquelle 2 acides amine se trouvent lorsque l"on compare deux ARN.
* @return resultat la mesure de la deviation minimal entre 2 chaine d'ARN.
*/


    public static double calculDeviation
        (ArrayList <acideAmines> chaine1, ArrayList <acideAmines> chaine2 , double distance){
            double deviationTotal = 0;
            for (int i = 0; i < chaine1.size(); i++ ) {
                double deviationMinimal = distance;
                for(int j = 0; j < chaine2.size(); j++ ) {
                    if( chaine2.get( j ).equals( chaine1.get( i ))) {
                        if (( Math.abs( j-i )) < deviationMinimal ) {
                            deviationMinimal = Math.abs( j-i );
                        }
                    }
                }
                deviationTotal = deviationTotal + deviationMinimal;
            }
        return deviationTotal;
    }
    public static double calculDeviationPonderee
            (ArrayList <acideAmines> chaine1, ArrayList <acideAmines> chaine2 , double distance){
                double resultat;
               resultat = ((calculDeviation(chaine1,chaine2,distance)
                       + calculDeviation(chaine2,chaine1,distance) ) / ( (chaine1.size() + chaine2.size()) * distance ));
        return resultat;
    }
/**
 * Cette methode est la 2e parti du calcul pour mesurer la similarite entre 2 chaine d'ARN.
 *  Cette methode fait le calcul d'une metrique de similarite entre 2 chaines d'ARN a l'aide de la deviation
 *  minimal qui est passe en parametre.
 *  @param devMin est la mesure de la deviation minimale des acides amines entre 2 chaines d"ARN.
 *  @return metrique la mesure de similarite entre 2 chaine d'ARN.
 */
 public static double Similarite ( double devMin) {

     double metrique = (Math.exp( -6 * ( devMin * devMin )));

     return metrique;
 }

}
