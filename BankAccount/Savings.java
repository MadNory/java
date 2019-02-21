public class Savings extends Account implements SavingsOnly
{
	private float interestRate = (float)0.0;
	private double currBalance = 0.0; 
	
	public Savings(String acctNum, String branchName)
	{
		super(acctNum, branchName);
		
	}	// constructor()
	

	public void deposit(double amt)
	{
		this.currBalance += amt;
	}	// deposit()
	
	
	public void withdraw(double amt)
	{
		this.currBalance -= amt;
	}	// withdraw()
	
	
	public void setInterestRate(float newRate)
	{
		this.interestRate = newRate;
	}	// setInterestRate()
	
	
	public void addInterest()
	{
		this.currBalance += (this.interestRate/100) * this.currBalance;
	}	// addInterest()

	
	public void showAccountInfo()
	{
		super.showAccountInfo();
		System.out.println("Interest Rate: " + this.interestRate);
		System.out.println("Current Balance: " + this.currBalance);
	}	// showAccountInfo()
	
}	// Savings{}