import java.util.ArrayList;
import java.util.Scanner;
public class UsaDipendente {

	public static void main(String[] args) {
		
		// creiamo una rayylist di tipo dipendente 
		ArrayList <Dipendente> lista = new ArrayList<>();
		Scanner input = new Scanner(System.in);
		// andiamo ad aggiungere un dipendente alla lista
		Dipendente d1 = new Dipendente("Rossi", "operaio", 1400);
		lista.add(d1);
		
		// maniera più veloce
		lista.add(new Dipendente ("Bianchi", "impiegato", 1600));
		int scelta = 0;
		
		// creiamo un programma che a seconda della scelta fa delle operazioni sulla lista
		do {
			System.out.println("1 per inserire un nuovo dipendente 2 per stampare tutti i dipendenti 3 per dare un bonus 0 per uscire");
			scelta = input.nextInt();
			// se la scelta è uno si va a prendere i valori per creare un nuovo dipendente 
			if (scelta == 1) {
				
				System.out.println("Scrivi il nome: ");
				String nome = input.next();
				System.out.println("Scrivi la mansione: ");
				String mansione = input.next();
				System.out.println("Scrivi lo stipendio: ");
				int stipendio = input.nextInt();
				// aggiungiamo il dipendente alla lista
				lista.add(new Dipendente (nome, mansione,stipendio));
				
				
				
				
			}
			// se la scelta è due stampiamo tutti i dipendenti con un foreach
			else if (scelta == 2) {
				
				for (Dipendente dip: lista) {
					System.out.println(dip);
				}
				
			}
			// se la scelta è 3 settiamo il bonus al dipedente dal nome
			else if (scelta == 3) {
				System.out.println("Scrivi il nome: ");
				String nome = input.next();
				boolean trovato = false;
				for (Dipendente dip: lista) {
					
					// se il nome scritto corrispondee a quello di un dipendente invochiamo su quel dipendente il metodo bonus
					if (dip.cognome.equals(nome)) {
						dip.setBonus();
						trovato = true;
						System.out.println("Bonus settato");
					}
				}
				
				if (!trovato) {
					System.out.println("Dipendente non trovato");
				}
				
			}
			// con la scelta 4 cancelliamo il dipedente a partire dal nome
			else if (scelta == 4) {
				System.out.println("Scrivi il nome: ");
				String nome = input.next();
				boolean trovato = false;
				for (int i = 0; i < lista.size(); i++) {
					
					// se il dipendente viene trovato cancelliamo quel dipendente dalla lista a partire dall'indice
					if (lista.get(i).cognome.equals(nome)) {
						lista.remove(i);
						trovato = true;
						System.out.println("Dipendente cancellato");
					}
				}
				
				if (!trovato) {
					System.out.println("Dipendente non trovato");
				}
				
			}
			
			
		}
		
		while (scelta != 0);
		
		
	}

}
