public class AppObserver{
	public static void main(String[] args){
		
		//Crea agent de Borsa(Observable)
		AgentBorsa elMeuAgentBorsa  =new AgentBorsa("Agent1");
		
		//Crea les diferents agencies (Observers)
		
		elMeuAgentBorsa.addObserver(new AgenciaBorsa("Agencia-1",elMeuAgentBorsa));
		elMeuAgentBorsa.addObserver(new AgenciaBorsa("Agencia-2",elMeuAgentBorsa));
		elMeuAgentBorsa.addObserver(new AgenciaBorsa("Agencia-3",elMeuAgentBorsa));
		elMeuAgentBorsa.addObserver(new AgenciaBorsa("Agencia-4",elMeuAgentBorsa));
		
		//Hi ha un canvi a la borsa
		elMeuAgentBorsa.canviBorsa(2); //La Borsa puja
		elMeuAgentBorsa.canviBorsa(3); //La Borsa baixa
		elMeuAgentBorsa.canviBorsa(1); //La Borsa queda igual
	}
}  

