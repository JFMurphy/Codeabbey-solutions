import java.util.Scanner;

public class AverageOfAnArray {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int count = Integer.parseInt(sc.nextLine());
		
		for (int i = 0; i < count; i++) {
			//sc.nextLine();
			double totalOfArray = 0;
			double average = 0;
			
			String[] sArray = sc.nextLine().split(" ");
			int[] iArray = new int[sArray.length];
			
			for (int j = 0; j < sArray.length; j++) {
				iArray[j] = Integer.parseInt(sArray[j]);
				totalOfArray += iArray[j];
			}
			
			average = totalOfArray / (iArray.length -1);
			System.out.println(Math.round(average) + " ");
			
		}
	}

}
