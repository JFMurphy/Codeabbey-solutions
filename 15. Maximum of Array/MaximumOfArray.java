import java.util.Scanner;

public class MaximumOfArray 
{
    public static void main(String[] args)
    {
        int maxArray = 0;
        int minArray = 0;
        
        Scanner sc = new Scanner(System.in);
        
        int[] input = new int[300];
        for (int i = 0; i < 300; i++)
        {    
            input[i] = sc.nextInt();
        }
        
        int numberOfValues = input.length;
        
        for (int i = 0; i < numberOfValues; i++)
        {
            if (input[i] > maxArray)
            {
                maxArray = input[i];
            } else if (input [i] < minArray) {
                minArray = input[i];
            }
        }
        
        System.out.println(maxArray + " " + minArray);
    }
    
}
