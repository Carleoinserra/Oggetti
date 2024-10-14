
public class UsaProdotto {

	public static void main(String[] args) {
		// abbiamo creato un prodotto indicando il numero dei pezzi
		Prodotto p1 = new Prodotto ("Nutella", 4, 30);
		
		// creiamo un prodotto senza numero dei pezzi
		Prodotto p2 = new Prodotto("Mayonese", 3);
		
		//p1.vendi();
		
	/*	p2.rifornisci(20);
		
		if (!p2.vendi()) {
			
			System.out.println("prodotto non disponibile");
		}*/
		
		ProdottoScontabile p3 = new ProdottoScontabile("Yogurt muller", 5, 30, 5, 20);
		
		p3.vendi(35);
		

	}

}
