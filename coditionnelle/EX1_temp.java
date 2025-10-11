package coditionnelle;
import java.util.Scanner;
public class EX1_temp {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.print("Entrez la température actuelle : ");
		float temperature = input.nextFloat();
		if (temperature > 25) {
			System.out.println("Il fait chaud !");
		} else {
			System.out.println("Il fait froid !");
		}
		input.close();
	    }
}
