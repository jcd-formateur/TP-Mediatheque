package mediatheque;

public abstract class Document {
	
	
	private int identifiant;
	private String titre;

	
	public Document(int identifiant, String titre) {
		this.identifiant = identifiant;
		this.titre = titre;
	}
	
	
	public int getIdentifiant() {
		return identifiant;
	}
	public void setIdentifiant(int identifiant) {
		this.identifiant = identifiant;
	}
	public String getTitre() {
		return titre;
	}
	public void setTitre(String titre) {
		this.titre = titre;
	}
	

	public abstract int getNombreJourEmprunt();

	@Override
	public String toString() {
		return "Document{" +
				"identifiant=" + identifiant +
				", titre='" + titre + '\'' +
				'}';
	}

	public abstract int getNombreJoursEmprunt();
}
