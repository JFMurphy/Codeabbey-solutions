import java.util.Scanner;

public class P6_Rounding
{
    public static void main (String args[])
    {
        Scanner sc = new Scanner(System.in);
        int count = sc.nextInt();
        
        for (int i = 0; i < count; i++)
        {
            double a = sc.nextInt();
            double b = sc.nextInt();
            
            double answer = a / b;
            
            double rounded = Math.round(answer);
            
            System.out.print((int)(rounded) + " ");
            
        }
    }
}