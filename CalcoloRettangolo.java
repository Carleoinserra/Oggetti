import java.util.Scanner;


public class CalcoloRettangolo {

	public static void main(String[] args) {
		
		
		// creiamo un oggetto di tipo Scanner che ci serve per prendere dati da input
		Scanner input = new Scanner(System.in);
		
		
		
		
		// dichiariamo due variabili base e altezza
		System.out.println("Scrivi la bas (deve essere un numero intero)e: ");
		
		int base = input.nextInt();
		
		
		System.out.println("Scrivi l'altezza: (deve essere un numero intero)");
		int altezza = input.nextInt();
		
		// calcoliamo area e permitero assegnando alle variabili una espressione
		int area = base * altezza;
		int perimetro = (base * 2) + (altezza * 2);
		
		
		// il metodo syst.out.println stampa nella console un messaggio
		// utilizziamo l'operatore + per concatena due o più elementi
		System.out.println("L'area del rettangolo è " + area);
		System.out.println("Il perimetro del rettangolo è :" + perimetro);
		
		

	}

}
