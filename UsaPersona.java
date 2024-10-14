
public class UsaPersona {
	
	public static void main(String[] args) {
		
	Persona p1 = new Persona("Rossi", "Via Roma");
	studente s1 = new studente("Bianchi", "Via Torino", "1234", "Lettere");
	System.out.println(p1);
	System.out.println(s1);
	s1.setIndirizzo("Via Bologna");
	System.out.println(s1);
		
		
	}

}
