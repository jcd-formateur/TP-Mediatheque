package mediatheque;

import java.util.ArrayList;
import java.util.List;

public class Adherent {

	
	private int identifiant;
	private String prenom;
	private String nom;
	private String email;
	
	private List<Emprunt> emprunts = new ArrayList<>();
	
	
	public Adherent() {
		
	}
	
	public Adherent(int identifiant, String prenom, String nom, String email) {
		this.identifiant = identifiant;
		this.prenom = prenom;
		this.nom = nom;
		this.email = email;
	}
	
	public int getIdentifiant() {
		return identifiant;
	}
	public void setIdentifiant(int identifiant) {
		this.identifiant = identifiant;
	}
	public String getPrenom() {
		return prenom;
	}
	public void setPrenom(String prenom) {
		this.prenom = prenom;
	}
	public String getNom() {
		return nom;
	}
	public void setNom(String nom) {
		this.nom = nom;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}

	
	public List<Emprunt> getEmprunts() {
		return emprunts;
	}

	public void setEmprunts(List<Emprunt> emprunts) {
		this.emprunts = emprunts;
	}
	
	public void addEmprunt(Emprunt emprunt) {
		emprunts.add(emprunt);
	}

	public void listerEmprunts(){
		for(Emprunt emprunt : emprunts){
			System.out.println(emprunt.getDateEmprunt()+" "+emprunt.getDocument());
		}
	}
	@Override
	public String toString() {
		return "Adherent{" +
				"identifiant=" + identifiant +
				", prenom='" + prenom + '\'' +
				", nom='" + nom + '\'' +
				", email='" + email + '\'' +
				", Nombre emprunts=" + emprunts.size() +
				'}';
	}
}
