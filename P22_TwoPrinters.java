import java.util.Scanner;

public class P22_TwoPrinters {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		int count = sc.nextInt();
		int p1Time = 0;
		int p2Time = 0;
		int printer1;
		int printer2;
		int numOfPages;

		System.out.println(count);

		for (int i = 0; i < count; i++) {
			printer1 = sc.nextInt();
			printer2 = sc.nextInt();
			numOfPages = sc.nextInt();

			for (; numOfPages > 0; numOfPages--) {
				if (p1Time + printer1 == p2Time + printer2) {
					p2Time += printer2;
				} else if (p1Time + printer1 < p2Time + printer2) {
					p1Time += printer1;
				} else {
					p2Time += printer2;
				}
			}
			
			int result = p1Time > p2Time ? p1Time : p2Time;
			System.out.print(result + " ");
		}

		sc.close();
	}

}
