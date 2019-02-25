class Actions{

	public Action Options[] = new Action[Choices.Q.ordinal() + 1];
	
	Actions() {
		Options[Choices.U.ordinal()] = new Action('U', "Push");
		Options[Choices.O.ordinal()] = new Action('O', "Pop");
		Options[Choices.S.ordinal()] = new Action('S', "Show");
		Options[Choices.C.ordinal()] = new Action('C', "Clear");
		Options[Choices.Q.ordinal()] = new Action('Q', "Quit");
	}
	
}	// Actions()
