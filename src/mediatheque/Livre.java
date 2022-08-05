package mediatheque;

public class Livre extends Document {
	
	private String auteur;

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
