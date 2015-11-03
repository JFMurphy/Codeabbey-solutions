import java.util.Scanner;

public class ModularCalculator {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		String[] temp = sc.next().split(" ");
		
		/*String input = "";
		int i = 0;
		while (sc.hasNext()) {
			if (sc.next().equals("%")) {
				input += Integer.toString(sc.nextInt());
				break;
			}
			
			input += sc.next() + " ";
			i++;
		}
		
		
		String line[] = input.split(" ");*/
		
		for (int j = 0; j < temp.length; j++) {
			System.out.println(temp[j]);
		}
		
	}
}
