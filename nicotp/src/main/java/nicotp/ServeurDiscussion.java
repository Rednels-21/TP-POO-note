package nicotp;

import java.util.List;
import java.util.Map;

public class ServeurDiscussion {
	private Map<Role,List<Utilisateur>> mapping_role_utilisateurs;
	private List<Canal> canaux;
	private String nom;
	private Map<Role,List<Habilitation>> mapping_role_habilitations;
	
	public ServeurDiscussion() {}

	public Map<Role, List<Utilisateur>> getMapping_role_utilisateurs() {
		return mapping_role_utilisateurs;
	}

	public void setMapping_role_utilisateurs(Map<Role, List<Utilisateur>> mapping_role_utilisateurs) {
		this.mapping_role_utilisateurs = mapping_role_utilisateurs;
	}

	public List<Canal> getCanaux() {
		return canaux;
	}

	public void setCanaux(List<Canal> canaux) {
		this.canaux = canaux;
	}

	public String getNom() {
		return nom;
	}

	public void setNom(String nom) {
		this.nom = nom;
	}

	public Map<Role, List<Habilitation>> getMapping_role_habilitations() {
		return mapping_role_habilitations;
	}

	public void setMapping_role_habilitations(Map<Role, List<Habilitation>> mapping_role_habilitations) {
		this.mapping_role_habilitations = mapping_role_habilitations;
	}
}
