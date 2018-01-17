import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Problem3d {
	private static BufferedReader stdin = new BufferedReader (new InputStreamReader(System.in));

	public static void main(String args[]) throws NumberFormatException, IOException
	{
		System.out.print("Enter the column and row desired of Pascal's triangle in (n,k) form.\nEnter the row number: ");
		int row = Integer.parseInt(stdin.readLine());
		System.out.print("Enter the column number: ");
		int column = Integer.parseInt(stdin.readLine());
		if(column <= row)
		{
			System.out.println(iBinomialCoeff(row,column));
		}
		else
		{
			System.out.println("No entry exists at (" + row + "," + column  + ").");
		}
	}

	public static int iBinomialCoeff(int n, int k) {
		int array[][] = new int[n+1][n+1];
		for(int i = 0; i <= n; i++)
		{
			for(int j = 0; j <= i && j <= k; j++)
			{
				if((i == j)||(i == 1)||(j == 0))
				{
					array[i][j] = 1;
				}
				else
				{
					array[i][j] = array[i-1][j-1]+array[i-1][j];
				}
			}
		}
		return array[n][k];
	}
}
