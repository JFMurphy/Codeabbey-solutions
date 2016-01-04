import java.util.Scanner;

public class P028_BodyMassIndex {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int count = sc.nextInt();

		for (int i = 0; i < count; i++) {
			double weight = sc.nextDouble();
			double height = sc.nextDouble();
			double bmi;

			bmi = weight / (Math.pow(height, 2));

			if (bmi < 18.5)
				System.out.print("under ");
			else if (bmi >= 18.5 && bmi < 25.0)
				System.out.print("normal ");
			else if (bmi >= 25.0 && bmi < 30.0)
				System.out.print("over ");
			else if (bmi >= 30.0)
				System.out.print("obese ");
		}

		sc.close();
	}

}
