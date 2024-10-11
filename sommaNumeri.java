import java.util.Scanner;

public class sommaNumeri {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		Scanner input = new Scanner (System.in);
		/*	System.out.println("Quanti numeri vuoi sommare? ");
		int numeri = input.nextInt();
		int cont = 0;
		int somma = 0;
		
		do
		{
			if (numeri > 0) {
			System.out.println("Scrivi il numero che vuoi sommare: ");
			int x = input.nextInt();
			somma += x;}
			cont++;
			
		}
		while (cont < numeri);
		
		
		System.out.println("La somma è: " + somma);
	}*/
		
		System.out.println("Quanti numeri vuoi ciclare? ");
		int numeri = input.nextInt();
		
	for (int i = 0; i < numeri; i++)	 {
		
		System.out.println("Sto ciclando " + (i+1) + " volte");
	}
		
		
		
	}

}
