import java.util.Scanner;

public class minimoTraDieci {
	
	
	public static int min(int x, int y) {
		
		if (x < y) return x;
		else return y;
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner input = new Scanner (System.in);
		System.out.println("Scrivi un numero");
		int num = input.nextInt();
		
		int temp = num;
		int min = 0;
		min = min(temp, num);
		for (int i = 0; i < 9; i++) {
			min = min(min, num);
			System.out.println(min);
			temp = num;
			
			System.out.println("Scrivi un numero");
			num = input.nextInt();
			
			
			
			
			
			
			
		}
		System.out.println(min);
		

	}

}
