import java.util.*;
public class EuclidsAlgo
{
	public static void main(String args[])
	{
	    Scanner sc= new Scanner(System.in);
	    long input1 = sc.nextLong();
	    long input2 = sc.nextLong();
	    long result = greatestCommonDenominator(input1, input2);
	    System.out.print("The Greatest Common Denominator of " + input1 + " and " + input2 + " is " + result);
	}
    public static long greatestCommonDenominator(long num1, long num2)
    {
	   if(num2==0)
	   {
	       return num1;
	   }
	   else 
	   {	
	       return greatestCommonDenominator(num2, num1%num2);
	   }
    }
}