import java.util.Scanner;

public class NewtonSqrt
{
	public static void main(String args[])
	{
		int PRECISION = 6;
		Scanner in = new Scanner(System.in);
		double x = 1;
		
		System.out.print("Enter number to be square-rooted: ");
		double a = in.nextFloat();
		
		for(int i=0; i < PRECISION; ++i)
		{
			x = (x + a/x)/2;
			System.out.println(x);
		}
		
		System.out.println("Newton's square root of " + a + " is equal to " + x);
	}
}