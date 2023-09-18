/**
 * 
 */
package banking.models;

/**
 * 
 */
public class Account {
	public static int nextId = 1;

	private int id;
	private String description;
	private double balance;
	
	//Getters and Setters
	
	public int getId() {
		return id;
	}
	
	protected void setId(int id) {
		this.id = id;
	}
	
	public String getDescription() {
		return description;
	}
	
	public void setDescription(String desc) {
		this.description = desc;
	}
	
	public double getBalance() {
		
		return balance;
	}
	
	protected void setBalance(double bal) {
		this.balance = bal;
	}
	
	// Methods
	
	public boolean Deposit (double amount) throws Exception {
		if(amount <= 0) {
			throw new Exception("Amount must be greater than ZERO");
		}
		
		this.balance += amount;
		return true;
	}
	
	public boolean Withdraw(double amount) throws Exception {
		if(amount <= 0) {
			throw new Exception("Amount must be greater than ZERO");
		}
		
		if(this.balance < amount) {
			throw new Exception("BALANCE MUST be GREATER than AMOUNT");
		}
		
		this.balance -= amount;
		return true;
	}
	
	public void Transfer(double amount, Account ToAccount) throws Exception {
		if(this.Withdraw(amount)) {
			ToAccount.Deposit(amount);
			return;
		}
		System.out.println("Transfer Failed");
	}
	
	public void Print() {
		System.out.println("AccountNumber = " + this.id );
		System.out.println("Description = " + this.description);
		System.out.println("Balance = " + this.balance);
		System.out.println();
	}
	
	public Account(String description) {
		setId(nextId++);
		setDescription(description);
		setBalance(0);
	}
	
	public Account() {
		this("New Account");
	}
	
	
	
}
