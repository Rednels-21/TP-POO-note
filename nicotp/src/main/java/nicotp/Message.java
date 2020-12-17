package nicotp;

public class Message implements Destinataire {
	private Utilisateur auteur;
	private Destinataire destinataire;
	private String texte;
	
	public void setTexte(String string) {
		this.texte = string;
		
	}
	public String getTexte() {
		return texte;
	}

	public Utilisateur getAuteur() {
		return auteur;
	}
	
	public void setAuteur(Utilisateur auteur) {
		this.auteur = auteur;
	}
	
	public Destinataire getDestinataire() {
		return destinataire;
	}
	
	public void setDestinataire(Destinataire destinataire) {
		this.destinataire = destinataire;
	}

}
