public class ARN {
    protected String arn;
    public String arn(String chaine) {
        int i = 0;
        while (i < chaine.length()) {
            if (arnValide( arn ))
                this.arn = chaine;
        }
    }
        public boolean arnValide (String arn) {
            boolean valide = false;
            int i = 0;
            while ( i < arn.length() ) {
                if (arn.charAt(i).equals('A') || arn.charAt(i).equals('C') || arn.charAt(i).equals('G') || arn.charAt(i).equals('U'))
                    valide = true;
            }
            return valide;
        }

        }

}
