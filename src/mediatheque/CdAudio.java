package mediatheque;

public class CdAudio extends Document {


	
	private String compositeur;
	private String interprete;
	

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
	
}
