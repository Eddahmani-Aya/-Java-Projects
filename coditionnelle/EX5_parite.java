package coditionnelle;
/*Exercice 5 :
Écrivez un programme qui demande à l’utilisateur d’entrer un nombre, et affiche
un message si le nombre est pair ou impair.
*/
import java.util.Scanner;
public class EX5_parite {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.print("Entrer un nombre reel:");
		int nbr=input.nextInt();
		if(nbr%2==0) {
			System.out.println("Ce nombre est pair");
		}else {
			System.out.println("Ce nombre est impair");
		}
		input.close();
	}

}
