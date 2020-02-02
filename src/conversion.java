import java.util.ArrayList;

public class conversion {

        /* Name : findAcides
        *  Description : trouve l'acideAmines correspondant
        *  au codon entree
        *  params: codon : la chaine de nucleoitide
        *  return resultats : l'acideAmines
         */

        public static acideAmines findAcides(String codon){
            acideAmines resultat= null;
            for (acideAmines acide : acideAmines.values()){
                if (acide.isType(codon))
                    resultat = acide;
            }
            return resultat;
        }

        public static ArrayList <String> nuclotideCodon (String chaineCaractere){
            ArrayList <String> listeCodon = new ArrayList<String>();
            for (int i =0; i < (chaineCaractere.length()/3); i ++){
                listeCodon.add(chaineCaractere.substring(i,i+3));
            }
            return listeCodon;
        }
        public static ArrayList <acideAmines> codonAcideAmine (ArrayList <String> codons){
            ArrayList <acideAmines> acideAmines = new ArrayList<acideAmines>();
            for ( int i = 0; i < codons.size(); i++){
               acideAmines.add(findAcides(codons.get(i)));

            }
            return acideAmines;
        }
}
