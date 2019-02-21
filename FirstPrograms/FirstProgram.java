import java.lang.Math;
import java.io.*;

public class FirstProgram
{
	public static void main(String[] args) throws IOException
	{
		// Gravity();
		// HeadsOrTails();
		//PrintValue();
		//int[] numList = {2,3,2};
		//RaisedTo(numList);
		//SimpleMath();
		//System.out.println("Factorial of 4 is " + Factorial(4));
		//System.out.println("37 deg C = " + CelsiusToFahrenheit(37));
		//SwapNumbers(1, 2);
		//PrintAlphabet();
		//MathLangFuncs(1, 2, 3, 4);
		//testSwitch();
		//guessKey();
		String str = "Original String";
		testPassingStrings(str);
		System.out.println(str);
	}
	
	
	private static void testPassingStrings(String s){
		s = "Modified String";
		System.out.println(s);
	}
	
	
	
	private static void guessKey() throws IOException
	{
		char guess = '|', answer = 'k';
		
		System.out.print("Guess the character I have in mind: ");
		do{
			
			guess = (char)System.in.read();
			
		} while(guess != answer);
		System.out.println("You got it right.");
	}
	
	
	private static void testSwitch()
	{
		String msg = "";
		
		for(int i=0; i < 5; ++i)
		{
			switch(i){
				
				case 0:
					msg = "Zero";
					break;
					
				case 1:
					msg = "One";
					break;
					
				case 2:
					msg = "Two";
					break;
					
				case 3:
					msg = "Three";
					break;
					
				default:
					msg = "Four";
					break;
			}
			System.out.println(msg);
		}
		
	}	// testSwitch()
	
	
	private static void MathLangFuncs(float x, float a, float t, float y)
	{
		double result = 0;
		
		result = Math.log1p(x + x * x + a * a);
		result = (Math.exp(3 * t) + t * t * Math.sin(4 * t)) * Math.pow(Math.cos(3 * t), 2);
		result = 4 * Math.atan(1);
		result = Math.pow((double)1/Math.cos(x), 2) + (double) 1 / Math.tan(y);
		
		//arccot(x) = pi/2 - arctan(x);
		result = Math.PI/(float)2 - Math.atan(x/a);
		
		
	}
	
	private static void PrintAlphabet()
	{
		System.out.println('\n');

		for (char c = 'a'; c <= 'z'; ++c){
			System.out.print((char)c);
		}
		
		System.out.println('\n');
		
		for (char c = 'z'; c >= 'a'; --c){
			System.out.print((char)c);
		}

	}
	
	private static void SwapNumbers(int x, int y)
	{
		System.out.println("Before: x = " + x + "  y = " + y);
		int t = x;
		x = y;
		y = t;
		System.out.println("After: x = " + x + "  y = " + y);
	}
	
	private static void SimpleMath()
	{
		double result = 0;
		
		result = Math.pow(2 * Math.PI, 2);
		System.out.println("Square of 2 * pi = " + result);
		
		result = 2 * Math.pow(Math.PI, 2);
		System.out.println("2 * pi^2 = " + result);

		result = Math.cbrt(2.3 * 4.5);
		System.out.println("cube root of (2.3 x 4.5) = " + result);
		
		result = Math.pow((2.3 * 4.5), (double) 1/3);
		System.out.println("cube root of (2.3 x 4.5) = " + result);
		
		result = (1.23e-5 + 5.678e-3) * 4.567e-5;
		System.out.println("(0.0000123 + 5.678 x 10^-3) x  0.4567 x 10^-4 = " + result);
		
		float a = 2, b = 3, c = 5;
		int i = 2, j = 3;
//		result = ()
	}
	
	
	private static double CelsiusToFahrenheit(int celsius)
	{
		return (9 * celsius)/(float)5 + 32;
	}
	
	private static int Factorial(int x)
	{
		int factorial = 1;
		
		for (int i = x; i > 0; --i)
		{
			factorial *= i;
		}
		
		return factorial;
	}
	

	private static void PrintValue()
	{
		System.out.println(1/2e-1);	// 1 / 2 / 10
		System.out.println(5 % 3 % 2);
	}
	
	private static void Gravity()
	{
		double u = 1, g = 2, t = 3, s = 0;
		
		s = u * t - g * Math.pow(t, 2) / 2;
		
		System.out.println(" s = " + s);
	}
	
	private static void RaisedTo(int[] nums)
	{
		double power = 1;
		
		for (int i = nums.length; i > 0; --i)
		{
			System.out.println("num = " + nums[i - 1] + "  power = " + power);
			power = Math.pow(nums[i - 1], power);
		}
		System.out.println("Total = " + power);
		
	}
	
	private static void HeadsOrTails()
	{
		double x = Math.random();
		
		if (x < 0.5){
			System.out.println("Heads");
		} else {
			System.out.println("Tails");
		}
	}
}