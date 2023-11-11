import java.util.Scanner;
public class ATM_Interface {
	public static void main(String[] args) {
			System.out.println("Welcome");
			Scanner sc = new Scanner(System.in);
			System.out.println("Enter your 4digit pin: ");
			int pin = sc.nextInt();
			
			BankAccount useraccount = new BankAccount(1000.0);
			ATM atm = new ATM(useraccount);
			atm.run();
		}
	}

