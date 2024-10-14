
public class UsaAppartamento {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Appartamento m1 = new Appartamento("Rossi", 150, 4, 5);
		Appartamento m2 = new Appartamento("Bianchi", 150, 4, 5);
		Appartamento m3 = new Appartamento("Neri", 150, 4, 5);
		
		System.out.println(m1);
		System.out.println(m2);
		System.out.println(m3);
		
		m3.setNomeProprietario("Gialli");
		m3.setnInquilini(4);
		System.out.println(m3);
	}

}
