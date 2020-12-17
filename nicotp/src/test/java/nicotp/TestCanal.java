package nicotp;

import static org.junit.Assert.fail;

import java.util.Arrays;
import java.util.List;

import org.junit.Assert;
import org.junit.Test;

public class TestCanal {
	
	 @Test
	    public void ecrireMessageOK() throws ActionNonAutoriseeException {
	        // Etape 1 : pr�paration des objets
	        Canal c = new Canal();

	        Message m = new Message();
	        m.setDestinataire(c);
	        m.setTexte("Bonne f�tes de fin d'ann�e !");

	        Utilisateur utilisateur = new Utilisateur();
	        c.getMapping_role_utilisateurs().put(new Role("Membre"), Arrays.asList(utilisateur));
	        c.getMapping_role_habilitations().put(new Role("Membre"), Arrays.asList(Habilitation.ECRITURE));

	        // Etape 2 : appel de la m�thode test�e
	        c.ecrireMessage(utilisateur, m);

	        // Etape 3 test du retour
	        List<Message> historiques = c.getHistoriques();
	        Assert.assertEquals(1, historiques.size());
	        System.out.println(historiques.get(0).getTexte());
	    }

	    @Test
	    public void ecrireMessageKO() {

	        // Etape 1 : pr�paration des objets
	        Canal c = new Canal();

	        Message m = new Message();
	        m.setDestinataire(c);
	        m.setTexte("Bonne ann�e 2021 !");

	        Utilisateur utilisateur = new Utilisateur();

	        // Etape 2 : appel de la m�thode test�e
	        try {
	            c.ecrireMessage(utilisateur, m);
	            
	            // Etape 3 test du retour
	            fail("L'exception aurait du �tre lev�e, on ne doit pas passer ici !");
	        } catch (ActionNonAutoriseeException e) {
	        	e.printStackTrace(); 
	            // Etape 3 test du retour = si on arrive ici, le test est concluant
	        }
	    }
	    
	    @Test
	    public void testCompare() {
	    	Canal c1 = new Canal();
	    	c1.setOrdre(1);
	    	Canal c2 = new Canal();
	    	c2.setOrdre(2);
	    	c1.compareTo(c2);
	    	Assert.assertEquals(0,c1.compareTo(c2));
	    }
}
