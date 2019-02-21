import java.util.*;
import java.io.*;

public class EssentialMath
{
	
	public static void main(String[] args)
	{
//		fibonacci(30);
/*
		try{
			getAverage();
		} catch(Exception e)
		{
			System.out.println(e.toString());
		}
*/
//		generateRandom();
		drunkSailor();
		
	}	// main()

	
	private static void drunkSailor()
	{
		final int TOTAL_STEPS = 1000;
		final int STEPS_TO_SHIP = 300;
		int leftSteps = 0, rightSteps = 0, forwardSteps = 0;
		double nextStep = 0;

		Random randNum = new Random();
		
		for (int i = 0; i < TOTAL_STEPS; ++i)
		{
			nextStep = randNum.nextDouble();
			
			if (nextStep < 0.333){
				++forwardSteps;
			} else if (nextStep < 0.666) {
				++leftSteps;
			} else {
				++rightSteps;
			}
		}
		
		System.out.println("Left Steps: " + leftSteps);
		System.out.println("Right Steps: " + rightSteps);
		System.out.println("Forward Steps: " + forwardSteps);

	}	// drunkSailor()
	

	private static void generateRandom()
	{
		final int SEED = 5;
		Random randNum = new Random(SEED);
		long rNum = 0;
		
		for(int i = 1; i < 5; ++i){
			rNum = Math.round(randNum.nextDouble() * 100);
			System.out.println("Random number: " + rNum);
		}
		
		System.out.println();
		
		randNum = new Random(5);
		for(int i = 1; i < 5; ++i){
			rNum = (long)Math.floor(randNum.nextDouble() * 100);
			System.out.println("Random number: " + rNum);
		}

		System.out.println();

		randNum = new Random(5);
		for(int i = 1; i < 5; ++i){
			rNum = (long)Math.ceil(randNum.nextDouble() * 100);
			System.out.println("Random number: " + rNum);
		}

	}	// generateRandom()
	
	
	private static void getAverage()
	{
		System.out.println("Enter numbers separated by space/s in a line and then press enter: ");
		BufferedReader buffr = new BufferedReader(new InputStreamReader(System.in));
		
		try{
			
			String numsEntered = buffr.readLine();
			StringTokenizer st = new StringTokenizer(numsEntered);
			double sum = 0, avg = 0;
			int numCount = 0, errCount = 0;
			
			while(st.hasMoreTokens())
			{
				String n = st.nextToken();
				
				try{

					double num = Double.parseDouble(n);
					sum += num;
					++numCount;

				} catch(NumberFormatException e){
					
					++errCount;
					System.out.println("Invalid entry (" + n + ") at position at " + (numCount + errCount) + " ignored.");

				}	// try-catch()
			}
			
			if(numCount > 0){
				avg = sum/numCount;
			}
			
			System.out.println("The average of the valid " + numCount + " numbers entered is: " + avg);

			} catch (IOException e){
			System.out.println("Error in getting numbers. (" + e.toString() + ")");
		}

	}	// getAverage()
	
	
	private static void fibonacci(int maxNum)
	{
		final int FIRSTFIBS = 30;
		int result = 1; 
		int[] fibNums = new int[FIRSTFIBS];
		
		for (int i = 0; i < fibNums.length; ++i)
		{
			if (i < 2){
				fibNums[i] = 1;
			} else {
				fibNums[i] = fibNums[i - 2] + fibNums[i - 1];
			}
		}
		
		for(int x = 0; x < fibNums.length; ++x)
		{
			System.out.print(fibNums[x] + " ");
		}
		System.out.println();
	}
	
	
	

	public static double binomCoeff(int n, int r)
	{
		double bc = 0, numer = 1, denom = factorial(r);
		
		// compute numerator
		for (int i = n; i > (n - r); --i)
		{
			numer *= i;
		}
		System.out.println("numer = " + numer);
		
		return (numer / denom);

	}	// binomCoeff()
	
	
	public static long factorial(int x)
	{
		long result = 1;
		
		for(int i = x; i > 0; --i)
		{
			result *= i;
		}
		
		return result;
	}	// factorial()

}