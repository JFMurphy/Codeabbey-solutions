import java.util.Scanner;

public class CelsiusToFarenheit
{
    public static void main (String args[])
    {
        Scanner sc = new Scanner(System.in);
        int count = sc.nextInt();
        double fValue, cValue;
        
        for (int i = 0; i < count; i++)
        {
            fValue = sc.nextInt();
            
            cValue = (fValue - 32) *5 /9;
            System.out.print(Math.round(cValue) + " ");
        }
    }
}