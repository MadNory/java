import java.util.Scanner;

public class GuessingGame
{

	public static void main(String[] args)
	{
		Scanner in = new Scanner(System.in);

		System.out.print("Enter an integer: ");
		int maxValue = in.nextInt();
		
		int numToGuess = (int) Math.floor((Math.random() * maxValue) + 1);
		int guess = 0;
		
		do{
			System.out.print("Enter a number between 1 and " + maxValue + ": ");
			guess = in.nextInt();
			
			if (guess < numToGuess){
				System.out.println(guess + " is too low!");
			} else if (guess > numToGuess){
				System.out.println(guess + " is too high!");
			} else{
				System.out.println("You guessed the number!");
			}
			
		}while (guess != numToGuess);
	}	// main()
	
	

}	// GuessingGame