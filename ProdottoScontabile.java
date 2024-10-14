
public class ProdottoScontabile extends Prodotto {

	int qntSconto;
	double Sconto;
	
	
	// oltre alle prorpeità di prodotto abbia aggiunto qntSconto e Sconto
	public ProdottoScontabile(String descrizione, double prezzo, int qnt, int qntSconto, double Sconto) {
		super(descrizione, prezzo, qnt);
		
		this.qntSconto = qntSconto;
		this.Sconto = Sconto;
	}
	
	// il metodo vendi richiede il numero di pezzi di prodotti da acquista e superata una certa soglia vende il prodotto
	// scontato
	public boolean vendi(int pezzi) {
		
		if (qnt >= pezzi) {
			
			
		// se si supera una cera quantità il prodotto viene scontato
		if (pezzi >= this.qntSconto) {
			// lo sconto viene calcolato in maniera percantuale
			double sconto = Sconto * prezzo / 100;
			//Al prezzo viene sottratto lo sconto
			this.prezzo -= sconto;
			
			System.out.println("Hai acquistato " + descrizione + " a " + prezzo + " euro");
			
		}
		// altrimenti il prodotto viene venduto a prezzo normale
		else {
			System.out.println("Hai acquistato " + descrizione + " a " + prezzo + " euro");
			
		}
		
		qnt -= pezzi;
		return true;
		
		}
		else 
			System.out.println("Ho solo " + qnt + " disponibili");
			return false;
		
	}

}
