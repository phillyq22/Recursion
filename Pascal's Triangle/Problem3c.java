import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Problem3c {
	 private static BufferedReader stdin = new BufferedReader (new InputStreamReader(System.in));

		public static void main(String args[]) throws NumberFormatException, IOException
		{
			System.out.print("Enter the row of Pascal's triangle you would like to view: ");
			int n = Integer.parseInt(stdin.readLine());
			if(n > 0)
			{
				iPascTri(n);
			}
			else
			{
				System.out.println("There is no " + n + " row.");
			}
		}
		
		public static void iPascTri(int n)
		{
			int array[][] = new int[n+1][n+1];
			for(int i = 0; i <= n; i++)
			{
				for(int j = 0; j <= i; j++)
				{
					if((i == j)||(i == 1)||(j == 0))
					{
						array[i][j] = 1;
						System.out.print(array[i][j] + " ");
					}
					else
					{
						array[i][j] = array[i-1][j-1]+array[i-1][j];
						System.out.print(array[i][j] + " ");
					}
				}
				System.out.println();
			}
		}
		
		
}

