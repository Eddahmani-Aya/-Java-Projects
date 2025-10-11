package table;
/*Exercice 2 :
Créez un programme qui lit 5 noms de fruits entrés par l’utilisateur et les stocke
dans un tableau. Affichez ensuite la liste des fruits saisis.*/
import java.util.Scanner;
public class EX2_fruits {
	 public static void main(String[] args) {
	        Scanner input = new Scanner(System.in);
	        String[] fruits = new String[5];

	        for (int i = 0; i < fruits.length; i++) {
	            System.out.print("Entrez le fruit " + (i + 1) + " : ");
	            fruits[i] = input.nextLine();
	        }

	        System.out.println("\nListe des fruits saisis :");
	        for (int i = 0; i < fruits.length; i++) {
	            System.out.println("- " + fruits[i]);
	        }

	        input.close();
	    }

}
