import java.util.Scanner;
import java.util.ArrayList;
public class Question5
{
  public static void main(String[] args)
  {
    /**
     * Prompt the user for number. This input indicates the number of integers the user will be entering next. 
     * Print out the mode (highest occurrence) from the set of integers. 
     *    e.g.
     *     > 5
     *     > 2
     *     > 4
     *     > 1
     *     > 3
     *     > 4
     *     4
     * 
     *    e.g.
     *     > 4
     *     > 2
     *     > 2
     *     > 3
     *     > 3
     *     2
     * Hint: Use a loop to get input. Use another 2 loops to find the mode
     */
     
     
     Scanner in = new Scanner(System.in);
     int input;
     ArrayList<Integer> allInt = new ArrayList<Integer>();

     System.out.print("Enter the numbers: ");
     int num = in.nextInt();

     for (int i=0;i<num;i++)
     {
         input = in.nextInt();
         allInt.add(input);
     }

     int counter = 0;
     int imostCount = 0;
     int mode = 0;
     for (int j=0;j<allInt.size();j++)
     {
         for (int k=0;k<allInt.size();k++)
         {
             if (allInt.get(j) == allInt.get(k))
             {
                 counter++;
             }
         }
         if(counter > imostCount)
         {
             mode = allInt.get(j);
             imostCount = counter;
         }
         counter = 0;
     }
     System.out.println("The mode is: " + mode);
  }
}
