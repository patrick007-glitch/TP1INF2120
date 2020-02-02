import java.util.ArrayList;

public enum acideAmines {

    Alanine("Ala", new String[]{"GCU", "GCC", "GCA","GCG"}),
    Arginine("Arg", new String[]{"CGU", "CGC", "CGA", "CGG", "AGA", "AGG"}),
    Asparagine("Asn",new String[]{"AAU","AAC"}) ,
    Aspartate("Asp",new String[] {"GAU","GAC"}),
    Cysteine ("Cys", new String[]{"UGU","UGC"}),
    Glutamate("Glu",new String[]{"AUU","AUC","AUA"}),
    Glutamine("Gln",new String[] {"CAA","CAG"}),
    Glycine("Gly", new String[] {"GGU", "GGC","GGA","GGG"}),
    Histidine("His", new String[]{"CAU","CAC"}),
    Isoleucine ("ILe",new String[]{"CAU","CAC"}),
    Leucine("Leu",new String[]{"UUA","UUG","CUU","CUC","CUA","CUG"}),
    Lysine("Lys",new String[]{"AAA","AAG"}),
    Methionine("Met",new String[]{"AUG"}),
    Phenylalanine("Phe",new String[]{"UUU","UUC"}),
    Proline("Pro",new String[]{"CCU","CCC","CCA","CCG"}),
    Pyrrolysine("Pyl",new String[]{"UAG"}),
    Selenocysteine("Sec",new String[]{"UGA"}),
    Serine("Ser",new String[]{"UCU","UCC","UCA","UCG","AGU","AGC"}),
    Threonine("Thr",new String[]{"ACU","ACC","ACA","ACG"}),
    Tryptophane("Trp",new String[]{"UGG"}),
    Tyrosine("Tyr",new String[]{"UAU","UAC"}),
    Valine("Val",new String[]{"GUU","GUC","GUA","GUG"}),
    Marqueur("Fin",new String[]{"UAA"});


    //attributs d'instance


    private String abreviation;
    private String [] composition;


     //Constructeur

    private acideAmines(String abreviation, String[] composition){
        this.abreviation = abreviation;
        this.composition = composition;

    }

    //getter

    public String[] getComposition() {
        return composition;
    }
    public String getAbreviation(){
        return abreviation;
    }

    //autres methode public
    public boolean isType(String ARN){
        boolean result = false;
        for (int i = 0; i < composition.length; i++){
            if (composition[i].equals(ARN))
                result = true;
        }
        return result;

    }
}
