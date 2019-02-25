import java.util.Scanner;

class Memory{

	protected int getloc = 0, putloc = 0;
	protected int[] memory;
	
	public boolean isFull = false;
	public boolean isEmpty = true;
	

	Memory(int memSize){

		this.memory = new int[memSize];
		this.getloc = this.putloc = 0;
		this.isFull = false;
		this.isEmpty = true;

	}	// constructor()

	

	public void showMemory(){

		for(int i = 0; i < this.putloc; ++i){
			
			System.out.println("[" + i + "] = " + this.memory[i]);

		}	// for()

		return;
	}	// showMemory()
	
	

	public int getMemSize(){
		
		return this.memory.length;
		
	}	// getMemSize()


	
	public void clearQueue(){
		
		this.putloc = this.getloc = 0;
		this.isEmpty = true;
		this.isFull = false;
		
	}	// clearQueue()

	
	
	protected void putQueue(int val){

		this.memory[this.putloc] = val;
		++this.putloc;

		if (this.putloc == this.memory.length){
			this.isFull = true;
		}	// if()
			
		this.isEmpty = false;

		return;
	}	// putQueue()

	

	public Choices getUserInput(Action[] options){		// Know what the user wants to do.
	
		Scanner in = new Scanner(System.in);
	
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
		
		String userInput = in.nextLine();
		
		return Choices.valueOf(userInput.toUpperCase());
		
	}	// getUserInput()

}	// Memory{}