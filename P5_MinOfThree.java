import java.util.Scanner;

public class P5_MinOfThree
{
	public static void main(String[] args)
	{
		Scanner in = new Scanner(System.in);
		int n = in.nextInt();
		int a = 0;
		int b = 0;
		int c = 0;
		
		int answer = 0;
		
		for (int i = 0; i < n; i++)
		{
			a = in.nextInt();
			b = in.nextInt();
			c = in.nextInt();
			
			if (a < b && a < c)
			{
				answer = a;
			} else if ( b < a && b < c)
			{
				answer = b;
			}else if (c < a && c < b)
			{
				answer = c;
			}
			System.out.println(answer + " ");
		}
	}
}