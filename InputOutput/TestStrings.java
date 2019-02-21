import java.util.Scanner;
import java.net.*;
import java.io.*;

public class TestStrings
{
	public static void main(String[] args)
	{
		//compareStrings();
		//reverseString();
		//kilosToPounds();
/*
		try{
			getURL();
		} catch (IOException e){
			System.out.println(e.toString());
		}
*/
		String s = "String before passString()";
		System.out.println(s);
		s = passString(s);
		System.out.println(s);
		
	}	// main()


	private static String passString(String str)
	{
		str = "String inside passString()";
		System.out.println(str);
		return str;
	}	// passString()
	
	
	private static void getURL() throws IOException
	{
		Scanner in = new Scanner(System.in);
		
		System.out.print("Please enter a URL: ");
		
		String link = in.nextLine();
		
		try {
			
			URL url = new URL(link);
			
		} catch (IOException e){
			
			System.out.print("Please enter a valid URL: ");
			link = in.nextLine();
		}
	}	// getURL()

	
	private static void kilosToPounds()
	{
		Scanner in = new Scanner(System.in);
		
		System.out.print("Please enter number of kilos: ");
		
		String strKgs = in.nextLine();
		
		float kilos = Float.parseFloat(extractNumber(strKgs));
		double pounds = kilos / 2.2;
		
		System.out.println(kilos + " kgs = " + pounds + " lbs");
	}	// kilosToPounds()
	
	
	
	private static String extractNumber(String weight)
	{
		String strNum = weight;
		
		for(int i = 0; i < weight.length(); ++i)
		{
			char chr = weight.charAt(i);
			
			if (Character.isLetter(chr)){
				strNum = weight.substring(0, i);
				break;
			} else if (chr == ' '){
				strNum = weight.substring(0, i + 1);
				break;
			}
		}
		
		return strNum;
	}	// extractNumber()
	
	
	private static void reverseString()
	{
		Scanner scanner = new Scanner(System.in);
		String enteredString = "";
		
		System.out.print("Please enter a string: ");
		enteredString = scanner.nextLine();
		
		System.out.println("\nThe string reversed is: ");
		for(int i = enteredString.length(); i > 0; --i)
		{
			System.out.print(enteredString.charAt(i - 1));
		}
	}	// reverseString()

	
	private static void compareStrings()
	{
		Scanner scanner = new Scanner(System.in);
		String string_1 = "", string_2 = "";
		
		System.out.print("Please enter a string: ");
		string_1 = scanner.nextLine();
		
		System.out.print("Please enter another string: ");
		string_2 = scanner.nextLine();
		
//		if (string_1.equals(string_2)){
		try{

			if (string_1.compareTo(string_2) > 0){
				System.out.println("The strings are not the same.");
			} else {
				System.out.println("The strings are the same.");
			}

		} catch(NullPointerException e) {

			System.out.println("\n\nError: " + e.toString());

		}	// try-catch
	}	// compareStrings()
	
}	// TestStrings{}