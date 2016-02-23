import java.util.Scanner;

public class P017_ArrayChecksum {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		final int SEED = 113;
		final int LIMIT = 10000007;

		int count = sc.nextInt();
		int result = 0;

		int[] values = new int[count];

		for (int i = 0; i < count; i++) {
			values[i] = sc.nextInt();

			result = result + values[i];
			result %= LIMIT;
			result *= SEED;
			result %= LIMIT;
		}

		System.out.println(result);

		sc.close();
	}
}
