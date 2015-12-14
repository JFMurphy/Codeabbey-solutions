import java.util.ArrayList;
import java.util.Scanner;

public class P23_BubbleInArray {

	public static void main(String[] args) {

		final int SEED = 113;
		final int LIMIT = 10000007;

		Scanner sc = new Scanner(System.in);
		ArrayList<Integer> values = new ArrayList<Integer>();

		int result = 0;
		int swaps = 0;

		while (true) {
			int x = sc.nextInt();

			if (x == -1)
				break;
			else
				values.add(x);
		}
		
		sc.close();

		for (int i = 0; i < values.size() - 1; i++) {
			int x = values.get(i);
			int y = values.get(i + 1);

			if (x > y) {
				values.set(i, y);
				values.set(i + 1, x);

				swaps++;
			}
		}

		for (int i = 0; i < values.size(); i++) {
			result += values.get(i);
			result %= LIMIT;
			result *= SEED;
			result %= LIMIT;
		}

		System.out.println(swaps + " " + result);
	}

}
