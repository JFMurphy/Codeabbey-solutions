import java.util.Scanner;

public class P8_ArithmeticProgression
{
    public static void main (String args[])
    {
        Scanner sc = new Scanner(System.in);
        int count = sc.nextInt();
        int initialValue, stepSize, increments, answer, m; // "m" is a multiplier that will be incremented by 1 each loop.
        
        for (int i = 0; i < count; i++)
        {
            initialValue = sc.nextInt();
            stepSize = sc.nextInt();
            increments = sc. nextInt();
            answer = initialValue;
            m = 1;
            
            for (int j = 1; j < increments; j++)
            {
                answer = answer + (initialValue + (m*stepSize));
                if (m < increments)
                {
                    m++;
                }
                //System.out.print(m + ": " + answer + " ");
            }
            
            System.out.print(answer + " ");
        }
    }
}