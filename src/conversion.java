import java.util.ArrayList;

/**
 * Contient les methodes qui vont construire un Arraylist d'acides amines a partir d'une chaine d'ARN.
 */
public class conversion {

        /**
         * Sert a trouver l'acide amine auxquels correspond le codon passer en param.
         *
         * Trouve l'acideAmines correspondant au 3 lettre composant le codon passer
         * en parametre et retourne cette acide amine.
         *
         * @param codon la chaine de 3 lettres representant des nucleoitides
         * @return resultats retourne le nom de l'acideAmines representer par les lettres composant le codon
         */
        public static acideAmines findAcides( String codon ){
            acideAmines resultat = null;
            for ( acideAmines acide : acideAmines.values() ){
                if (acide.isType( codon ))
                    resultat = acide;
            }
            return resultat;
        }

        /**
         * Cette methode transforme une liste de charactere en des groupements de 3 charactere aussi appeler codon.
         *
         * Cette methode prend en parametre une chaine de charactere et la transforme,
         * en groupant les lettres en paquet de 3, dans un nouvel ArrayList. Chaque case
         *  de cette nouvelle liste contient 3 lettres A,C,G,U qui represente un acide amine.
         *
         * @param chaineCaractere les lettres qui composent le nucleotide (A,C,G,U)
         * @return listeCodon une liste des codons contenu dans le nucleotide donner en parametre
         */
        public static ArrayList <String> nuclotideCodon ( String chaineCaractere ){
            ArrayList <String> listeCodon = new ArrayList<String>();
            for ( int i = 0; i < ( chaineCaractere.length()/3 ); i ++){
                listeCodon.add(chaineCaractere.substring( i, i + 3 ));
            }
            return listeCodon;
        }

        /**
         * Cette methode sert a composer une liste des acides amines a partir d'une liste de condon.
         *
         * Cette methode prend un ArrayList contenant des codons en parametre puis trouve chaque
         * acide amine correspondant a chaque codon et forme un nouvel Arraylist contenant ces acides.
         * Cette nouvelle liste d'acide est retourner par la methode.
         *
         * @param codons un ArrayList avec un codom(groupement de 3 nucleotides) dans chaque case.
         * @return un Arraylist des acides representant la liste de codons passes en param.
         */
        public static ArrayList <acideAmines> codonAcideAmine ( ArrayList <String> codons ){
            ArrayList <acideAmines> acideAmines = new ArrayList<acideAmines>();
            for ( int i = 0; i < codons.size(); i++ ){
               acideAmines.add( findAcides( codons.get( i )));

            }
            return acideAmines;
        }
}
