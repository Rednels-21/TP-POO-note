package nicotp;

import java.util.List;

public class Utilisateur implements Destinataire {
	private List<ServeurDiscussion> serveurs;
	private String prenom;
	private String nom;
	private String login;
	private String motDePasse;
	
	public List<ServeurDiscussion> getServeurs() {
		return serveurs;
	}

	public void setServeurs(List<ServeurDiscussion> serveurs) {
		this.serveurs = serveurs;
	}

	private String mail;
	
	public Utilisateur() {}
}
