import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.math.BigInteger;

public class Problem3e {
	private static BufferedReader stdin = new BufferedReader (new InputStreamReader(System.in));
	
	public static void main(String args[]) throws NumberFormatException, IOException
	{
		System.out.print("Enter the column and row desired of Pascal's triangle in (n,k) form.\nEnter the row number: ");
		int row = Integer.parseInt(stdin.readLine());
		System.out.print("Enter the column number: ");
		int column = Integer.parseInt(stdin.readLine());
		if(column <= row)
		{
			System.out.println(formulaBased(row,column));
		}
		else
		{
			System.out.println("No entry exists at (" + row + "," + column  + ").");
		}
	}

	public static BigInteger formulaBased(int n, int k)
	{
		BigInteger returnInt;
		if(k > n/2)
		{
			returnInt = fallingFactorial(n,k).divide(fallingFactorial(n-k,1));
		}
		else
		{
			returnInt = fallingFactorial(n,n-k).divide(fallingFactorial(k,1));
		}
		return returnInt;
	}
	
	private static BigInteger fallingFactorial(int n, int k)
	{
		BigInteger returnInt = new BigInteger("1");
		for(int i = n; i > k; i--)
		{
			returnInt = returnInt.multiply(BigInteger.valueOf(i));
		}
		return returnInt;
	}
}
