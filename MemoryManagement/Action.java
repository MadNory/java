class Action {
	
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
