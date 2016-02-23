import java.util.Scanner;

public class P019_MatchingBrackets {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int count = sc.nextInt();
		sc.nextLine();

		for (int i = 0; i < count; i++) {
			int curlCount = 0, squareCount = 0, roundCount = 0, angleCount = 0;
			String brackets = "";
			String line = sc.nextLine();

			for (int j = 0; j < line.length(); j++) {
				char temp = line.charAt(j);

				if (isBracket(temp)) {
					brackets += Character.toString(temp);
				}
			}

			for (int j = 0; j < brackets.length(); j++) {
				char bracket = brackets.charAt(j);

				switch (bracket) {
				case '{':
					curlCount++;
					break;
				case '}':
					curlCount--;
					break;
				case '[':
					squareCount++;
					break;
				case ']':
					squareCount--;
					break;
				case '(':
					roundCount++;
					break;
				case ')':
					roundCount--;
					break;
				case '<':
					angleCount++;
					break;
				case '>':
					angleCount--;
				}
			}

			if (curlCount > 0 || squareCount > 0 || roundCount > 0 || angleCount > 0)
				System.out.print(0 + " ");
			else
				System.out.print(1 + " ");
		}
	}

	public static boolean isBracket(char c) {
		switch (c) {
		case '{':
		case '}':
		case '[':
		case ']':
		case '(':
		case ')':
		case '<':
		case '>':
			return true;

		default:
			return false;
		}
	}
}
