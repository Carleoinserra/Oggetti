import java.util.*;
public class Presente {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	// abbiamo dichiarato un arraylist di tipo int	
	ArrayList <Integer> lista = new ArrayList<>();
	Scanner input = new Scanner (System.in);
	
	//creiamo una variabile che ci servirà per iterare il programma
	int scelta = 0;
	
	// andiamo ad aggiungere tre numeri alla lista
	lista.add(4);
	lista.add(5);
	lista.add(6);
	do {
		// assegniamo a scelta l'input dell'utente se preme 0 il programma termina
		System.out.println("Cosa vuoi fare? 0 per terminare");
		scelta = input.nextInt();
		// se la scelta è diversa da zero andiamo a leggere un numero
		if (scelta != 0) {
		System.out.println("Inserisci un numero");
		int num = input.nextInt();
		
		// creiamo una variabile di appoggio booleana per vedere se il numero presente
		boolean trovato = false;
		
		// un ciclo foreach che va a verificare se l'elemento è presente nell'array
		for (int n1: lista) {
			
			// se l'emento è presente va ad assegnare alla variabile trovato il valore true
			if (num == n1) {
				trovato = true;
			}
		}
		// fuori dal for se la variabile trova ha valore tre l'elemento è presente
		if (trovato) {
			System.out.println("elemento presente");
		}
		else System.out.println("Non presente");
		
		}
		
	}
	
	while (scelta != 0);
	}

}
