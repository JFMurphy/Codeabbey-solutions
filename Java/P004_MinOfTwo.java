
/*
 * Adds numbers to two arrays then finds the minimum of a pair and adds it to a third array and prints it.
 */
import java.util.Scanner;

public class P004_MinOfTwo {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int count = sc.nextInt();
		int[] answers = new int[count];

		int[] values1 = new int[count];
		int[] values2 = new int[count];

		// Populating arrays
		for (int i = 0; i < count; i++) {
			values1[i] = sc.nextInt();
			values2[i] = sc.nextInt();
		}

		for (int i = 0; i < count; i++) {
			if (values1[i] < values2[i])
				answers[i] = values1[i];
			else
				answers[i] = values2[i];

			System.out.println(answers[i] + " ");
		}

		sc.close();

	}
}