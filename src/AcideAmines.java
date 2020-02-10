/**
 * Le type acideAmines sert a modeliser tous les acides amines possible a l'aide de leur nom complet, leur abreviation
 * ainsi que les chaines de 3 nucleotides(codon) qui peuvent composer ces acides amines.
 *
 * Cette classe sert a faciliter la creation de methode de comparaison entre 2 ARN saisi par l'utilisateur.
 */
public enum AcideAmines {

    Alanine("Ala", new String[]{ "GCU", "GCC", "GCA","GCG" } ),
    Arginine("Arg", new String[]{ "CGU", "CGC", "CGA", "CGG", "AGA", "AGG" } ),
    Asparagine("Asn", new String[]{ "AAU", "AAC" } ) ,
    Aspartate("Asp", new String[] { "GAU", "GAC" } ),
    Cysteine ("Cys", new String[]{ "UGU", "UGC" } ),
    Glutamate("Glu", new String[]{ "AUU", "AUC", "AUA" } ),
    Glutamine("Gln",new String[] {"CAA", "CAG" } ),
    Glycine("Gly", new String[] { "GGU", "GGC", "GGA", "GGG" } ),
    Histidine("His", new String[]{ "CAU", "CAC" } ),
    Isoleucine ("ILe", new String[]{ "CAU", "CAC" } ),
    Leucine("Leu", new String[]{ "UUA", "UUG", "CUU", "CUC", "CUA", "CUG" } ),
    Lysine("Lys", new String[]{ "AAA", "AAG" } ),
    Methionine("Met", new String[]{ "AUG" } ),
    Phenylalanine("Phe", new String[]{ "UUU", "UUC" } ),
    Proline("Pro", new String[]{ "CCU", "CCC", "CCA", "CCG" } ),
    Pyrrolysine("Pyl", new String[]{ "UAG" } ),
    Selenocysteine("Sec", new String[]{ "UGA" } ),
    Serine("Ser", new String[]{ "UCU", "UCC", "UCA", "UCG", "AGU", "AGC" } ),
    Threonine("Thr", new String[]{ "ACU", "ACC", "ACA", "ACG" } ),
    Tryptophane("Trp", new String[]{ "UGG" } ),
    Tyrosine("Tyr", new String[]{ "UAU", "UAC" } ),
    Valine("Val", new String[]{ "GUU", "GUC", "GUA", "GUG" } ),
    Marqueur("Fin", new String[]{ "UAA" } );


    //attributs d'instance

    private String abreviation;
    private String [] composition;


     //Constructeur

    /**
     *  Construit une instance d'un acide amine en fonction des strings
     *  passees en parametres.
     *
     * @param abreviation le nom court d'un acide amine.
     * @param composition un tableau contenant toutes les possibilites de
     *                    codons qui sont associe a un acide amine.
     */
    private AcideAmines(String abreviation, String[] composition ){
        this.abreviation = abreviation;
        this.composition = composition;
    }

    //getter

    /**
     * Retourne tous les codons qui peuvent composer un acide amine.
     *
     * @return un tableau de tous les codons qui composent un acide amine.
     */
    public String[] getComposition() {
        return composition;
    }


    /**
     * Retourne l'abreviation d'un acide amine.
     *
     * @return l'abreviation representant un acide amine
     */
    public String getAbreviation(){
        return abreviation;
    }

    //autres methode public

    /**
     * Verifie si un codon passee en parametre fait partie de la composition
     * d'un des acides amines.
     *
     * @param codon une chaine de 3 lettres representant une partie d'une
     *              chaine d'ARN.
     * @return resultat vrai si le codon fait partie de la composition d'une
     * chaine d'ARN.
     */
    public boolean estDeType( String codon ){
        boolean resultat = false;

        for ( int i = 0; i < composition.length; i++){
            if ( composition[ i ].equals( codon ))
                resultat = true;
        }

        return resultat;
    }
}
