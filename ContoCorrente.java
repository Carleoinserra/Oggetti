
public class ContoCorrente {

	
	// dobiamo indicare quali sono le proprietà dell'oggetto
	
	double saldo;
	
	//nel costruttore possiamo definire le proprietà dell'oggetto con i valori che ci passano al momento della creazione
	public ContoCorrente(double saldo) {
		
		this.saldo = saldo;
	}
	
	
	// metodo che va a incrementare la propreità saldo del valore del,importo
	public void versa(double importo) {
		
		this.saldo += importo;
	}
	// metodo che va a decrementare la propreità saldo del valore del,importo
	public void preleva(double importo) {
		
		this.saldo -= importo;
	}
	
	public String toString() {
		
		return "Il saldo residuo del conto è "  + saldo;
	}
	
	
	
	

}
