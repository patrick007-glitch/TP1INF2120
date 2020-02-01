import java.util.ArrayList;
import java.lang.*;
public class calcul {

/*
*Nom: calcul deviation minimal
* Description: calcul la distance de deviation
* moyenne entre 2 nucleotide de deux chaines differentes
* Param : chaine1, chaine2, distance
* param : double resultat
*/

public static double calculDeviationMinimal
        (ArrayList <acideAmines> chaine1, ArrayList <acideAmines> chaine2 , double distance){
    double deviationTotal = 0;
    double resultat = 0;
    for (int i = 0; i < chaine1.size(); i++){
        double deviationMinimal = distance;
        for(int j = 0; j < chaine1.size(); j++){
            if(chaine2.get(j).equals(chaine1.get(i))){
                if ((Math.abs(j-i)) < deviationMinimal){
                    deviationMinimal = Math.abs(j-i);
                }
            }
        }
        deviationTotal = deviationTotal + deviationMinimal;
    }
    for (int i = 0; i < chaine2.size(); i++){
        double deviationMinimal = distance;
        for(int j = 0; j < chaine1.size(); j++){
            if(chaine1.get(j).equals(chaine1.get(i))){
                if ((Math.abs(j-i)) < deviationMinimal){
                    deviationMinimal = Math.abs(j-i);
                }
            }
        }
        deviationTotal = deviationTotal + deviationMinimal;
    }
           resultat = ((deviationTotal) /( chaine1.size() + chaine2.size() + distance));
    return resultat;
}
/* Nom : Similarite
*  Description: calcul d'une metrique de similarite entre 2 chaines
*  param: double deviationMoyenne
*  return double metriqueSimilitue
 */
 public static double Similarite ( double resultat){
     double metrique= Math.exp(-resultat/(2*23*23));


     return metrique;
 }

}
