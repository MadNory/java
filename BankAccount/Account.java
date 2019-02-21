enum ChargeType { DEBIT, CREDIT };

abstract class Account
{

	private String acctNumber;

	private String branch;

	
	public Account(String accountNo, String branchName)
	{
		this.acctNumber = accountNo;
		this.branch = branchName;
	}	// constructor()


	public abstract void deposit(double amt);

	
	public abstract void addInterest();

	
	public void showAccountInfo()
	{
		System.out.println();
		System.out.println("Account No: " + this.acctNumber);
		System.out.println("Branch Name: " + this.branch);

	}	// showAccountInfo()
}


interface SavingsOnly
{
	public abstract void setInterestRate(float newRate);
}	// SavingsOnly{}


interface CreditOnly
{
	public abstract void setInterestRate(float newRate, ChargeType intType);
	public abstract void withdraw(double amt, ChargeType chType);
}	// CreditOnly{}
