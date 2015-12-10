import java.util.Scanner;

public class P18_SquareRoot {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int count = sc.nextInt();
		
		for (int i = 0; i < count; i++) {
			int numToSquare = sc.nextInt();
			int numOfCalculations = sc.nextInt();
			double squareRoot = 1;
			double d;
			
			for (int j = 0; j < numOfCalculations; j++) {
				d = numToSquare / squareRoot;
				
				squareRoot = (squareRoot + d) / 2;
			}
			
			System.out.format("%.7f ", squareRoot);
		}
	}
}
