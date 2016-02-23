import java.util.Scanner;

public class P014_ModularCalculator {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		String input = "";
		int total;
		int result = 0;
		int modulo;

		while (true) {
			String i = sc.next();
			if (i.equals("%")) {
				input += i + " ";
				input += sc.next() + " ";
				break;
			}
			input += i + " ";
		}

		String[] values = input.split(" ");

		total = Integer.parseInt(values[0]);
		modulo = Integer.parseInt(values[values.length - 1]);

		for (int i = 0; i < values.length - 1; i++) {
			int temp;
			switch (values[i]) {
			case "+":
				temp = total + Integer.parseInt(values[i + 1]);
				total = temp % modulo;
				break;

			case "*":
				temp = total * Integer.parseInt(values[i + 1]);
				total = temp % modulo;
				break;

			case "%":
				result = total % Integer.parseInt(values[i + 1]);
				break;
			}
		}

		System.out.println(result);

		sc.close();
	}
}
