import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Problem2 {
	private static int numMethodCalls = 0;
	private static int numDisksMoved = 0;

    private static BufferedReader stdin = new BufferedReader (new InputStreamReader(System.in));

	public static void main(String[] args) throws NumberFormatException, IOException
	{
		System.out.println("Enter the number of disks stacked on the tower of Hanoi: ");
		String I = "Initial";
		String D = "Dest";
		String T = "Temp";
		solve(Integer.parseInt(stdin.readLine()),I,D,T);
		System.out.println("Total method calls: " + numMethodCalls +"\nTotal disk moves: " + numDisksMoved);
	}

	private static void solve(int n, String I, String D, String T)
	{
		numMethodCalls++;
		if(n > 0)
		{
			solve(n-1,I,T,D);
			System.out.println("Move disk " + n + " from " + I + " to " + D);
			numDisksMoved++;
			solve(n-1,T,D,I);
		}
	}
}
