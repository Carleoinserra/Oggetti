
public class studente extends Persona {
	String matricola;
	String facolta;
	
	
	// per estendere la classe persona la classe studente deve avere nel costruttore un nome e un indirizzo
	public studente(String nome, String indirizzo, String matricola, String facolta) {
		// con la parola chiave stiamo dicendo che stiamo costruendo quelle propreità che sono di Persona
		super(nome, indirizzo);
		
		
		this.matricola = matricola;
		this.facolta = facolta;
		
		
		
		
		
		
		
	}


	public String getMatricola() {
		return matricola;
	}


	public void setMatricola(String matricola) {
		this.matricola = matricola;
	}


	public String getFacolta() {
		return facolta;
	}


	public void setFacolta(String facolta) {
		this.facolta = facolta;
	}


	@Override
	public String toString() {
		return "studente [nome : " + nome + " indirizzo: " + indirizzo +" matricola=" + matricola + ", facolta=" + facolta + "]";
	}
	

}
