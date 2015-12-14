import java.util.Scanner;

public class P041_MedianOfThree {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		int min = 0;
		int max = 0;
		int median = 0;
		int numCols = 3;
		int count = sc.nextInt();

		// Declaring a multi array.
		int[][] values = new int[count][numCols];

		// Entering values into the multi array.
		for (int row = 0; row < count; row++) {
			for (int col = 0; col < 3; col++) {
				values[row][col] = sc.nextInt();
			}
		}

		for (int row = 0; row < count; row++) {
			max = 0;
			min = 0;

			// sets the min and max values for a row
			for (int col = 0; col < numCols; col++) {
				if (values[row][col] > max) {
					max = values[row][col];
					if (col < 1)
						min = max; /*
									 * only sets min equal to max once for every
									 * row
									 */
				}
				if (values[row][col] < min)
					min = values[row][col];
			}

			// sets the median value to whatever the min and max values aren't
			for (int col = 0; col < numCols; col++) {

				if (values[row][col] != min && values[row][col] != max)
					median = values[row][col];
			}

			System.out.println(median + " ");
		}

		sc.close();
	}
}
