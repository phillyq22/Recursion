import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Problem3a {

    private static BufferedReader stdin = new BufferedReader (new InputStreamReader(System.in));

	public static void main(String args[]) throws NumberFormatException, IOException
	{
		System.out.print("Enter the column and row desired of Pascal's triangle in (n,k) form.\nEnter the row number: ");
		int row = Integer.parseInt(stdin.readLine());
		System.out.print("Enter the column number: ");
		int column = Integer.parseInt(stdin.readLine());
		if(column <= row)
		{
			System.out.println(rBinomialCoeff(row,column));
		}
		else
		{
			System.out.println("No entry exists at (" + row + "," + column  + ").");
		}	}
	
	public static int rBinomialCoeff(int n,int k)
	{
		int returnInt = -1;
		if(k == 0 || n == k)
		{
			returnInt = 1;
		}
		else
		{
			returnInt = rBinomialCoeff(n-1,k) + rBinomialCoeff(n-1,k-1);
		}
		return returnInt;
	}
}