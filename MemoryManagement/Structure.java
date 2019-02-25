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



	private static void pop(Queue q){
		
		int n = 0;
		
		n = q.getQueue();
		
		if (n != Integer.MIN_VALUE){
			System.out.println("\nPopped value: " + n);
		}

		if (q.isEmpty){
			System.out.println("Queue is now empty.");
		}
		
		return;

	}	// pop()
	
	

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
		Choices userChoice;
		
		switch(userOptions.memType){
			
			case 'S':
				stack = new Stack(userOptions.memSize);
				break;
				
				
			case 'Q':
				queue = new Queue(userOptions.memSize);
				do{

					userChoice = queue.getUserInput(Options);
					
					switch(userChoice){
						
						case U: 				// push()
							queue.push();
							 break;
							 
						case O:	// pop()
						
							if (queue.isEmpty){
								System.out.println("\nQueue is empty! There is nothing to pop.");
							} else {
								pop(queue);
							}
							 break;

						case S:	// show()
						
							if (queue.isEmpty){
								System.out.println("\nQueue is empty! There is nothing to display.");
							} else {
								queue.showMemory();
							}
							 break;
							 
						case C:	// clear()
							if (queue.isEmpty){
								System.out.println("\nThe queue is currently empty. No need to clear.");
							} else {
								queue.clearQueue();
								System.out.println("\nThe queue has been cleared.");
							}
							 break;
						
						case Q:
							break;
						
						default:
		//					System.out.println("choice = " + userChoice);
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