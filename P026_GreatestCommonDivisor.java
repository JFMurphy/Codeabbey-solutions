import java.util.Scanner;

public class P026_GreatestCommonDivisor {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int count = sc.nextInt();
		
		for (int i = 0; i < count; i++) {
			int initA = sc.nextInt();
			int initB = sc.nextInt();
			int a = initA;
			int b = initB;
			
			int lcm = 0;
			int gcd = 0;
			
			while (a != b) {
				if (a > b)
					a = a-b;
				else
					b = b-a;
			}
			if (a == b)
				gcd = a;
			else
				System.out.println("No. Wrong.");
			
			lcm = initA * initB / gcd;
			
			System.out.print("(" + gcd + " " + lcm + ") ");
		}
	}

}
