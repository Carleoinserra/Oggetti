
public class HelloWorld {

	public static void main(String[] args) {
	
		
		
		
		// stiamo usando il metodo System.out.println che stampa una stringa come parametro
		System.out.println("Benvenuti al corso java");
		
		// con Syste.out.print non va a capo
		//System.out.print("ciao");
		//System.out.print("ciao1");
		
		// voglio creare una variabile di tipo intero
		
		int num = 4;
		System.out.println(num);
		
		// per i numeri in virgola mobile utilizziamo double
		double num1 = 4.3;
		System.out.println(num1);
		
		System.out.println("Somma: " + (num + num1));
		System.out.println("Differenza: " + (num - num1));
		System.out.println("Quoziente: " + (num / num1));
		System.out.println("Prodotto: " + (num * num1));
		
		double quoziente = 12.0 / 5.0;
		System.out.println(quoziente);
		
		
		
		// variabile dichiarata ma non inizializzata
		int area = 10;
		
		System.out.println(area);
		
		
		
		

	}

}
