import java.util.Scanner;
public class Somma {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner input = new Scanner (System.in);
		
		
		System.out.println("Scrivi un numero ");
		double num1 = input.nextDouble();
		
		System.out.println("Scrivi un numero ");
		double num2 = input.nextDouble();
		
		
		System.out.println("La somma dei due numeri è: " + (num1 + num2));

	}

}
