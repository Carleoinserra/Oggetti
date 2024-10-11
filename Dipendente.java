
public class Dipendente {
	
	String cognome;
	String mansione;
	int stipendio;
	public Dipendente(String cognome, String mansione, int stipendio) {
		
		this.cognome = cognome;
		this.mansione = mansione;
		this.stipendio = stipendio;
	}
	@Override
	public String toString() {
		return "Dipendente [cognome=" + cognome + ", mansione=" + mansione + ", stipendio=" + stipendio + "]";
	}
	
	
	
	

}
