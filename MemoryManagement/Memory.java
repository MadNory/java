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

		if (this.isEmpty){

			System.out.println("\n The memory is empty.There is nothing to display.");

		} else {
			
			for(int i = 0; i < this.putloc; ++i){
				
				System.out.println("[" + i + "] = " + this.memory[i]);

			}	// for()

		} // if(this.isEmpty)

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

}	// Memory{}