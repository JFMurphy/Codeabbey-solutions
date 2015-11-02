import java.util.Scanner;

public class LinearFunction {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int count;
		count = sc.nextInt();
		int a = 0;			// gradient
		int b = 0;			// y intercept
		
		for (int i = 0; i < count; i++) {
			int x1 = 0;
			int y1 = 0;
			int x2 = 0;
			int y2 = 0;
			
			x1 = sc.nextInt();
			y1 = sc.nextInt();
			x2 = sc.nextInt();
			y2 = sc.nextInt();	
			
			a = (y1 - y2) / (x1 - x2);
			
			b = y1 - (a * x1);
			
			System.out.println("(" + a + " " + b + ") ");
		}		
	}
}
