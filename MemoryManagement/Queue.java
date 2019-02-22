class Queue extends Memory
{
	Queue(int memSize){
		super(memSize);
	}	// constructor()
	
	public int getQueue(){
		
		int retVal = 0;
		
		retVal = this.memory[0];
		this.isFull = false;
		
		for (int i = 1; i < this.putloc; ++i){
			
			this.memory[i - 1] = this.memory[i]; 

		}

		--this.putloc;

		if (this.putloc == this.getloc){
			this.isEmpty = true;
		}	// if (this.putloc...)

		return retVal;

	}	// getQueue()

	

	public void putQueue(int val){

		this.memory[this.putloc] = val;
		++this.putloc;

		this.isEmpty = false;
			
		if (this.putloc == this.memory.length){
			this.isFull = true;
		}	// if()

		return;
	}	// putQueue()
	

	
	public void showQueue(){

		if (this.isEmpty){
			
			System.out.println("\n The queue is empty.There is nothing to display.");

		} else {
			
			for(int i = 0; i < this.putloc; ++i){
				
				System.out.println("[" + i + "] = " + this.memory[i]);

			}	// for()

		} // if(this.isEmpty)

		return;

	}	// showQueue()
	
}	// Queue{}