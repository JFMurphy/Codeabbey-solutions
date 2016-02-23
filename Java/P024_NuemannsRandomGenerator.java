import java.util.ArrayList;
import java.util.Scanner;

public class P024_NuemannsRandomGenerator {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		int count = sc.nextInt();

		for (int i = 0; i < count; i++) {
			ArrayList<Integer> nums = new ArrayList<Integer>();
			int value = sc.nextInt();
			int iterations = 0;

			while (true) {

				nums.add(value);

				value *= value;
				// Truncating
				value /= 100;
				value %= 10000;

				iterations++;

				if (nums.contains(value)) {
					break;
				}
			}
			System.out.print(iterations + " ");
		}

		sc.close();
	}

}