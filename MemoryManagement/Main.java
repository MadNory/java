class Container{
	
	private String initial = "A";
	
	
	public String getInitial(){

		return initial;
	
	}	// getInitial()

	
	public void setInitial(String init){

		this.initial = init;

	}	// setInitial()
	
}	// Container{}


public class Main {

	public static void main(String[] args){
	
		Main main = new Main();
		main.start();
		
	}	// main()

	
	public void start(){
	
		String last = "Z";
		Container container = new Container();	// container.initial = "A"
		container.setInitial("C");				// container.initial = "C"
		another(container, last);
		System.out.print(container.getInitial());	// B 
		
	}	// start()
	
	
	public void another(Container initialHolder, String newInitial){
		
		newInitial.toLowerCase();				// newInitial transforms to lower case but not assigned anywhere
		initialHolder.setInitial("B");			// initialHolder.initial = "B"
		Container initial2 = new Container();	// initial2.initial = "A"
		initialHolder = initial2;				// initialHolder.initial = "A"		Note: the value of the container pointer 
		System.out.print(initialHolder.getInitial());	//  A								in the calling routine DOES NOT
		System.out.print(newInitial);					// 	Z								CHANGE.  The pointer only changes
														//									in this method.
	}	// another()

}