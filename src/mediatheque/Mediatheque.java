package mediatheque;

import java.util.ArrayList;
import java.util.List;
import java.time.LocalDate;

public class Mediatheque {

	/*************************** attributs *******************************************/
	private int prochainIdentifiantDocument = 0;
	private int prochainIdentifiantAdherent = 0;
	
	private List<Document> documents = new ArrayList<>();
	private List<Livre> livres = new ArrayList<>();
	private List<CdAudio> disques = new ArrayList<>();
	
	private List<Emprunt> emprunts = new ArrayList<>();
	
	private List<Adherent> adherents = new ArrayList<>();

	/*************************** méthodes : documents *******************************************/
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

	public Livre addLivre(String titre, String auteur) {

		Livre livre = new Livre(prochainIdentifiantDocument, titre, auteur);

		addDocument(livre);
		livres.add(livre);

		return livre;
	}

	public CdAudio addCdAudio(String titre, String compositeur, String interprete) {

		CdAudio cd = new CdAudio(prochainIdentifiantDocument,titre, compositeur, interprete );

		addDocument(cd);
		disques.add(cd);

		return cd;
	}
	public void addDocument(Document d) {
		prochainIdentifiantDocument++;
		documents.add(d);
	}

	public void listerLesDocuments(){
		for(Document document : documents){
			System.out.println(document);
		}
	}

	public Document recherche(String titre){
		for(Document doc : documents){
			if(doc.getTitre().equals(titre)){
				return doc;
			}
		}
		return null;
	}
	/*************************** méthodes : adhérents *******************************************/
	public Adherent addAdherent(String prenom, String nom, String email) {
		prochainIdentifiantAdherent++;
		Adherent adherent = new Adherent(prochainIdentifiantAdherent, prenom, nom,  email);
		adherents.add(adherent);
		return adherent;
	}

	/*************************** méthodes : emprunts *******************************************/

	public boolean enregistrerEmprunt(Adherent adherent, Document document) {

		if(isDejaEmprunte(document))
			return false;
		if(isQuotaDocumentsAtteint(adherent))
			return false;

		Emprunt emprunt = new Emprunt();
		emprunt.setAdherent(adherent);
		emprunt.setDocument(document);
		emprunts.add(emprunt);
		adherent.addEmprunt(emprunt);

		return true;
	}
	private boolean isDejaEmprunte(Document document){
		for(Emprunt emprunt : emprunts){
			if(emprunt.getDocument().equals(document))
				return true;
		}
		return false;
	}
	private boolean isQuotaDocumentsAtteint(Adherent adherent){
		if(adherent.getEmprunts().size() < 3)
			return false;
		else
			return true;
	}

	public void listerLesEmprunts(){
		for(Emprunt emprunt : emprunts){
			System.out.println(emprunt);
		}
	}

	public boolean rendreDocument(Adherent adherent, Document document){

		for(Emprunt emprunt : emprunts){
			if(emprunt.getDocument().equals(document)){
				emprunts.remove(emprunt);
				adherent.getEmprunts().remove(emprunt);
				return true;
			}
		}
		return false;
	}

	public void afficherRetards(){
		for(Emprunt emprunt : emprunts){
			Document doc = emprunt.getDocument();
			if(emprunt.getDateEmprunt().plusDays(doc.getNombreJoursEmprunt()).isBefore(LocalDate.now())){
				System.out.println("RETARD pour le document suivant : "+emprunt);
			}
		}
	}

}
