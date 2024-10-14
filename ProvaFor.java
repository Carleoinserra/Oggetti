import java.util.ArrayList;

public class ProvaFor {

	public static void main(String[] args) {
		
		
		
		// TODO Auto-generated method stub
		
		
		ArrayList <Integer> lista = new ArrayList <>();
		lista.add(3);
		lista.add(5);
		lista.add(7);
		
		for (int i = 0; i < lista.size();i++) {
			
			System.out.println(lista.get(i));
		}
		
		for (int j: lista) {
			
			System.out.println(j);
		}

	}

}
