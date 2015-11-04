import java.util.Scanner;

public class P19_MatchingBrackets {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int count = sc.nextInt();
		
		for (int i = 0; i < count; i++) {
			String line = sc.nextLine();
			
			for (int j = 0; j < line.length(); j++) {
				
				switch(line.charAt(j)) {
				case '(':
					
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
	}
}
