
public class UsaContoCorrente {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		// abbiamo creato una istanza di contocorrente con 10000 di saldo
		ContoCorrente c1 = new ContoCorrente(10000);
		
		
		// andiamo a stasmpare ils aldo
		System.out.println(c1.saldo);
		// preleviamo 200 euro
		c1.preleva(200);
		
		System.out.println(c1.saldo);
		// versiamo mille euro
		c1.versa(1000);
		
		System.out.println(c1);
		
		// creiamo un dipedente d1 passando i valori al costruttore
		Dipendente d1 = new Dipendente("Rossi", "impiegato", 2000);
		
		System.out.println(d1);
		
		
		// creiamo una rayylist di tipo dipendente 
		
		
	}

}
