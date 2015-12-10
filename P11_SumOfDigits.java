import java.util.Scanner;

public class P11_SumOfDigits {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int count = sc.nextInt();
		
		int a, b, c, digitsNum;
		int remainder = 0;
		int result = 0;
		
		// For every increment; moves to next row.
		for (int i = 0; i < count; i++) {
			result = 0;
			
			a = sc.nextInt();
			b = sc.nextInt();
			c = sc.nextInt();
								
			digitsNum = a * b + c;
			
			while (digitsNum > 0) {
				remainder = digitsNum % 10;
				
				digitsNum = digitsNum / 10;
				
				result += remainder;
			}
			
			System.out.print(result + " ");
		}
	}
}
