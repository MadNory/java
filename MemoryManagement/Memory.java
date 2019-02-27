import java.util.Scanner;
import java.io.*;

abstract class Memory{

	protected int getloc = 0, putloc = 0;
	protected int[] memory;
	
	protected boolean isFull = false;
	protected boolean isEmpty = true;

	
	Memory(int memSize){

		this.memory = new int[memSize];
		this.getloc = this.putloc = 0;
		this.isFull = false;
		this.isEmpty = true;

	}	// constructor()

	
	abstract int getValue();

	
	public void pop(){

		if (this.isEmpty){

			System.out.println("\nQueue is empty! There is nothing to pop.");
			
		} else {
	
			int n = this.getValue();
			
			if (n != Integer.MIN_VALUE){
				System.out.println("\nPopped value: " + n);
			}

			if (this.isEmpty){
				System.out.println("Queue is now empty.");
			}
		}
		
		return;

	}	// pop()
	

	public void showMemory(){

		if (this.isEmpty){

			System.out.println("\nQueue is empty! There is nothing to display.");

		} else {

			for(int i = 0; i < this.putloc; ++i){
				
				System.out.println("[" + i + "] = " + this.memory[i]);

			}	// for()
		}	// if(queue...)

		return;
	}	// showMemory()
	
	

	public int getMemSize(){
		
		return this.memory.length;
		
	}	// getMemSize()


	
	public void clearMemory(){
		
		if (this.isEmpty){
			
			System.out.println("\nThe queue is currently empty. No need to clear.");
			
		} else {
			
			this.putloc = this.getloc = 0;
			this.isEmpty = true;
			this.isFull = false;
			System.out.println("\nThe queue has been cleared.");
			
		}	// if(this.isEmpty)				

		return;

	}	// clearMemory()

	
	
	protected void putValue(int val){

		if (!this.isFull){
			
			this.memory[this.putloc] = val;
			++this.putloc;

			if (this.putloc == this.memory.length){
				this.isFull = true;
			}	// if()
				
			this.isEmpty = false;
		}	// if (!this.isFull)

		return;
	}	// putQueue()

	

	public void push(){
		

		Scanner in = new Scanner(System.in);

		System.out.print("\nEnter a value to push: ");
		
		String userInput = in.nextLine();

		int n = Integer.parseInt(userInput);
		
		this.putValue(n);
		
		if (this.isFull){
			System.out.println("\nQueue is now full.");
		}
		
		return;

	}	// push()

	

	public Choices getUserInput(Action[] options) throws IllegalArgumentException
	
	{		// Know what the user wants to do.
	
		Scanner in = new Scanner(System.in);
		String userInput = "";
			
		System.out.println("\nWhat do you want to do:");
		
		System.out.print("\n  " + Choices.U + ") " + options[Choices.U.ordinal()].getName());
		if (this.isFull){
			System.out.print("  (Queue is already full)");
		}

		System.out.print("\n  " + Choices.O + ") " + options[Choices.O.ordinal()].getName());
		if (this.isEmpty){
			System.out.print("  (Queue is empty)");
		}
		
		System.out.print("\n  " + Choices.S + ") " + options[Choices.S.ordinal()].getName());
		if (this.isEmpty){
			System.out.print("  (Queue is empty)");
		}

		System.out.print("\n  " + Choices.C + ") " + options[Choices.C.ordinal()].getName());
		
		if (this.isEmpty){
			System.out.print("  (Queue is empty)");
		} else {
			System.out.print("  (Queue has contents)");
		}
		
		System.out.println("\n  " + Choices.Q + ") " + options[Choices.Q.ordinal()].getName());

		System.out.print("\nEnter ");
		
		for(Choices c: Choices.values()){
			System.out.print("'" + c + "' ");
		}
		
		System.out.print(": ");
		
		userInput = in.nextLine().toUpperCase();
			
		return Choices.valueOf(userInput.toUpperCase());
		
	}	// getUserInput()

}	// Memory{}