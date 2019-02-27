class Queue extends Memory
{

	Queue(int memSize){
		super(memSize);
	}	// constructor()

	
	
	protected int getValue(){
		
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

	}	// getValue()
	


	
	public void push(){
		
		if (this.isFull){
			
			System.out.println("\nQueue is already full! Pop a value first.");
			
		} else {

			super.push();

		}

		return;

	}	// push()
	
}	// Queue{}