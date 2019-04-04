import java.util.Scanner;

class MemOptions{
	
	char memType = '~';
	int memSize = 0;

};	// MemOptions{}


public class Structure{


	private static void getUserOptions(MemOptions mOptions){

		Scanner in = new Scanner(System.in);

		System.out.print("\nPlease enter the desired queue size: ");
		
		String userInput = in.nextLine();
		
		mOptions.memSize = Integer.parseInt(userInput);
		
		char mType = '~';
		
		do{
			System.out.print("\nPlease enter the memory type(S,Q): ");
			userInput = in.nextLine();
			userInput = userInput.toUpperCase();
			mType = userInput.charAt(0);

		}while(mType != 'S' &&  mType != 'Q');
		
		mOptions.memType = mType;

		return;

		}	// getUserOptions()
	
	
	private static MemOptions userOptions = new MemOptions();


	public static void main(String args[]){

		Queue queue;
		Stack stack;
		Memory memType;
		
		getUserOptions(userOptions);

		Choices userChoice = Choices.Q;
		
		switch(userOptions.memType){
			
			case 'S':
				stack = new Stack(userOptions.memSize);	// configure the memory
				memType = stack;
				break;
				
			case 'Q':
				queue = new Queue(userOptions.memSize);
				memType = queue;
				break;
				
			default:
				memType = new Queue(userOptions.memSize);		// default is Queue memory
				break;
		}	// switch(userOptions.memType)

		boolean choiceInvalid = true;
		
		do{
			do{
				try{
					userChoice = memType.getUserInput();
					choiceInvalid = false;
				} catch (IllegalArgumentException e){
					System.out.println("\nChoice invalid!  Please try again.");
					choiceInvalid = true;
					continue;
				}
			}while(choiceInvalid);
			

			switch(userChoice){
				
				case U: 				// push()
					memType.push();
					break;
					 
				case O:					// pop()
					memType.pop();
					break;

				case S:					// show()
					memType.showMemory();
					 break;
					 
				case C:					// clear()
					memType.clearMemory();
					 break;
				
				case G:					// getMemSize()
					memType.getMemSize();
					 break;
				
				case Q:
					break;
				
				default:
					break;

			}	// switch()

		}while(userChoice != Choices.Q);
				
		return;
	}	// main()

}	// TestQueue{}