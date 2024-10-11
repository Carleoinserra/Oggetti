
import java.util.Scanner;
public class MediaNumeri {
 
	public static void main(String[] args) {
		// TODO Auto-generated method stub
 
		Scanner input = new Scanner (System.in);
		int cont = 0;
		double somma = 0;
		double numero = 0;
		do {
			System.out.println("Scrivi un numero ");
			numero = input.nextDouble();
			if (numero > 0) {
			somma += numero;
			cont++;
			}
		}
		while (numero > 0);
		
		double media = somma / cont;
		System.out.printf("La media dei numeri è " + media);   
 
	}
 
}