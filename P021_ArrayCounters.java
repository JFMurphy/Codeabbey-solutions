import java.util.Scanner;

public class P021_ArrayCounters {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int count = sc.nextInt();
		int limit = sc.nextInt();

		int[] numbers = new int[count];
		int[][] numsAndCounters = new int[limit][2];

		/*
		 * Populating numsAndCounters with individual numbers in the first
		 * column. The counter are in the second column.
		 */
		for (int i = 0; i < limit; i++) {
			numsAndCounters[i][0] = i + 1;
		}

		/*
		 * Adding and checking every number in the large array and adding 1 to
		 * the counter for every number thats the same.
		 */
		for (int i = 0; i < count; i++) {
			numbers[i] = sc.nextInt();
			for (int j = 0; j < limit; j++) {
				if (numbers[i] == numsAndCounters[j][0])
					numsAndCounters[j][1]++;
			}
		}

		/* Printing the counter totals. */
		for (int i = 0; i < limit; i++) {
			System.out.print(numsAndCounters[i][1] + " ");
		}

		sc.close();
	}
}
