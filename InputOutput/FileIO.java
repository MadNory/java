import java.io.*;
//import java.util.Scanner;

public class FileIO
{
	public static void main(String[] args)
	{	
		String filePath = "C:\\Users\\anthondd\\Documents\\Personal\\Java\\input.txt";
		//readInText(filePath);
		readInIntegers(filePath);
	}
	
	
	private static void readInIntegers(String fPath)
	{
		try{
			
			BufferedReader in = new BufferedReader (new FileReader(fPath));
			String line = null;
			
			int total = 0;
			
			while((line = in.readLine()) != null)
			{
				total += Integer.parseInt(line);
				System.out.println(line);
			}
			System.out.println("Total: " + total);
		} 
		catch(IOException ex){
			System.out.println("An error occured in opening the input file");
		}
		
	}
	
	private static void readInText(String fPath)
	{
		try{
			
			FileReader in = new FileReader(fPath);
			int i = 0;
			while ((i = in.read()) != -1){
				System.out.println((char) i);
			}
		}
		catch (IOException ex){
			System.out.println("An error occured in opening the input file");
		}
	}
	
/* 	{
		Scanner in = new Scanner(System.in);
		
		FileInputStream fileIn = null;
//		FileOutputStream out = null;
		int x = 0, sum = 0, xCount = 0;
		
		System.out.print("Please enter a file name: ");
		String fileName = in.nextLine();
		
		try{
			if (fileName.length() > 0){
			
				fileIn = new FileInputStream(fileName);
				while((x = fileIn.read()) != -1){
					++xCount;
					sum += x;
				}
			}
		}
		finally{
			System.out.println("/nThe average of the " + xCount + "numbers is " + (float)(sum/xCount) );
		}
	}
 */	
}