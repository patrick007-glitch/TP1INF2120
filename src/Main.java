import java.util.ArrayList;
import java.util.Scanner;
/*
*Description:
* Auteur: Jean-Michel Landry, Patrick Chalifour
* Code Permanent: LANJ09049206
* courriels:
* Date de mise a jour : 30 Janvier 2020
*/
public class Main {

    public static final String MSGINTRO = "Bienvenue dans le programme\n\n";
    public static final String MSG_SOL_ARN1 = "Entrez premiere chaine d'ARN";
    public static final String MSG_SOL_ARN2 = "Entrez deuxieme chaine d'ARN";
    public static final String MSG_SOL_DISTMAX = "Entrez distance max d'acides amines";



    static ArrayList <acideAmines> chaineAcide1;
    static ArrayList <acideAmines> chaineAcide2;

    public static void main(String[] args) {
        System.out.print(MSGINTRO);


        Scanner sc = new Scanner(System.in);
        //Saisie des chainesARN par l'utilisateurs et distances Max a considerer

        //chaine1
        System.out.print(MSG_SOL_ARN1);
        String chaine1 = sc.next();
        chaineAcide1 = conversion.codonAcideAmine
                (conversion.nuclotideCodon(chaine1));
        //chaine2
        System.out.print(MSG_SOL_ARN2);
        String chaine2 = sc.next();
        chaineAcide2 = conversion.codonAcideAmine
                (conversion.nuclotideCodon(chaine2));
        //distance
        System.out.print(MSG_SOL_DISTMAX);
        int distance = sc.nextInt();

        sc.close();
        double metrique = calcul.Similarite(calcul.calculDeviationMinimal
                (chaineAcide1,chaineAcide2,distance));
        System.out.println("Resultat:" + metrique);
        for (int i = 0; i < chaineAcide1.size(); i++) {
            System.out.println(chaineAcide1.get(i));
        }
        for (int i = 0; i < chaineAcide2.size(); i++){
        System.out.println(chaineAcide2.get(i));
        }
    }


}
