package mediatheque;


import java.time.LocalDate;

public class TpMediatheque {

	/*
	 *  étape 1 : OK
	 *  étape 2 : OK
	 *  étape 3 : OK
	 */

	public static void main(String[] args) {

		/*--------------------------------  ETAPE 1 -------------------------------- */

		System.out.println("Logiciel de Médiathèque");
		Mediatheque mediatheque = new Mediatheque();

		/*************************** livres *******************************************/
		Livre java = mediatheque.addLivre("Java pour les Nuls", "JCD");
		Livre livre2 = mediatheque.addLivre("Apprendre le C++", "Mickael Johns");
		Livre livre3 = mediatheque.addLivre("Le rouge et le noir", "Stendhal");
		Livre livre4 = mediatheque.addLivre("Germinal", "Émile Zola");

		/*************************** audio *******************************************/
		CdAudio cd1 = mediatheque.addCdAudio("Best Of", "Serge Gainsbourg", "Vanessa Paradis");


		/*************************** AFFICHAGE *******************************************/
		mediatheque.listerLesDocuments();

		/*************************** Recherche *******************************************/
		Document rechercheJava = mediatheque.recherche("Java pour les Nuls");
		System.out.println(rechercheJava); // affiche le Livre Java
		Document rouge = mediatheque.recherche("Le rouge et le noir");
		System.out.println(rouge);         // affiche : null

		/*************************** Adherents *******************************************/
		Adherent alain = mediatheque.addAdherent("Alain", "Delon", "alain@delon.fr");
		mediatheque.addAdherent("Jean-Paul", "Belmondo", "jp@bebel.fr");
		mediatheque.addAdherent("Marylin", "Monroe", "mary@monroe.fr");

		/*************************** Emprunts *******************************************/
		mediatheque.enregistrerEmprunt(alain, java);
		mediatheque.listerLesEmprunts();


		/*--------------------------------  ETAPE 2 -------------------------------- */
		boolean empruntAccepte = mediatheque.enregistrerEmprunt(alain, java);
		System.out.println("Emprunt accepté : "+ empruntAccepte);
		mediatheque.listerLesEmprunts();

		mediatheque.enregistrerEmprunt(alain, livre2);

		mediatheque.enregistrerEmprunt(alain, livre3);

		empruntAccepte = mediatheque.enregistrerEmprunt(alain, livre4);
		System.out.println("4e Emprunt accepté : "+ empruntAccepte);
		mediatheque.listerLesEmprunts();

		boolean retourOK = mediatheque.rendreDocument(alain, livre3);
		System.out.println("retour livre 3 OK : "+retourOK);
		mediatheque.listerLesEmprunts();

		/*--------------------------------  ETAPE 3 -------------------------------- */
		System.out.println("Emprunts de Alain:");
		alain.listerEmprunts();

		Adherent marie = mediatheque.addAdherent("Marie", "Dupont", "marie@dupont.fr");
		mediatheque.enregistrerEmprunt(marie, livre4);
		marie.getEmprunts().get(0).setDateEmprunt(LocalDate.now().minusDays(20));
		mediatheque.listerLesEmprunts();

		mediatheque.afficherRetards();

	}
}
