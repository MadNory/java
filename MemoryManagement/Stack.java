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
	
}	// Queue{}