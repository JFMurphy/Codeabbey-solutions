import java.util.Scanner;

public class P027_BubbleSort {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		int count = sc.nextInt();
		int[] values = new int[count];
		int swaps = 0;
		int passes = 0;
		boolean flag = true;

		for (int i = 0; i < count; i++) {
			values[i] = sc.nextInt();
		}

		while (flag) {
			flag = false;
			
			for (int i = 0; i < values.length-1; i++) {
					
				if (values[i] > values[i+1]) {
					int t = values[i+1];
					
					values[i+1] = values[i];
					values[i] = t;
					
					swaps++;
					flag = true;
				}
			}
			passes++;
		}
		
		for (int i = 0; i < values.length; i++) {
			System.out.print(values[i] + " ");
		}
		System.out.println("\n" + passes + " " + swaps);
		
		sc.close();
	}

}
