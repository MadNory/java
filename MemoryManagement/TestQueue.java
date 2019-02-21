import java.util.Scanner;

class Queue{

	private int getloc = 0, putloc = 0;
	private int[] queue;
	public boolean isQfull = false;
	public boolean isQempty = true;
	
	
	Queue(int qSize){
		this.queue = new int[qSize];
		this.getloc = this.putloc = 0;
		this.isQfull = false;
		this.isQempty = true;
	}	// constructor()

	
	public int getQueue(){
		
		int retVal = 0;
		
		retVal = this.queue[0];
		this.isQfull = false;
		
		for (int i = 1; i < this.putloc; ++i){
			this.queue[i - 1] = this.queue[i]; 
		}
		--this.putloc;

		if (this.putloc == this.getloc){
			this.isQempty = true;
		}	// if (this.putloc...)

		return retVal;

	}	// getQueue()
	

	public void putQueue(int val)
	{
		this.queue[this.putloc] = val;
		++this.putloc;
		this.isQempty = false;
			
		if (this.putloc == this.queue.length){
			this.isQfull = true;
		}	// if()

		return;
	}	// putQueue()
	
	
	public void showQueue()
	{
		if (this.isQempty){
			
			System.out.println("\n The queue is empty.There is nothing to display.");

		} else {
			
			for(int i = 0; i < this.putloc; ++i){
				
				System.out.println("[" + i + "] = " + this.queue[i]);

			}	// for()

		} // if(this.isQempty)

		return;

	}	// showQueue()
	
	
	public void clearQueue()
	{
		this.putloc = this.getloc = 0;
		this.isQempty = true;
		this.isQfull = false;
		
	}	// clearQueue()

}	// Queue{}


public class TestQueue{
	
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

	

	public static void main(String args[])
	{
		System.out.print("\nPlease enter the desired queue size: ");
		
		userInput = in.nextLine();
		
		n = Integer.parseInt(userInput);
		
		Queue queue = new Queue(n);
		
		do{

			System.out.println("\nWhat do you want to do:");
			System.out.print("\n  1) Push");
			if (queue.isQfull){
				System.out.print("  (Queue is already full)");
			}

			System.out.print("\n  2) Pop");
			if (queue.isQempty){
				System.out.print("  (Queue is empty)");
			}
			
			System.out.print("\n  3) Show");
			if (queue.isQempty){
				System.out.print("  (Queue is empty)");
			}

			System.out.print("\n  4) Clear");
			if (queue.isQempty){
				System.out.print("  (Queue is empty)");
			} else {
				System.out.print("  (Queue has contents)");
			}

			System.out.println("\n  q) Quit");
			System.out.print("\n1, 2, 3, or q: ");
			
			userInput = in.nextLine();
			
			switch(userInput.charAt(0)){
				
				case '1': 	// push()
				
					if (queue.isQfull){
						System.out.println("\nQueue is already full! Pop a value first.");
					} else {
						push(queue);
					}
					 break;
					 
				case '2':	// pop()
				
					if (queue.isQempty){
						System.out.println("\nQueue is empty! There is nothing to pop.");
					} else {
						pop(queue);
					}
					 break;

				case '3':	// show()
				
					if (queue.isQempty){
						System.out.println("\nQueue is empty! There is nothing to display.");
					} else {
						queue.showQueue();
					}
					 break;
					 
				case '4':	// clear()
				
					queue.clearQueue();
					System.out.println("\nThe queue has been cleared.");
					 break;
					 
				default:
					break;
			}	// switch()

		}while(userInput.charAt(0) != 'q');
	
		return;
	}	// main()

}	// TestQueue{}