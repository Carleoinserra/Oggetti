import java.util.Scanner;

public class StrttureCondizionali {
	
	
public static void main(String[] args) {
		
		
		// creiamo un oggetto di tipo Scanner che ci serve per prendere dati da input
		Scanner input = new Scanner(System.in);
		
		
		System.out.println("Scrivi un numero: ");
		int num = input.nextInt();
		
		
		// per dichiarare un booleano utilizziamo la parola chiave boolean
		/*boolean pari = num % 2 == 0;
		
		if (pari == true) {
			
			
			System.out.println("Il numero è pari!!!");
		}
		else System.out.println("Dispari!!!!");*/
		
		
		switch(num) {
		case 1:
			System.out.println("Hai scelto 1");
			break;
		case 2: 
			System.out.println("Hai scelto 2");
			break;
			
		default:
			System.out.println("Numero non valido ");
		
		}
	
		

}
}