
public class EsempioStringhe {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		String parola = "Ciao";
		
		System.out.println(parola.isEmpty());
		
		System.out.println(parola.length());
		
		String parola2 = "ciao";
		
		
		// utilizziamo il metodo equals per comparare due stringhe
		if (parola.equals(parola2)) {
			
			System.out.println("sono uguali");
		}
		else if (parola.equalsIgnoreCase(parola2)) {
			
			System.out.println("Sono uguali ma con case diversi");
		}
		else {
			System.out.println("Sono diverse");
		}
		
	}

}
