
/*
 * Takes in two variables from scanner and adds them then prints out the result.
 */
import java.util.Scanner;

public class P001_SumAB {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int a = sc.nextInt();
		int b = sc.nextInt();
		int answer;

		answer = a + b;

		System.out.println(answer);

		sc.close();
	}

}