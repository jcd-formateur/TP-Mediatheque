package mediatheque;

public class CdAudio extends Document {


	
	private String compositeur;
	private String interprete;
	
	public CdAudio(int identifiant, String titre, String compositeur, String interprete) {
		super(identifiant, titre);
		this.compositeur = compositeur;
		this.interprete = interprete;
	}
	

	public String getCompositeur() {
		return compositeur;
	}

	public void setCompositeur(String compositeur) {
		this.compositeur = compositeur;
	}

	public String getInterprete() {
		return interprete;
	}

	public void setInterprete(String interprete) {
		this.interprete = interprete;
	}
	
	
	public int getNombreJourEmprunt() {
		return 15;
	}

	@Override
	public String toString() {
		return "CdAudio{" +
				"compositeur='" + compositeur + '\'' +
				", interprete='" + interprete + '\'' +
				"} " + super.toString();
	}

	public int getNombreJoursEmprunt(){
		return 15;
	}
}
