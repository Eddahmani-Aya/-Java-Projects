package coditionnelle;
/*Déclarez une constante pour le taux de TVA (par exemple, final double TVA
= 0.2;) et écrivez un programme qui calcule le prix TTC d’un produit en fonction
de son prix HT.Prix TTC=Prix HT+(Prix HT×TVA)*/
import java.util.Scanner;
public class EX3_TVA {
	public static void main(String[] args) {
		final double TVA= 0.2;
		Scanner input= new Scanner(System.in);
		System.out.println("Entrer HT:");
		double HT=input.nextDouble();
		double TTC = (HT*TVA)+HT;
		System.out.println("Le prix TTC est:"+TTC);
		input.close();
	}
}
