import java.util.Scanner;

public class P12_TimeDifference {

	public static void main(String[] args) {
		// Constants for second in each time period
		final int DAY = 86400;
		final int HOUR = 3600;
		final int MINUTE = 60;
		final int SECOND = 1;
		
		Scanner sc = new Scanner(System.in);
		
		int count = sc.nextInt();
		int day1, hour1, min1, sec1;
		int day2, hour2, min2, sec2;
		
		
		
		for (int i = 0; i < count; i++) {
			int firstDay = 0;
			int secondDay = 0;
			int totalSecDifference = 0;
			int dayDiff, hourDiff, minDiff, secDiff;
			
			day1 = sc.nextInt() * DAY;
			hour1 = sc.nextInt() * HOUR;
			min1 = sc.nextInt() * MINUTE;
			sec1 = sc.nextInt() * SECOND;
			
			day2 = sc.nextInt() * DAY;
			hour2 = sc.nextInt() * HOUR;
			min2 = sc.nextInt() * MINUTE;
			sec2 = sc.nextInt() * SECOND;
			
			firstDay = day1 + hour1 + min1 + sec1;
			secondDay = day2 + hour2 + min2 + sec2;
			
			totalSecDifference = secondDay - firstDay;
			
			dayDiff = totalSecDifference / DAY;
			totalSecDifference = totalSecDifference % DAY;
			
			hourDiff = totalSecDifference / HOUR;
			totalSecDifference = totalSecDifference % HOUR;
			
			minDiff = totalSecDifference / MINUTE;
			totalSecDifference = totalSecDifference % MINUTE;
			
			secDiff = totalSecDifference / SECOND;
			totalSecDifference = totalSecDifference % SECOND;
			
			System.out.format("(%d %d %d %d) ", dayDiff, hourDiff, minDiff, secDiff);
			
		}
	}

}
