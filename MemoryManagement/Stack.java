
class Stack extends Memory
{
	Stack(int memSize){
		super(memSize);
	}	// constructor()
	
	
	public int getValue(){
		
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

	}	// getValue()

	
	public void push(){
		
		if (this.isFull){
			System.out.println("\nQueue is already full! Pop a value first.");
		} else {
			super.push();
		}
		
		this.getloc = this.putloc - 1;

		return;

	}	// push()
	
	
}	// Stack{}