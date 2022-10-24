

public class AgenciaBorsa implements Observer{
	
	public String nom;
	public  AgentBorsa elMeuAgentBorsa;
	public AgenciaBorsa(String nom, AgentBorsa elMeuAgentBorsa){
		this.nom=nom;
		this.elMeuAgentBorsa=elMeuAgentBorsa;
	}
	
	
	public void update(){
		System.out.println(nom+":" + "Se m'ha notificat que..."+elMeuAgentBorsa.getEstatBorsa());
	}
}