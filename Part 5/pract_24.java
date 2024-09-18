import java.util.*;

public class pract_24 
{
    public static void main(String[] args) 
    {
        int x,y;
        Scanner s = new Scanner(System.in);
        try
        {
            System.out.println("x=");
            x=s.nextInt();
            System.out.println("y=");
            y=s.nextInt();
            if(y==0 )
            {
              throw new ArithmeticException("\nDivision with 0 is not possible:)");
            }
            int c=x/y;
            System.out.println("Result of x / y = " + c);
        }
        catch (InputMismatchException e)
        {
            System.out.println("Enter valid numbers. Error: " + e);
        }
        catch (ArithmeticException e)
        {
            System.out.println("Error in arithmetic operation. Error: " + e);
        }

        
    }
}
