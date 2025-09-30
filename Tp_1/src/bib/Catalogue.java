package bib;

public class Catalogue {
	private Livre[] livres;
    private int nombreLivres;
    private static final int TAILLE_MAX = 100;

    // TODO 2.1 : Constructeur qui initialise le tableau
    public Catalogue() {
        this.livres = new Livre[TAILLE_MAX];
        this.nombreLivres = 0;
    }
    // TODO 2.2 : Méthode pour ajouter un livre
    public boolean ajouterLivre(Livre livre) {
    	
    	if (nombreLivres < TAILLE_MAX) {
			livres[nombreLivres] = livre;
			nombreLivres++;
			return true;
    	} 
    	else 
    		return false;
    }
    	// TODO 2.3 : Surcharge - Rechercher par titre
    	 public  Livre rechercher(String titre) {
    		 for(int i=0;i<=nombreLivres;i++)
    		 {
    			 if (livres[i].getTitre().equals(titre)) {
    	                return livres[i];
    	            }
    	        }
    	        return null;
        
    	 }
    	// TODO 2.4 : Surcharge - Rechercher par titre et auteur
    	 public  Livre rechercher(String titre, String auteur) {
    		 for(int i=0;i<=nombreLivres;i++)
    		 {
    			 if (livres[i].getTitre().equals(titre) && livres[i].getAuteur().equals(auteur)) {
    	                return livres[i];
    	            }
    	     }
    	        return null;
        
    	 }
    	// TODO 2.5 : Rechercher par année
    	 public Livre[] rechercher(int anneePublication) {
    		 int count = 0;
    		 for(int i=0;i<=nombreLivres;i++)
    		 {
    			 if (livres[i].getAnneePublication()==anneePublication ) {
    	               count++;
    	            }
    	     }
    		 Livre[] Nlivre = new Livre[count];
    	        int n = 0;
    	        for (int i = 0; i < nombreLivres; i++) {
    	            if (livres[i].getAnneePublication() == anneePublication) {
    	            	Nlivre[n] = livres[i];
    	                n++;
    	            }
    	        }
    	        return Nlivre;
    		 // Retourner un tableau de tous les livres de cette année
    		 // Utiliser une boucle pour compter d'abord, puis créer le tableau
    		 }
    	// TODO 2.6 : Afficher les livres disponibles
    	public void afficherLivresDisponibles() {
    		System.out.println("=== Livres disponibles ===");
    		for (Livre livre : livres) {
    			if (livre != null && livre.isDisponible()) {
    				System.out.println(livre);
    	            }
    	        }
    	    }


}
