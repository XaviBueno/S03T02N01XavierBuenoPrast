
//Classe Objecte Observador
public class AgenciaBorsa implements Observer{
	
	public String nom; //Nom de l'agència
	public  AgentBorsa elMeuAgentBorsa; //Agent de borsa que està vinculat(podria ser un array de objectes Agents de Borsa en el cas de que hagués  varis
	
	
	public AgenciaBorsa(String nom, AgentBorsa elMeuAgentBorsa){
		this.nom=nom;
		this.elMeuAgentBorsa=elMeuAgentBorsa;
	}
	
	//Actualitza les dades rebudes.
	public void update(){
		System.out.println(nom+":" + "Se m'ha notificat que..."+elMeuAgentBorsa.getEstatBorsa());
	}
}