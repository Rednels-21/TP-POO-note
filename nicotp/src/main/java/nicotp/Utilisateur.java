package nicotp;

import java.util.List;

public class Utilisateur implements Destinataire {
	private List<ServeurDiscussion> serveurs;
	private String prenom;
	private String nom;
	private String login;
	private String motDePasse;
	private String mail;
	
	public Utilisateur() {}
}
