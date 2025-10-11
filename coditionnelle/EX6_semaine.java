package coditionnelle;
/*Exercice 6 :
Utilisez une structure switch pour afficher un message en fonction du jour de
la semaine (Lundi, Mardi, Mercredi, etc.).
*/
import java.util.Scanner;
public class EX6_semaine {
	public static void main (String[] args) {
		Scanner input=new Scanner(System.in);
		System.out.print("Entrer jour de la semaine");
		String jour = input.next();
		switch(jour){
			case "Lundi" :
				System.out.println("1er jour de semain .");
				break;
			case "Mardi" :
				System.out.println("2eme jour de semain .");
				break;
			case "Mercredi" :
				System.out.println("3eme jour de semain .");
				break;
			case "Jeudi" :
				System.out.println("4eme jour de semain .");
				break;
			case "Vendredi" :
				System.out.println("5eme jour de semain .");
				break;
			case "Samedi" :
				System.out.println("6eme jour de semain .");
				break;
			case "Dimanche" :
				System.out.println("7eme jour de semain .");
				break;
			default:
				System.out.println("erreur");
				break;
		}
		input.close();
	}

}
