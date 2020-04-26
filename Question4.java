import java.util.Scanner;

public class Question4
{
  public static void main(String[] args)
  {
    /**
     * Prints a right angle triangle with *. The base of the triangle depends on the integer given.
     *    e.g.
     *     > 5
     *     *****
     *     ****
     *     ***
     *     **
     *     *
     * 
     * Hint: 2 loops are required. System.out.print(...) to print on single line.
     */
     
    Scanner in = new Scanner(System.in);
    /*System.out.print("Enter integer: ");*/
    int inte = in.nextInt();
    
    while (inte != 0)
    {
      for (int i = 0; i < inte; i++)
      {
        System.out.print("*");
      }
      System.out.print("\n");
      inte = inte - 1;
    }
  }
}
