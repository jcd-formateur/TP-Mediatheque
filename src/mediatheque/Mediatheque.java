package mediatheque;

import java.util.ArrayList;
import java.util.List;

public class Mediatheque {

	
	private List<Document> documents = new ArrayList<>();
	private List<Livre> livres = new ArrayList<>();
	private List<CdAudio> disques = new ArrayList<>();
	
	
	
	public List<Document> getDocuments() {
		return documents;
	}
	public void setDocuments(List<Document> documents) {
		this.documents = documents;
	}
	public List<Livre> getLivres() {
		return livres;
	}
	public void setLivres(List<Livre> livres) {
		this.livres = livres;
	}
	public List<CdAudio> getDisques() {
		return disques;
	}
	public void setDisques(List<CdAudio> disques) {
		this.disques = disques;
	}
	
	
}
