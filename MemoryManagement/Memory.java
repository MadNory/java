class Memory{

	protected int getloc = 0, putloc = 0;
	protected int[] memory;
	public boolean isFull = false;
	public boolean isEmpty = true;

	public int getMemSize(){
		
		return this.memory.length;
		
	}	// getMemSize()

	
	public void clearQueue(){
		
		this.putloc = this.getloc = 0;
		this.isEmpty = true;
		this.isFull = false;
		
	}	// clearQueue()
	
	
	Memory(int memSize){

		this.memory = new int[memSize];
		this.getloc = this.putloc = 0;
		this.isFull = false;
		this.isEmpty = true;

	}	// constructor()
	
}