import java.util.Scanner;

public class Main {

    public static final String MSGINTRO = "Bienvenwejfnwekhfbkhbtre programme";
    public static final String MSG_SOL_ARN1 = "Entrez oefhewjfbhaine d'ARN";
    public static final String MSG_SOL_ARN2 = "Entrez lasdvjnwejbme chaine d'ARN";
    public static final String MSG_SOL_DISTMAX = "Entresahfaschbees acides amines";

    public static void main(String[] args) {
        Saisie();



    }
    public static void Saisie() {
        System.out.print(MSGINTRO);
        Scanner sc = new Scanner(System.in);

        System.out.print(MSG_SOL_ARN1 );
        String a1 = sc.next();

        System.out.print(MSG_SOL_ARN2 );
        String a2 = sc.next();

        System.out.print(MSG_SOL_DISTMAX );
        int n = sc.nextInt();

        sc.close();
    }
}
