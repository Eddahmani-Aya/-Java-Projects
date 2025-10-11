package coditionnelle;
import java.util.Scanner;
//Exercice 2 :Déclarez une variable boolean pour indiquer si une porte est ouverte (true) oufermée (false), puis affichez le message correspondant.
public class EX2_porte {
	public static void main(String[] args)
	{
		Scanner input = new Scanner(System.in);
		System.out.println("Entrer si une porte est ouverte ou fermée  (true/false)");
		Boolean port = input.nextBoolean();
		if(port)
		{
			System.out.println("ouverte");
		}
		else
		{
			System.out.println("fermee");
		}
		input.close();
	}

}
