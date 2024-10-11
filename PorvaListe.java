import java.util.ArrayList;


public class PorvaListe {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		ArrayList<Integer> lista = new ArrayList<>();
		
		//metodo per aggiungere un elemento all'interno dell'array
		lista.add(5);
		lista.add(6);
		lista.add(7);
		
		//accedere ad un elmento dell'array
		System.out.println(lista.get(0));
		
		
		// lista.sice ritorna la lunghezza dell'array
		System.out.println(lista.size());
		
		// accesso a tutti gli elmenti con il for
		for (int i = 0; i < lista.size(); i++) {
			System.out.println("indice " + i + " elemento "+ lista.get(i));
		}
		
		// rimuovi un elmento dalla lista
		lista.remove(0);
		System.out.println("dopo il remove");
		for (int i = 0; i < lista.size(); i++) {
			System.out.println(lista.get(i));
		}
		
		
		// stampa con il foreach
		for (int num: lista) {
			
			System.out.println(num);
		}

	}

}
