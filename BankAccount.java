//import java.util.Scanner;

public class BankAccount {
private double balance;
public BankAccount(double initialbalance) {
	this.balance = initialbalance;
}	
public double getbalance() {
	return balance;
}
public void amountDeposit(double amount) {
	if(amount > 0) {
	balance+= amount;
	System.out.println("Amount Deposit Successful");
}else {
	System.out.println("Invalid amount");
}
}
public void withdrawAmount(double amount) {
	if(amount > 0 && amount<= balance) {
		balance-= amount;
		System.out.println("Successfull withdrawl.Please collect the money");
	}else {
		System.out.println("Insufficient amount");
	}
}
}



