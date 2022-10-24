
//Classe el jubjecte observable

import java.util.ArrayList;

public class AgentBorsa implements Observable{
	public final String BORSANOCANVIA="No hi han canvis";
	public final String BORSAPUJA="La borsa ha pujat";
	public final String BORSABAIXA="La borsa ha baixat";
	
	private String nomAgent;
	private String estatBorsa;
	private ArrayList<Observer> agenciesBorsa;
	
	public AgentBorsa(String nomAgent){
		this.nomAgent=nomAgent;
		agenciesBorsa= new ArrayList<>();
	}
	
	
	
	
	public String getEstatBorsa(){
		return estatBorsa;
	}	
	
	
	
	
	//Afegeix una agencia(observador);
	public void  addObserver(Observer agencia){
	
		agenciesBorsa.add(agencia);
	}
	
	//Esborra una agencia(observador)
	
	public void removeObserver(Observer agencia){
		agenciesBorsa.remove(agencia);
	}
	
	//Notifica un canvi les agencies
	public void notificaObservers(){
		for( Observer ag :agenciesBorsa){
			ag.update();
		}
	}
	
	//Event que provoca la notificació
	public void canviBorsa(int canvi){
		switch (canvi){
			case 1: 
				estatBorsa=BORSANOCANVIA;
				break;
			case 2:
				estatBorsa=BORSAPUJA;
				break;
			case 3:
				estatBorsa=BORSABAIXA;
				break;
			default:
				estatBorsa=BORSANOCANVIA;
		}
		notificaObservers();
	}
}
	
	