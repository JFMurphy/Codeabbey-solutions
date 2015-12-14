import java.util.Scanner;

public class P005_MinOfThree {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int a = 0;
		int b = 0;
		int c = 0;

		int answer = 0;

		for (int i = 0; i < n; i++) {
			a = sc.nextInt();
			b = sc.nextInt();
			c = sc.nextInt();

			if (a < b && a < c) {
				answer = a;
			} else if (b < a && b < c) {
				answer = b;
			} else if (c < a && c < b) {
				answer = c;
			}
			System.out.println(answer + " ");
		}

		sc.close();
	}
}