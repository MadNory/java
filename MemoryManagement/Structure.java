import java.util.Scanner;

public class Structure{
	
	private static String userInput = "";
	private static int n = 0;
	private static Scanner in = new Scanner(System.in);

	
	private static void push(Queue q){
		
		System.out.print("\nEnter a value to push: ");
		
		userInput = in.nextLine();
		n = Integer.parseInt(userInput);
		
		q.putQueue(n);
		
		if (q.isQfull){
			System.out.println("\nQueue is already full.");
		}
		
		return;

	}	// push()


	private static void pop(Queue q){
		
		n = q.getQueue();
		
		if (n != Integer.MIN_VALUE){
			System.out.println("\nPopped value: " + n);
		}

		if (q.isQempty){
			System.out.println("Queue is now empty.");
		}
		
		return;

	}	// pop()

	
	private static char getUserInput(Queue q){		// Know what the user wants to do.
	
		Actions choices = new Actions();
	
		System.out.println("\nWhat do you want to do:");
		
		System.out.print("\n  U) Push");
		if (q.isQfull){
			System.out.print("  (Queue is already full)");
		}

		System.out.print("\n  O) Pop");
		if (q.isQempty){
			System.out.print("  (Queue is empty)");
		}
		
		System.out.print("\n  S) Show");
		if (q.isQempty){
			System.out.print("  (Queue is empty)");
		}

		System.out.print("\n  C) Clear");
		if (q.isQempty){
			System.out.print("  (Queue is empty)");
		} else {
			System.out.print("  (Queue has contents)");
		}
		
		System.out.println("\n  Q) Quit");
		System.out.print("\nU, O, S, C, or Q: ");
		
		String userInput = in.nextLine();
		
		return userInput.toUpperCase().charAt(0);
		
	}	// getUserInput()
	

	public static void main(String args[]){

		System.out.print("\nPlease enter the desired queue size: ");
		
		userInput = in.nextLine();
		
		n = Integer.parseInt(userInput);
		
		Queue queue = new Queue(n);
		
		char userChoice = '~';
		
		do{

			userChoice = getUserInput(queue);
			
			switch(userChoice){
				
				case 'U': 	// push()
				
					if (queue.isQfull){
						System.out.println("\nQueue is already full! Pop a value first.");
					} else {
						push(queue);
					}
					 break;
					 
				case 'O':	// pop()
				
					if (queue.isQempty){
						System.out.println("\nQueue is empty! There is nothing to pop.");
					} else {
						pop(queue);
					}
					 break;

				case 'S':	// show()
				
					if (queue.isQempty){
						System.out.println("\nQueue is empty! There is nothing to display.");
					} else {
						queue.showQueue();
					}
					 break;
					 
				case 'C':	// clear()
					if (queue.isQempty){
						System.out.println("\nThe queue is currently empty. No need to clear.");
					} else {
						queue.clearQueue();
						System.out.println("\nThe queue has been cleared.");
					}
					 break;
					 
				default:
					System.out.println("choice = " + userChoice);
					break;
			}	// switch()

		}while(userChoice != 'Q');
	
		return;
	}	// main()

}	// TestQueue{}