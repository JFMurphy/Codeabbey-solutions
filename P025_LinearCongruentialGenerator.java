import java.util.Scanner;

public class P025_LinearCongruentialGenerator {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		int count = sc.nextInt();

		for (int i = 0; i < count; i++) {
			int next = 0;
			// Constants
			int a = sc.nextInt();
			int c = sc.nextInt();
			int m = sc.nextInt();
			// Initial number and used for the current number.
			int xCurr = sc.nextInt();
			// The member of the sequence we want to calculate
			int n = sc.nextInt();

			for (int j = 0; j < n; j++) {
				next = (a * xCurr + c) % m;
				xCurr = next;
			}

			System.out.print(next + " ");

		}

		sc.close();
	}

}
