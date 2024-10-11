import java.util.Scanner;

public class SlotMachines {
	
	
	public static void main(String[] args) {
		
		
		
		
		
		
		int credito = 0;
		
		Scanner input = new Scanner (System.in);
		
		System.out.println("Inserisci credito");
		credito = input.nextInt();
		int gioca = 0;
		
		do {System.out.println("Cosa vuoi fare 1 per giocare 0 per uscire");
	       gioca = input.nextInt();
		
		
		if (gioca == 1) {
			int n1 = (int) (Math.random()*2) +1;
			System.out.print(n1 + " ");
			int n2 = (int) (Math.random()*2) +1;
			System.out.print(n2 + " ");
			int n3 = (int) (Math.random()*2) +1;
			System.out.print(n3);
			
			if (n1 == n2 && n1 == n3 && n2 == n3) {
				
				System.out.println("CASSA!!!");
				credito += 5;
			}
			else {
				System.out.println("Ritenta");
				credito -= 2;
			}
		}}
		while (credito > 1 && gioca != 0);
		
		System.out.println("Credtio residuo");
		System.out.println(credito);
		
		
		
		
		
	
	}

}
