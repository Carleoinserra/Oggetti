
public class Dipendente {
	
	
	// definiamo 3 proprietà due di tipo stringa e uan di tipo int
	String cognome;
	String mansione;
	int stipendio;
	
	
	// nel costruttore di dipendente andiamo ad assegna i valori ottenuti da parametro alle propreità
	public Dipendente(String cognome, String mansione, int stipendio) {
		
		this.cognome = cognome;
		this.mansione = mansione;
		this.stipendio = stipendio;
	}
	
	// rappresentazione testuale di un oggetto dipendente
	
	
	public void setBonus() {
		
		this.stipendio += 200;
	}
	
	
	
	@Override
	public String toString() {
		return "Dipendente [cognome=" + cognome + ", mansione=" + mansione + ", stipendio=" + stipendio + "]";
	}
	
	
	
	

}
