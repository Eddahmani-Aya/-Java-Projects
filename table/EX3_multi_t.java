package table;
/*Exercice 3 :
Déclarez un tableau multidimensionnel représentant une grille de 3x3, initialisezle avec des valeurs entières, puis affichez la somme de chaque ligne.*/
public class EX3_multi_t {
	public static void main(String[] args) {
        int[][] Grille = {
                {0,1,2},
                {3,4,5},
                {6,7,8},
        };
        int j;
        for(int i=0;i<Grille.length;i++) {
            int S=0;
            for(j=0;j<Grille.length;j++) {
                S=S+Grille[i][j];
            }
            System.out.println("Somme de la ligne " + (i + 1) + " : " + S);
        }
	}

}
