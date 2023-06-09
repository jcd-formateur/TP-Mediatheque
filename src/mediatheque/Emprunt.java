package mediatheque;

import java.time.LocalDate;

public class Emprunt {
	
	private LocalDate dateEmprunt;
	private Adherent adherent;
	private Document document;
	
	public Emprunt() {
		dateEmprunt = LocalDate.now();
	}
	public Emprunt(Adherent adherent, Document document) {
		this();
		this.adherent = adherent;
		this.document = document;
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


	@Override
	public String toString() {
		return "Emprunt{" +
				"dateEmprunt=" + dateEmprunt +
				", adherent=" + adherent +
				", document=" + document +
				'}';
	}
}
