class Stack extends Memory
{
	Stack(int memSize){
		super(memSize);
	}	// constructor()
	
	
	public int getQueue(){
		
		int retVal = Integer.MIN_VALUE;
		
		if (!this.isEmpty){

			retVal = this.memory[this.getloc];
			--this.getloc;
			
			this.isFull = false;

			if (this.getloc < 0){
				
				this.putloc = this.getloc = 0;
				this.isEmpty = true;

			}	// if(this.getloc)
		}
			
		return retVal;

	}	// getQueue()


	public void putQueue(int val){
		
		if (!this.isFull){
			super.putQueue(val);
			this.getloc = this.putloc - 1;
		}
	}	// putQueue()
	
}	// Queue{}