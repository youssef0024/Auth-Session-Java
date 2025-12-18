import controller.MainController;
import java.util.Scanner;
import java.util.UUID;

public class Main {
    public static void main(String[] args) {
        MainController ctrl = new MainController();
        Scanner sc = new Scanner(System.in);
        UUID currentToken = null;

        while(true) {
            System.out.println("\n[Moi: " + ctrl.quiEstConnecte(currentToken) + "]");
            System.out.print("1.Login 2.Voir 3.Modifier 4.Exit > ");
            int choix = sc.nextInt();
            sc.nextLine();

            if(choix == 1) {
                System.out.print("Nom: "); String n = sc.nextLine();
                System.out.print("Pass: "); String p = sc.nextLine();
                currentToken = ctrl.authentifier(n, p);
            } else if(choix == 2) {
                ctrl.afficherTout();
            } else if(choix == 3) {
                System.out.print("Nouveau 'a': ");
                int v = sc.nextInt();
                System.out.println(ctrl.changerA(currentToken, String.valueOf(v)));
            } else {
                break;
            }
        }
    }
}