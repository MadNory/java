class Recursion{

	private static String str = "";

	private static void dispString(int n){
		
		if (n == 0){
			return;
		} else{
			System.out.print(str.charAt(n - 1));
			dispString(--n);
		}
	}	// dispString()


	public static void main(String args[]){
		
		str = "Spell this backward.";
		dispString(str.length());
	
	}	// main()
}	// Recursion{}