import java.util.Scanner;

public class P020_VowelCount {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int count = sc.nextInt();
		sc.nextLine();

		String line;
		// int vowelCount = 0;

		for (int i = 0; i < count; i++) {
			int vowelCount = 0;
			line = sc.nextLine();
			int lineLength = line.length();

			for (int charIndex = 0; charIndex < lineLength; charIndex++) {
				switch (line.charAt(charIndex)) {
				case 'a':
					vowelCount++;
					break;
				case 'e':
					vowelCount++;
					break;
				case 'i':
					vowelCount++;
					break;
				case 'o':
					vowelCount++;
					break;
				case 'u':
					vowelCount++;
					break;
				case 'y':
					vowelCount++;
					break;
				}
			}

			System.out.print(vowelCount + " ");
		}

		sc.close();
	}

}