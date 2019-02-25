
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


	public void pop(){

		if (this.isEmpty){

			System.out.println("\nQueue is empty! There is nothing to pop.");
			
		} else {
	
			int n = this.getValue();
			
			if (n != Integer.MIN_VALUE){
				System.out.println("\nPopped value: " + n);
			}

			if (this.isEmpty){
				System.out.println("Queue is now empty.");
			}
		}
		
		return;

	}	// pop()

	
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