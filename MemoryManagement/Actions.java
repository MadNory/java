public class Action {
	
	private char code = '~';
	private String name = "";
	
	public Action(char c, String desc){
		this.code = c;
		this.name = desc;
	}	// constructor()
	
	public String getName(){
		return this.name;
	}	// getName()
	
	public char getCode(){
		return this.code;
	}	// getCode()

}	// Action()

/*

public class Actions{

	public static Action Options[] = new Action[Choices.Q.ordinal() + 1];

	public static void main(String args[]){

		Options[Choices.U.ordinal()] = new Action('U', "Push");
		Options[Choices.O.ordinal()] = new Action('O', "Pop");
		Options[Choices.S.ordinal()] = new Action('S', "Show");
		Options[Choices.C.ordinal()] = new Action('C', "Clear");
		Options[Choices.Q.ordinal()] = new Action('Q', "Quit");
		
		for (Action choice: Options){
			System.out.println(choice.getCode() + " - " + choice.getName());
		}
	}	// main()
	
}	// Actions()
*/