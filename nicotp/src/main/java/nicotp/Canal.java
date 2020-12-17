package nicotp;

import java.util.List;
import java.util.Map;

public class Canal implements Comparable {
	private Map<Role,List<Utilisateur>> mapping_role_utilisateurs;
	private Integer ordre;
	private List<Webhook> webhooks;
	private String nom;
	private Map<Role,List<Habilitation>> mapping_role_habilitations;
	private List<Message> historiques;
	
	public int compareTo(Canal cnl) {
		return 0;
	}
	
	public Canal() {}
	
	public void ecrireMessage(Utilisateur user, Message msg) {
		
	}

	public Object getMapping_role_utilisateurs() {
		return mapping_role_utilisateurs;
	}

	public Object getMapping_role_habilitations() {
		return mapping_role_habilitations;
	}

	public List<Message> getHistoriques() {
		return historiques;
	}

}
