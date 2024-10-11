import java.util.Scanner;

public class Giochino {
	
	public static void main(String[] args) {

		
		int n = (int) (Math.random()*29);
       
        Scanner input = new Scanner(System.in);
        
        int numero = n+1;
        int vite = 4;
        boolean gameOver = true;
        
        do {
        	System.out.println("Indovina il numero");
        	int numeroUtente = input.nextInt();
        	vite--;
        	if (numero == numeroUtente) {
        		
        		System.out.println("Hai vinto il gioco");
        		vite = 0;
        		gameOver = false;
        	}
        	else if (numero > numeroUtente) {
        		System.out.println("Il numero magico è maggiore");
        	}
        	else {
        		System.out.println("Il numero magico è minore");
        	}
        }
        
        while (vite >= 0);
        
        if (gameOver) {
        	
        	System.out.println("Hai finito le vite");
        	System.out.println("Ritenta");
        }
        
        
        
}
}