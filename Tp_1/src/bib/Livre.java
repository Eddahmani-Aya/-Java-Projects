package bib;

public class Livre {
	private String titre;
	 private String auteur;
	 private String isbn;
	 private String genre;
	 private boolean disponible;
	 private int anneePublication;
	// TODO 1.1 : Constructeur avec tous les paramètres
	 public Livre(String titre, String auteur, String isbn, String genre, int anneePublication) {
	        this.titre = titre;
	        this.auteur = auteur;
	        this.isbn = isbn;
	        this.genre = genre;
	        this.disponible = true;
	        this.anneePublication = anneePublication;
	    }
	 // TODO 1.2 : Getters et Setters
	    public String getTitre() {
	        return titre;
	    }

	    public String getAuteur() {
	        return auteur;
	    }

	    public String getIsbn() {
	        return isbn;
	    }

	    public String getGenre() {
	        return genre;
	    }


	    public boolean isDisponible() {
	        return disponible;
	    }


	    public int getAnneePublication() {
	        return anneePublication;
	    }
	    public void setLivre(String titre, String auteur, String isbn, String genre, int anneePublication, boolean disponible) {
	        this.titre = titre;
	        this.auteur = auteur;
	        this.isbn = isbn;
	        this.genre = genre;
	        this.anneePublication = anneePublication;
	        this.disponible = disponible;
	    }
	 // TODO 1.3 : Méthode toString()
	    public String toString() { 
	        return "Titre='" + titre +", Auteur='" + auteur +  ", ISBN='" + isbn + ", Genre='" + genre + ", Année=" + anneePublication + ", Disponible=" + (disponible ? "Oui" : "Non") ;
	    } 

	    // TODO 1.4 : Méthode emprunter() 
	    public boolean emprunter() {
	        if (disponible) {
	            disponible = false;
	            return true;
	        } else {
	            System.out.println("Le livre '" + titre + "' est déjà emprunté.");
	            return false;
	        }
	    }

	    // TODO 1.5 : Méthode retourner()
	    public void retourner() {
	        disponible = true;
	    }
}
