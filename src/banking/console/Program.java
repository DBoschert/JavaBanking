package banking.console;

import banking.models.Account;
import banking.models.Checking;
import banking.models.Saving;

public class Program {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		Account ac1 = new Checking();
		Account ac2 = new Saving();
		Saving ac3 = new Saving();
		Checking ac4 = new Checking();
		
		ac1.Deposit(1000);
		ac2.Deposit(1000);
		ac1.Transfer(100, ac3);
		ac3.Deposit(1000);
		ac3.CalculateInterestByMonth(12);
		ac4.Deposit(500);
		
		
		System.out.println(ac3.CalculateInterestByMonth(12));
		System.out.println(ac4.CalculateInterestByMonth(12));
		ac1.Print();
		ac2.Print();
		ac3.Print();
		ac4.Print();
		/*
		System.out.println(ac1.Print());
		System.out.println(ac2.Print());
		System.out.println(ac3.CalculateInterestByMonth(12,ac3));
		System.out.println(ac3.Print());
		System.out.println(ac4.Print());
		*/
	}

}
