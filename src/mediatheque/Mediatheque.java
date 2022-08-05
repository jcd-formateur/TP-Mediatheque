package mediatheque;

import java.util.ArrayList;
import java.util.List;

public class Mediatheque {

	private int prochainIdentifiantDocument = 0;
	private int prochainIdentifiantÀdherent = 0;
	
	private List<Document> documents = new ArrayList<>();
	private List<Livre> livres = new ArrayList<>();
	private List<CdAudio> disques = new ArrayList<>();
	
	private List<Emprunt> emprunts = new ArrayList<>();
	
	private List<Adherent> adherents = new ArrayList<>();
	
	
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
	
	public Adherent addAdherent(String prenom, String nom, String email) {
		prochainIdentifiantÀdherent++;
		Adherent adherent = new Adherent(prochainIdentifiantÀdherent, prenom, nom,  email);
		adherents.add(adherent);
		return adherent;
	}
	
	public Livre addLivre(String titre, String auteur) {
		prochainIdentifiantDocument++;
		Livre livre = new Livre(prochainIdentifiantDocument, titre, auteur);
		documents.add(livre);
		livres.add(livre);
		return livre;
	}
	
	public void enregistrerEmprunt(Adherent adherent, Document document) {
		Emprunt emprunt = new Emprunt();
		emprunt.setAdherent(adherent);
		emprunt.setDocument(document);
		
		emprunts.add(emprunt);
		
		adherent.addEmprunt(emprunt);
	}
	
}
