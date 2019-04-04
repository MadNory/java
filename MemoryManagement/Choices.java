enum Choices 
{ 	
	U ("Push"), 
	O ("Pop"), 
	S ("Show"), 
	C ("Clear"), 
	Q ("Quit"), 
	G ("Size");
	
	private final String desc;
	
	Choices(String name){
		this.desc = name;
	}
	
	String getDesc(){
		return this.desc;
	}
	
};	// Possible Actions: Push, Pop, Show, Clear, Quit, GetMemSize respectively.

