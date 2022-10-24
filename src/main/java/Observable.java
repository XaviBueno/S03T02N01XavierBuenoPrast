

public interface Observable{
	
	//Afegeix un observador
	public void  addObserver(Observer obs);
	
	//Esborra un observador
	public void removeObserver(Observer obs);
	
	//Notifica un canvi als observadors
	public void notificaObservers();
	
	
	
}