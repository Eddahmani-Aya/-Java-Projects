package char_caracteres;

public class EX6_inverse_char {
	  public static String inverser(String texte) {
	        String inverse = "";
	        for (int i = texte.length() - 1; i >= 0; i--) {
	            inverse += texte.charAt(i);
	        }
	        return inverse;
	    }

	    // Programme principal
	    public static void main(String[] args) {
	        String mot = "Bonjour";
	        String resultat = inverser(mot);
	        System.out.println("Chaîne inversée : " + resultat);
	    }

}
