package table;
/*Exercice 1 :
Déclarez un tableau de 10 entiers et initialisez-le avec les valeurs de 1 à 10.
Calculez et affichez la somme de ses éléments.*/
public class EX1_t_sum {
	 public static void main(String[] args) {
	        int[] tableau = {1,2,3,4,5,6,7,8,9,10};
	        int somme = 0;

	        for (int i = 0; i < tableau.length; i++) {
	            somme += tableau[i];
	        }

	        System.out.println("La somme des éléments est : " + somme);
	    }
}
