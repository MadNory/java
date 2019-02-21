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
	
	
	public int getMemSize(){
		return this.queue.length;
	}	// getMemSize()

	
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