import dao.EtuDao;
import metier.EtuMet;
import presentation.IPreEtu;
import presentation.PreEtu;

import java.util.Scanner;
public class SimiEtu {


        static Scanner clavier = new Scanner(System.in);
        static IPreEtu PreEtu;

        private static boolean estUnNombre(String input){
            try {
                Integer.parseInt(input);
                return true;
            }
            catch (Exception e ){
                return false;
            }
        }

        public static void test1(){
            // instanciation des différents compsants de l'application
            var dao = new EtuDao();
            var metier = new EtuMet();
            var controleur = new PreEtu();
            // injection des dépendances
            metier.setEtuDao(dao);
            controleur.setEtuMet(metier);
            // tester
            String rep = "";
            do {
                System.out.println("=> [Test 1] calcule de Mensualité de cédit <= \n");
                try {
                    String input = "";
                    while (true){
                        System.out.println("=> Entrez l'id du crédit : ");
                        input = clavier.nextLine();
                        if (estUnNombre(input)) break;
                        System.err.println("Entrée non valide !!!");
                    }
                    long id = Long.parseLong(input);
                    controleur.afficher_Moyenne(id);
                } catch (Exception e) {
                    System.err.println(e.getMessage());
                }
                System.out.println("Voulez vous quittez (oui/non) ? ");
                rep = clavier.nextLine();
            }while (!rep.equalsIgnoreCase("oui"));
            System.out.println("Au revoir ^_^");
        }





        public static void main(String[] args) throws Exception {
            test1();
        }

}
