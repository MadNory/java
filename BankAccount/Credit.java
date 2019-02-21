public class Credit extends Account implements CreditOnly
{
	private float debitIntRate = (float) 0.0;
	private float creditIntRate = (float) 0.0;
	
	private double currBalance = 0.0;			// total amount of charges
	private double creditCharges = 0.0;			// available credit
	private double debitCharges = 0.0;
	private final double CREDITLIMIT = 10000.00;
	
	public Credit(String acctNum, String branchName)
	{
		super(acctNum, branchName);
		
	}	// constructor()
	

	public void deposit(double amt)			// deduct from balance
	{
		this.currBalance -= amt;
	}	// deposit()
	
	
	public void withdraw(double amt, ChargeType chType)		// add to charge balance
	{
		double tempBalance = this.currBalance + amt;
		
		if (tempBalance > CREDITLIMIT)
		{
			System.out.println("Charge deci");
		} else {
			switch(chType){

				case DEBIT:
					this.debitCharges += amt;
					break;
				
				case CREDIT:
					this.creditCharges += amt;
					break;
					
				default:
					break;
			}	// switch()
		}
	}	// withdraw()
	
	
	public void setInterestRate(float newRate, ChargeType chType)
	{
		
		switch(chType){
			
			case DEBIT:
				System.out.println("Debit rate");
				this.debitIntRate = newRate;
				break;
			
			case CREDIT:
				System.out.println("Credit rate");
				this.creditIntRate = newRate;
				break;

			default:
				System.out.println("chType = " + chType);
				break;
		}	// switch()
		
	}	// setInterestRate()
	
	
	public void addInterest()
	{

		double debitTotal = this.debitCharges * (1 + this.debitIntRate / 100);
		double creditTotal = this.creditCharges * (1 + this.creditIntRate / 100);
		double totalCharges = debitTotal + creditTotal;
		
		this.currBalance += totalCharges; 

	}	// addInterest()

	
	public void showAccountInfo()
	{
		super.showAccountInfo();

		System.out.println("Credit Interest Rate: " + this.creditIntRate + " %");
		System.out.println("Debit Interest Rate: " + this.debitIntRate + " %");
		
		double totalCharges = this.debitCharges + this.creditCharges;
		double totalInterest =  this.debitCharges * (this.debitIntRate / 100) + this.creditCharges * (this.creditIntRate / 100);
		
		System.out.println();
		System.out.println("Total Debit Charges: " + this.debitCharges + " (" + this.debitCharges * (this.debitIntRate / 100) + ")");
		System.out.println("Total Credit Charges: " + this.creditCharges + " (" + this.creditCharges * (this.creditIntRate / 100) + ")");
		System.out.println("--------------------------------------------");
		System.out.println("Total Charges: " + totalCharges + " (" + totalInterest + ")");
		
		System.out.println();
		System.out.println("Total Payments: " + (this.currBalance - totalCharges - totalInterest));
		
		System.out.println();
		System.out.println("Available credit: " + (CREDITLIMIT - this.currBalance));
		
		}	// showAccountInfo()
	
}	// Savings{}