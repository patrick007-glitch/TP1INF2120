public class ARN {
    protected String arn;
    public String arn(String chaine) {
        int i = 0;
        while (i < chaine.length()) {
            if (arnValide)
                this.arn = chaine;
        }
    }
        private boolean arnValide (String arn) {
            boolean valide = false;
            int i = 0;
            while ( i < arn.length() ) {
                if (arn[i].equals('A') || arn[i].equals('C') || arn[i].equals('G') || arn[i].equals('U'))
                    valide = true;
            }
            return valide;
        }

        }

}
