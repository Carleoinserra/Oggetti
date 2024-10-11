
public class ProvaMetodi1 {
	
	
	
	
	public static int somma10() {
		
		int somma = 0;
		
		for (int i = 1; i <= 10; i++) {
			
			somma += i;
		}
		
		return somma;
	}
public static int prodotto10() {
		
		int prodotto = 1;
		
		for (int i = 1; i <= 10; i++) {
			
			prodotto *= i;
		}
		
		return prodotto;
	}

public static int somma(int x, int y) {
	
	return x + y;
}


public static boolean pari(int x) {
	
	
	if (x % 2 == 0)
		return true;
	
	else return false;
	
	
	
	
	
}

public static void pariVoid(int x) {
	

	if (x % 2 == 0)
		System.out.println("Il numero è pari");
	
	else System.out.println("Il numero è dispari");
}
	public static void stampaNome(String nome, String cognome, int anni) {
		
		System.out.println(nome + " " + cognome + " " + anni);
	}
	
	
	
	
	public static void main(String[] args) {
		
		
		System.out.println(prodotto10());
		System.out.println(somma10());
		
		
		
		int somma = somma10();
		
		System.out.println(somma(8,9));
		
		System.out.println(pari(6));
		
		pariVoid(4);
		
		stampaNome("Luigi", "Rossi", 56);
		
		

	}
	

}
