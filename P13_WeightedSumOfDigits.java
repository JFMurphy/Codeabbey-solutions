import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class P13_WeightedSumOfDigits {
	
	public static void main (String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int count = sc.nextInt();
		int digitsNum;
		
				
		for (int i = 0; i < count; i++) {
			ArrayList<Integer> digits = new ArrayList<>();
			digitsNum = sc.nextInt();
			int result = 0;
			
			while (digitsNum > 0) {
				digits.add(digitsNum % 10);
				digitsNum = digitsNum / 10;
			}
			
			Collections.reverse(digits);
			
			for (int j = 0; j < digits.size(); j++) {
				int digit = digits.get(j);
				result += digit * (j+1);
			}
			
			System.out.print(result + " ");
		}
	}
}