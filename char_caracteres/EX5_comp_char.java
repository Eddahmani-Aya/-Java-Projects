package char_caracteres;
import java.util.Scanner;
public class EX5_comp_char {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Entrez une chaîne de caractères : ");
        String chaine = input.nextLine();

        System.out.print("Entrez un caractère : ");
        char caractere = input.next().charAt(0);

        int compteur = 0;
        for (int i = 0; i < chaine.length(); i++) {
            if (chaine.charAt(i) == caractere) {
                compteur++;
            }
        }

        System.out.println("Le caractère '" + caractere + "' apparaît " + compteur + " fois.");

        input.close();
    }

}
