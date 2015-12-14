import java.util.Scanner;

public class P019_MatchingBrackets {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int count = sc.nextInt();
		boolean roundOpen = false;
		boolean squareOpen = false;
		boolean curlyOpen = false;
		boolean angleOpen = false;

		for (int i = 0; i < count; i++) {
			String line = sc.nextLine();

			for (int j = 0; j < line.length(); j++) {

				switch (line.charAt(j)) {
				case '(':
					int openBracket = j;
					int closeBracket = line.indexOf(')');

					if (closeBracket > -1)

						break;

				case '[':

					break;

				case '{':

					break;

				case '<':

					break;
				}
			}
		}

		sc.close();
	}

	private void checkRoundBracket(String line, int startPoint, int endPoint) {

	}

	private void checkSquareBracket(String line, int startPoint, int endPoint) {
		String insideBrackets = line.substring(startPoint + 1, endPoint);

		for (int i = 0; i < insideBrackets.length(); i++) {
			int sOpenBracket = i;
			int sCloseBracket = insideBrackets.indexOf(']');

		}
	}

	private void checkCurlyBracket(String line, int startPoint, int endPoint) {

	}

	private void checkAngleBracket(String line, int startPoint, int endPoint) {

	}
}
