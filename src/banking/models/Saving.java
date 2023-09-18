package banking.models;

public class Saving extends Account{

	public double interestRate;
	
	public double getInterestRate() {
		return interestRate;
	}
	
	public void setInterestRate(double interestRate) {
		this.interestRate = interestRate;
	}
	
	
	
	public double CalculateInterestByMonth(int months) {
		
		double interest = this.getBalance() * (interestRate / 12) * months;
		return interest;
	}
	/*
	public void Transfer(double amount, Checking ToChecking) throws Exception {
		if(this.Withdraw(amount)) {
			//withdraw(amount);
			ToChecking.Deposit(amount);
			return;
		}
		*/
	
	public Saving(String description) {
		super(description);
	}
	
	public Saving() {
		super();
	}
	
	
}
