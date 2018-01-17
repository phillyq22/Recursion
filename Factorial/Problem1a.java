import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.math.BigInteger;
/*
 * Using an int value for returnInt, the highest value n0 for iFactorial is 12. At 13, an answer of 1932053504 is given instead of the correct 6227020800. This is due to the fact that Integer only produces values from the interval [-2^31,2^31); once either the min or max is hit, the value either begins to get larger, or smaller. 
 *
 * When using a long value for returnInt, the highest value n1 for iFactorial is 12. At 13, an answer of -4249290049419214848 is given instead of the correct 51090942171709440000. This is due to the fact that Long only produces values from the interval [-2^63,2^63); once either the min or max is hit, the value either begins to get larger, or smaller.
 * 
 * Using an abstract data type, such as BigInteger or a custom data type larger than 64 bits could increase the potential size of n.
 * 
 * Whenever very large input is used, a Java.lang.StackOverflowError is thrown.
 */
public class Problem1a {

    private static BufferedReader stdin = new BufferedReader (new InputStreamReader(System.in));

	public static void main(String[] args) throws NumberFormatException, IOException
	{
		System.out.println("Enter the value that you would like to find the factorial of: ");
		rFactorial(Integer.parseInt(stdin.readLine()));
	}

	private static int rFactorial(int n) {
		int returnInt = -1;
		if(n == 1 || n == 0)
		{
			returnInt = 1;
		}
		else
		{
			returnInt = n*rFactorial(n-1);
		}
		System.out.println(returnInt + ": " + n);
		return returnInt;
	}
}
