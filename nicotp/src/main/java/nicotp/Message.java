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
}
