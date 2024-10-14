
public class Prodotto {
	
	String descrizione;
	double prezzo;
	int qnt;
	// primo costruttore con la quantità
	public Prodotto(String descrizione, double prezzo, int qnt) {
		
		this.descrizione = descrizione;
		this.prezzo = prezzo;
		this.qnt = qnt;
		
	}
	
	// secondo costruttore senza la quantità
public Prodotto(String descrizione, double prezzo) {
		
		this.descrizione = descrizione;
		this.prezzo = prezzo;
		this.qnt = 0;
		
	}

public void rifornisci(int pezzi) {
	
	this.qnt += pezzi;
}

public boolean vendi() {
	
	if (this.qnt > 0) {
		System.out.println(this.descrizione + " venduto al prezzo " + prezzo + " euro");
		this.qnt -= 1;
		return true;
	}
	else return false;
}

}
