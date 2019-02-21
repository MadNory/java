public class BankAccounts
{
	public static void main(String[] args)
	{
		Savings savAcct = new Savings("ACCT-0001", "Ayala");
		
		savAcct.deposit(100.50);
		savAcct.withdraw(50.25);
		savAcct.setInterestRate((float)2.5);
		savAcct.addInterest();
		savAcct.showAccountInfo();
		
		
		Credit credAcct = new Credit("ACCT-002", "Las Pinas");


		credAcct.setInterestRate((float)10.5, ChargeType.DEBIT);
		credAcct.setInterestRate((float)6.5, ChargeType.CREDIT);

		credAcct.withdraw(50.25, ChargeType.DEBIT);
		credAcct.withdraw(25.25, ChargeType.CREDIT);

		credAcct.deposit(100.50);
		
		credAcct.addInterest();

		credAcct.showAccountInfo();

	}	// main()
	
}	// BankAccounts{}