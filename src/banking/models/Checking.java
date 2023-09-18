package banking.models;

public class Checking extends Account{
	
	private double interestRate = 0;
	
	
	public Checking() {
		super();
	}
	
	public double CalculateInterestByMonth(int months) {
			
			double interest = this.getBalance() * (interestRate / 12) * months;
			return interest;
		}
	
}
