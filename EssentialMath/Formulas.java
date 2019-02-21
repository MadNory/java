import java.util.Scanner;

public class Formulas
{
	public static void main(String[] args)
	{
		// printOddNumbers();
		// sumEvenNumbers(200);
		// degreeToRadians();
		USPopulation();
	}	// main()
	
	
	
	
	private static double usPopulationPerYear(t)
	{
		long final POPULATION_CONST 197273000;
		double popPerYr = 0, powerOfE = -0.03134*(t - 1913.25);
		
		popPerYr = POPULATION_CONST / (1 + Math.pow(Math.E, powerOfE));
	}
	
	private static void degreeToRadians()
	{
		System.out.println("Deg   Radians   Sin      Cos");
		double radians = 0, sine = 0, cosine = 0;
		
		for(int deg = 0; deg <= 360; deg += 10)
		{
			radians = Math.PI * deg / 180;
			sine = Math.sin(radians);
			cosine = Math.cos(radians);
			System.out.format("%-6d%-10.3f%-9.3f%-9.3f%n", deg, radians, sine, cosine);
		}
	}	// degreeToRadians()
	
	
	private static void sumEvenNumbers(int n)
	{
		long sum = 0;
		
		for (int i = n; i > 0; i -=2){
			sum += i;
		}
		System.out.println("Sum of even numbers from " + n + " to 0: " + sum);
	}	// sumEvenNumbers()
	
	
	private static void printOddNumbers()
	{
		Scanner in = new Scanner(System.in);
		
		System.out.print("Please enter an integer: ");
		int n = in.nextInt();
		
		System.out.println("This will print out all the odd numbers from " + n + " to 1");
		
		if ((n % 2) == 0){	// odd number?
			--n;			// reduce by 1 to get an odd number
		}
		
		for (int i = n; i > 0; i -= 2){
			System.out.print(i + " ");
		}
	}	// printOddNumbers()
}