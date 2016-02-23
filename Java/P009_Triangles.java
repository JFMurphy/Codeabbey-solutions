import java.util.Scanner;

public class P009_Triangles {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		int count = sc.nextInt();
		int a, b, c, x = 0, sum = 0, difference = 0, answer; // x is the
																// smallest
																// value of the
																// three.

		for (int i = 0; i < count; i++) {
			a = sc.nextInt();
			b = sc.nextInt();
			c = sc.nextInt();

			if (a < b && a < c) {
				x = a;
				sum = b + c;
				if (b > c) {
					difference = b - c;
				} else {
					difference = c - b;
				}
			} else if (b < a && b < c) {
				x = b;
				sum = a + c;
				if (a > c) {
					difference = a - c;
				} else {
					difference = c - a;
				}
			} else if (c < a && c < b) {
				x = c;
				sum = a + b;
				if (a > b) {
					difference = a - b;
				} else {
					difference = b - a;
				}
			}

			if (x < sum && x > difference) {
				answer = 1;
			} else {
				answer = 0;
			}

			System.out.print(answer + " ");

		}

		sc.close();
	}
}