class Queue extends Memory
{

	Queue(int memSize){
		super(memSize);
	}	// constructor()

	
	
	public int getQueue(){
		
		int retVal = Integer.MIN_VALUE;
		
		retVal = this.memory[0];
		this.isFull = false;
		
		for (int i = 1; i < this.putloc; ++i){		// slide over the memory by 1 position.
			this.memory[i - 1] = this.memory[i]; 
		}

		--this.putloc;

		if (this.putloc == this.getloc){
			this.isEmpty = true;
		}	// if (this.putloc...)

		return retVal;

	}	// getQueue()
	


	public void pop(){

		if (this.isEmpty){

			System.out.println("\nQueue is empty! There is nothing to pop.");
			
		} else {
	
			int n = this.getQueue();
			
			if (n != Integer.MIN_VALUE){
				System.out.println("\nPopped value: " + n);
			}

			if (this.isEmpty){
				System.out.println("Queue is now empty.");
			}
		}
		
		return;

	}	// pop()
	
}	// Queue{}