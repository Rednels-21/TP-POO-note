package nicotp;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Canal implements Comparable, Destinataire {
	private Map<Role,List<Utilisateur>> mapping_role_utilisateurs;
	private Integer ordre;
	private List<Webhook> webhooks;
	private String nom;
	private Map<Role,List<Habilitation>> mapping_role_habilitations;
	private List<Message> historiques;
	
	public int compareTo(Canal cnl) {
		return 0;
	}
	
	public Canal() {
		mapping_role_utilisateurs = new HashMap<Role,List<Utilisateur>>();
		mapping_role_habilitations = new HashMap<Role,List<Habilitation>>();
		webhooks = new ArrayList<Webhook>();
		historiques = new ArrayList<Message>();
	}
	
	public void ecrireMessage(Utilisateur user, Message msg) throws ActionNonAutoriseeException {
		List<Role> roles = new ArrayList<Role>(); // roles de l'utilisateur 
		Boolean ouinon = false;
		
		for (Map.Entry<Role, List<Utilisateur>> mapentry : mapping_role_utilisateurs.entrySet()) {
	           if(mapentry.getValue().contains(user)) {
	        	   roles.add(mapentry.getKey());
	           }
	    }
		  
		historiques.add(msg);
		for (Role role : roles) {
			if(mapping_role_habilitations.get(role).contains(Habilitation.ECRITURE)) {
				ouinon = true;
			}
	    }
		 
		if(!ouinon) {
			throw new ActionNonAutoriseeException("ERREUR");
		}	
	}

	public Integer getOrdre() {
		return ordre;
	}

	public void setOrdre(Integer ordre) {
		this.ordre = ordre;
	}

	public Map<Role,List<Utilisateur>> getMapping_role_utilisateurs() {
		return mapping_role_utilisateurs;
	}

	public Map<Role,List<Habilitation>> getMapping_role_habilitations() {
		return mapping_role_habilitations;
	}

	public List<Message> getHistoriques() {
		return historiques;
	}

}
