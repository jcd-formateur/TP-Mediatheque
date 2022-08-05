package mediatheque;

import java.time.LocalDate;

public class Emprunt {
	
	private LocalDate dateEmprunt;
	private Adherent adherent;
	private Document document;
	
	public Emprunt() {
	}
	public Emprunt(Adherent adherent, Document document) {
		this.adherent = adherent;
		this.document = document;
		dateEmprunt = LocalDate.now();
	}

	public LocalDate getDateEmprunt() {
		return dateEmprunt;
	}
	public void setDateEmprunt(LocalDate dateEmprunt) {
		this.dateEmprunt = dateEmprunt;
	}
	public Adherent getAdherent() {
		return adherent;
	}
	public void setAdherent(Adherent adherent) {
		this.adherent = adherent;
	}
	public Document getDocument() {
		return document;
	}
	public void setDocument(Document document) {
		this.document = document;
	}
	
	
	

}
