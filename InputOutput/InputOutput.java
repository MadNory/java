import java.util.Scanner;
import java.io.*;
import java.util.*;
import java.net.*;


public class InputOutput
{
	public static void main(String[] args) throws IOException
	{
		// inputUsingScanner();
		// inputUsingBuffer();
//		 readTextFile();
		// writeTextFile();
//		tokenTextFile();
//		readFromInternet();
//		readFromPrompt(args);
//		printChars();
//		readDirectory();
//		readWriteToFile(args);
//		keyboardTest();
//		walaLang();
		changeCase();

	}	// main()
	
	
	private static void changeCase() throws IOException
	{
		char c = '.';
		int changed = 0, count = 0;
		
		do{
			
			c = (char) System.in.read();
			++count;
			
			if (c >= 'a' && c <= 'z'){
				System.out.printf("%c", c - 32);
				++changed;
			} else if (c >= 'A' && c <= 'Z'){
				System.out.printf("%c", c + 32);
				++changed;
			} else {
				System.out.print(c);
			}
			
		}while(c != '.');
		
		System.out.println("\n" + changed + " out of " + count + " entered characters changed.");
	}	// changeCase()
	
	
	private static void walaLang()
	{
		for(int i=1, j=1; i < 25; j *= 2, ++i)
		{
			System.out.print(j + ", ");
		}
		System.out.println();
	}	// walaLang()
	

	private static void keyboardTest() throws IOException
	{
		char keyPressed = '~', ignoreKey = '~';
		int dotCount = 0;
		
		for(;keyPressed != 'q';){
			
			System.out.print("Press key: ");

			keyPressed = (char) System.in.read();

			do{
				ignoreKey = (char) System.in.read();
			}while(ignoreKey != '\n');
			
			if (keyPressed == '.'){
				++dotCount;
			}
		}	// for()
		
		System.out.println("Number of '.' entered: " + dotCount);
		
	}	// keyboardTest()

	
	private static void readDirectory() throws IOException
	{
		BufferedReader din = new BufferedReader(new InputStreamReader(System.in));
		System.out.print("Enter a path: ");
		String path = din.readLine();

		File dir = new File(path);
		
		if (dir.exists()){
			
			System.out.println(path + " exists.");
			
			if (dir.isDirectory()){
				//System.out.print(path + " is a directory.");
				String fileList[] = dir.list();
				
				for (int i = 0; i < fileList.length; ++i){
					System.out.println(fileList[i]);
				} 
			} else {
				System.out.print(path + " is not a directory.");
			}
			
		} else {
			System.out.println(path + " does not exists.");
		}

	}	// fileDirectory()
	
	
	private static void printChars()
	{
		for(int i=35; i < 125; ++i)
		{
			System.out.printf("%c", i);
		}
	}
	

	private static void readFromPrompt(String[] a)
	{
		long sum = 0;
		int x = 0;
		
		for(int i=0; i < a.length; ++i){
			
			x = Integer.parseInt(a[i]);
			
			sum += x;
			if (i == (a.length - 1)){
				System.out.print(a[i] + " = " + sum);
			} else {
				System.out.print(a[i] + " + ");
			}
		}	// for()
			
//		System.out.println(a[0] + " + " + a[1] + " = " + (Integer.parseInt(a[0]) + Integer.parseInt(a[1])));
	}
	
	
	private static void readFromInternet() throws IOException
	{
		BufferedReader din = new BufferedReader(new InputStreamReader(System.in));
		System.out.print("Enter a URL: ");
		String url = din.readLine();
		
		URL link = new URL(url);
		BufferedReader urlStream = new BufferedReader(new InputStreamReader(link.openStream()));
		
		String line = "";
		
		do{
			line = urlStream.readLine();
			System.out.println(line);
		}while(line != null);
	}	// readFromInternet()
	

	private static void readWriteToFile(String[] fileNames) throws IOException
	{
		BufferedReader file_in = new BufferedReader(new FileReader(fileNames[0]));
		PrintWriter file_out = new PrintWriter(new FileWriter(fileNames[1]));
		
		String line = file_in.readLine();	// ignore the first line
		
		StringTokenizer st = new StringTokenizer(line);
		String nextValue = "";
		
		while(st.hasMoreTokens()){
			nextValue = st.nextToken();
			file_out.println(nextValue);
		}	// while()
		
		file_in.close();
		file_out.close();
	}

	
	private static void tokenTextFile() throws IOException
	{
		BufferedReader file_in = new BufferedReader(new FileReader("weather.txt"));
		PrintWriter file_out = new PrintWriter(new FileWriter("weather_new.txt"));
		
		String line = file_in.readLine();	// ignore the first line
		
		line = file_in.readLine();
		
		while(line != null){
			
			StringTokenizer st = new StringTokenizer(line, "-");
			file_out.print(st.nextToken());
			st.nextToken();		// ignore tempMax
			st.nextToken();		// ignore tempMin
			file_out.print(" " + st.nextToken());	// write rain field
			file_out.println(" " + st.nextToken());	// write wind value
			st.nextToken();		// ignore humid
			line = file_in.readLine();	// read next line from input file
		}	// while()
		
		file_in.close();
		file_out.close();
		
	}	// tokenTextFile()
	
	
	private static void writeTextFile() throws IOException
	{
		PrintWriter pout = new PrintWriter(new FileWriter("new.txt"));
		pout.println("Java writing to file test.");
		pout.close();
	}
	
	
	private static void readTextFile() throws IOException
	{
		BufferedReader kb_in = new BufferedReader(new InputStreamReader(System.in));
		System.out.println("Enter the name of the file to be read: ");
		String fileName = kb_in.readLine();
		
		BufferedReader file_in = new BufferedReader(new FileReader(fileName));
		System.out.println("Contents of file:");
		String line = file_in.readLine();
		
		while(line != null){
			System.out.println(line);
			line = file_in.readLine();
		}
		file_in.close();
	}	// readTextFile()
	
	
	private static void inputUsingBuffer() throws IOException
	{
		BufferedReader din = new BufferedReader(new InputStreamReader(System.in));
		System.out.print("Enter a String: ");
		String s = din.readLine();
		System.out.println("You entered: " + s);
	}

	
	private static void inputUsingScanner()
	{
		Scanner in = new Scanner(System.in);
		
		System.out.print("Enter a number: ");
		
		float num_1 = in.nextFloat();
		
		System.out.print("Enter another number: ");
		
		float num_2 = in.nextFloat();
		
		System.out.println(num_1 + " * " + num_2 + " = " + (num_1 * num_2));
	}
}