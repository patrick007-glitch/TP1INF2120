import java.util.ArrayList;




public class conversion {

        /**
         * Cette methode sert a trouver l'acide amine auxquels correspond le codon passer en param.
         *
        *  Cette methode trouve l'acideAmines correspondant au 3 lettre composant le codon passe
         *  en parametre et retourne cette acide amine.
        *  @param codon la chaine de 3 lettres representant des nucleoitides
        *  @return resultats retourne le nom de l'acideAmines representer par les lettres composant le codon
         */
        public static AcideAmines findAcides(String codon){
            AcideAmines resultat = null;
            for (AcideAmines acide : AcideAmines.values()){
                if (acide.isType(codon))
                    resultat = acide;
            }
            return resultat;
        }

        /**
         * Cette methode transforme une liste de lettre en des groupements de 3 lettre aussi appeler codon.
         *
         * Cette methode prend en parametre une chaine de charactere saisi par l'utilisateur et la transforme,
         * en groupant les lettres en paquet de 3 dans un nouvel ArrayList. Chaque case
         *  de cette nouvelle liste contient 3 lettre A,C,G,U qui represente un acide amine.
         *
         * @param chaineCaractere les lettres qui composent le nucleotide (A,C,G,U)
         * @return listeCodon une liste des condoms contenu dans le nucleotide donner en parametre
         */

        public static ArrayList <String> nuclotideCodon (String chaineCaractere){
            ArrayList <String> listeCodon = new ArrayList<String>();
            for (int i =0; i < (chaineCaractere.length()/3); i ++){
                listeCodon.add(chaineCaractere.substring((i*3),(i*3)+3));
            }
            return listeCodon;
        }

        /**
         * Cette methode sert a composer une liste des acides amines a partir d'une liste de condon.
         *
         * Cette methode prend un ArrayList contenant des condoms en parametre puis trouve chaque
         * acide amine correspondant a chaque codon et forme une nouvelle liste de ces acides.
         * Cette nouvelle liste d'acide est retourner par la methode.
         *
         * @param codons un ArrayList avec un codom(groupement de 3 nucleotide) dans chaque case
         * @return une liste des acides representant la liste de condoms passes en param.
         */

        public static ArrayList <AcideAmines> codonAcideAmine (ArrayList <String> codons){
            ArrayList <AcideAmines> acideAmines = new ArrayList<AcideAmines>();
            for ( int i = 0; i < codons.size(); i++){
               acideAmines.add(findAcides(codons.get(i)));
            }
            return acideAmines;
        }
}
