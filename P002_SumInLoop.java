import java.util.Scanner;

public class P002_SumInLoop {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int count = sc.nextInt();
		int answer = 0;

		int data[] = new int[count];

		for (int i = 0; i < count; i++) {
			data[i] = sc.nextInt();
		}

		for (int i = 0; i < count; i++) {
			answer = answer + data[i];
		}

		System.out.println(answer);

		sc.close();
	}
}