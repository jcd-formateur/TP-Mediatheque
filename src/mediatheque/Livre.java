package mediatheque;

public class Livre extends Document {
	
	private String auteur;


	public Livre(int identifiant, String titre, String auteur ) {
		super(identifiant, titre);
		this.auteur = auteur;
	}

	public String getAuteur() {
		return auteur;
	}

	public void setAuteur(String auteur) {
		this.auteur = auteur;
	}
	
	public int getNombreJourEmprunt() {
		return 10;
	}
	
}
