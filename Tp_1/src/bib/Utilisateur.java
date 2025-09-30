package bib;

public abstract class Utilisateur {
	protected String nom;
	 protected String prenom;
	 protected String numeroId;
	 protected Livre[] livresEmpruntes;
	 protected int nombreEmprunts;
	// TODO : Constructeur, getters, setters
	 public Utilisateur (String nom ,String prenom,String numeroId,Livre[] livresEmprunte,int nombreEmprunts)
	 {
		 this.nom=nom;
		 this.prenom = prenom;
		 this.numeroId = numeroId;
		 this.livresEmpruntes = new Livre[10]; 
		 this.nombreEmprunts = 0;
	 }
		 public String getNom() {
		        return nom;
		    }

		    public String getPrenom() {
		        return prenom;
		    }

		    public String getNumeroId() {
		        return numeroId;
		    }
		    public void getUtilisateur(String nom, String prenom, String numeroId) {
		        this.nom = nom;
		        this.prenom = prenom;
		        this.numeroId = numeroId;
		    }
		 // Méthode abstraite - chaque type d'utilisateur aura sa propre règle
		    public abstract boolean peutEmprunter();
		    public abstract int getLimiteEmprunt();
}
