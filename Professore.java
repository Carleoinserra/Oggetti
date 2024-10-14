
public class Professore extends Persona {
	
	int stipendio;
	String dipartimento;
	
	public  Professore(String nome, String indirizzo, int stipendio, String dipartimento) {
		
		super(nome, indirizzo);
		this.stipendio = stipendio;
		this.dipartimento = dipartimento;
		
	}

	public int getStipendio() {
		return stipendio;
	}

	public void setStipendio(int stipendio) {
		this.stipendio = stipendio;
	}

	public String getDipartimento() {
		return dipartimento;
	}

	public void setDipartimento(String dipartimento) {
		this.dipartimento = dipartimento;
	}

	@Override
	public String toString() {
		return "Professore [nome : " + nome + " indirizzo: " + indirizzo +" stipendio=" + stipendio + ", dipartimento=" + dipartimento + "]";
	}
	

}
