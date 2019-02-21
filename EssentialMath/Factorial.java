import java.util.Scanner;

public class Factorial
{
	public static void main(String args[])
	{
		Scanner in = new Scanner(System.in);
		
		int x = 0;
		
		do{
		
			System.out.print("Enter a positive integer: ");
			
			x = in.nextInt();
			
		} while(x < 0);
		
		int factrl = 1;
		
		for(int i = x; i > 0; --i)
		{
			factrl *= i;
		}
		
		System.out.println("\n The factorial of " + x + " is " + factrl);
	}
}