import java.io.*;

class Help
{
	private String structName = "";
	private String structSyntax = "";
	
	Help(String name, String syntax){
		this.structName = name;
		this.structSyntax = syntax;
	}	// constructor()
	
	public String getName(){
		return this.structName;
	}
	
	public String getStruct(){
		return this.structSyntax;
	}
	
}	// Help {}


public class HelpDemo
{
	private static Help[] helpList = new Help[3];
	
	public static void main(String args[]) throws IOException
	{
		char sel = '~', ignoreKey = '~';
		
		buildMenu();
		displayMenu();
		
		do{
			
			System.out.print("Please select from the menu: ");
			sel = (char) System.in.read();
			
			do{
				ignoreKey = (char)System.in.read(); 
			}while(ignoreKey != '\n');
			
			if (isValid(sel)){
				helpOn(sel);
			}

		}while(sel != 'q');
		
		return;
	}	// main()

	
	private static boolean isValid(char s)
	{
		boolean validSel = false;
		
		switch(s){
			
			case '1':
			case '2':
			case '3':
				validSel = true;
				break;
			
			default:
				validSel = false;
				break;
		}
		
		return validSel;
	}	// isValid()


	private static void helpOn(char s)
	{
		int menuNum = Integer.parseInt(Character.toString(s));
		System.out.println(helpList[menuNum].getStruct());
		
	}	// helpOn()


	private static void displayMenu()
	{

		System.out.println("");
		
		for(int i = 0; i < helpList.length; ++i){
			System.out.println((i + 1) + ") " + helpList[i].getName());
		}
		return;

	}	// displayMenu()
	
	
	private static void buildMenu()
	{
		helpList[0] = new Help("if-else", "if (condition) statement/s;");
		helpList[1] = new Help("switch", "switch(x){ case (lit):  statement/s; break;");
		helpList[2] = new Help("for", "for (init; condition; increment)");
		return;
	}	// buildMenu()
}