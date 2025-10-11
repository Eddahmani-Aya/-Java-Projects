package coditionnelle;
/*Exercice 4 :
Créez une constante représentant le nombre maximum d’utilisateurs autorisés dans une application. Écrivez un programme qui compare le nombre actuel
d’utilisateurs avec cette constante et affiche un message approprié.
*/
import java.util.Scanner;
public class EX4_nbrmax {
	public static void main (String[] args) {
		int nbr_max=10;
		Scanner input =new Scanner(System.in);
		System.out.print("Entrer le nombre actuel d’utilisateurs :");
		int nbr= input.nextInt();
		if(nbr>nbr_max) {
			System.out.println("Erreur: le nombre d'utilisateurs dépasse le maximum autorisé !");
		}else if(nbr==nbr_max) {
			System.out.println("Nombre maximum d’utilisateurs atteint.");
		}else {
			System.out.println("On peut accepter de nouveaux utilisateurs.");
		}
		input.close();
	}
}
