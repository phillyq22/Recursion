import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class extraCredit {
	 private static BufferedReader stdin = new BufferedReader (new InputStreamReader(System.in));

		public static void main(String args[]) throws NumberFormatException, IOException
		{
			System.out.print("Enter the row of Pascal's triangle you would like to view: ");
			int n = Integer.parseInt(stdin.readLine());
			if(n > 0)
			{
				iPascTri2Array(n);
			}
			else
			{
				System.out.println("There is no " + n + " row.");
			}
		}
		
		public static void iPascTri2Array(int n)
		{
			int[] row1 = new int[0];
			int[] row2 = new int[1];
			for(int i = 0; i < n; i++)
			{
				for(int j = 0; j <= i; j++)
				{
					if((i == j)||(i == 1)||(j == 0))
					{
						row2[j] = 1;
						System.out.print(row2[j] + " ");
					}
					else
					{
						row2[j] = (row1[j-1]+row1[j]);
						System.out.print(row2[j] + " ");
					}
				}
				System.out.println();
				row1 = row2;
				row2 = new int[i+2];
			}
		}
}