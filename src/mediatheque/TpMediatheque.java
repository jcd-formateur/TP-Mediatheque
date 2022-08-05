package mediatheque;


public class TpMediatheque {
	
	/*
	 *  TODO:
	   		Emprunter
			Rendre
			Rechercher
			Signaler Retard
	 */

	public static void main(String[] args) {

		System.out.println("Logiciel de Médiathèque");
		
		
		Mediatheque mediatheque = new Mediatheque();
		
		Adherent alain = mediatheque.addAdherent("Alain", "Delon", "alain@delon.fr");
		mediatheque.addAdherent("Jean-Paul", "Belmondo", "jp@bebel.fr");
		mediatheque.addAdherent("Marylin", "Monroe", "mary@monroe.fr");
		
		Livre java = mediatheque.addLivre("Java pour les Nuls", "JCD");
		mediatheque.addLivre("La Bible", "Anonyme");
		mediatheque.addLivre("Apprendre le C++", "Mickael Johns");
		
		
		mediatheque.enregistrerEmprunt(alain, java);
		
		//Livre livre1 = new Livre
	}
}
