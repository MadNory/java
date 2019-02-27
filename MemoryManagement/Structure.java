import java.util.Scanner;

enum Choices { U, O, S, C, Q }	// Possible Actions: Push, Pop, Show, Clear, Quit respectively.

class MemOptions{
	
	char memType = '~';
	int memSize = 0;

};	// MemOptions{}


public class Structure{

	private static Action Options[] = new Action[Choices.Q.ordinal() + 1];

	
	private static void buildOptions(){

		Options[Choices.U.ordinal()] = new Action('U', "Push");
		Options[Choices.O.ordinal()] = new Action('O', "Pop");
		Options[Choices.S.ordinal()] = new Action('S', "Show");
		Options[Choices.C.ordinal()] = new Action('C', "Clear");
		Options[Choices.Q.ordinal()] = new Action('Q', "Quit");
		
		return;

	}	// buildOptions()


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
		
		getUserOptions(userOptions);

		buildOptions();		// Build the user menu options
		Choices userChoice = Choices.Q;
		
		switch(userOptions.memType){
			
			case 'S':
			
				stack = new Stack(userOptions.memSize);
				boolean choiceInvalid = true;
				
				do{
					do{
						try{
							userChoice = stack.getUserInput(Options);
							choiceInvalid = false;
						} catch (Exception e){
							System.out.println("\nChoice invalid!  Please try again.");
							choiceInvalid = true;
							continue;
						}
					}while(choiceInvalid);
					
					switch(userChoice){
						
						case U: 				// push()
							stack.push();
							break;
							 
						case O:					// pop()
							stack.pop();
							break;

						case S:					// show()
							stack.showMemory();
							 break;
							 
						case C:					// clear()
							stack.clearMemory();
							 break;
						
						case Q:
							break;
						
						default:
							break;

					}	// switch()

				}while(userChoice != Choices.Q);
				break;
				
				
			case 'Q':
			
				queue = new Queue(userOptions.memSize);
				do{
					userChoice = queue.getUserInput(Options);
					
					switch(userChoice){
						
						case U: 				// push()
							queue.push();
							break;
							 
						case O:					// pop()
							queue.pop();
							break;

						case S:					// show()
							queue.showMemory();
							 break;
							 
						case C:					// clear()
							queue.clearMemory();
							 break;
						
						case Q:
							break;
						
						default:
							break;

					}	// switch()

				}while(userChoice != Choices.Q);
				break;
				
			default:
				break;
		}	// switch(userInput)
	
		return;
	}	// main()

}	// TestQueue{}