package mediatheque;

public abstract class Document {
	
	
	private String identifiant;
	private String titre;
	
	
	public String getIdentifiant() {
		return identifiant;
	}
	public void setIdentifiant(String identifiant) {
		this.identifiant = identifiant;
	}
	public String getTitre() {
		return titre;
	}
	public void setTitre(String titre) {
		this.titre = titre;
	}
	

	public abstract int getNombreJourEmprunt();

}
