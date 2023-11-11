import java.util.Scanner;

public class ATM {

	//public static void main(String[] args) {
		private BankAccount account;
		private Scanner scanner;
		public ATM(BankAccount account) {
			this.account = account;
			this.scanner = new Scanner(System.in);
		}
		public void display() {
			System.out.println("1.Check balance");
			System.out.println("2.Deposit");
			System.out.println("3.Withdraw");
			System.out.println("4.Exit");
		}
		public void run() {
			int ch;
			do {
				display();
				System.out.println("Enter your choice: ");
				ch = scanner.nextInt();
				switch(ch) {
				case 1:
					check_Balance();
					break;
				case 2:
					deposit();
					break;
				case 3:
					withdraw();
					break;
				case 4:
					System.out.println("Thank you!");
					break;
				default:
					System.out.println("Invalid choice!Enter a valid option");
				}
			}while(ch!=4);
				}
		public void check_Balance() {
			System.out.println("Current balance is: "+account.getbalance());
			}
		public void deposit() {
			System.out.println("Enter the amount to be deposit: ");
			double amount = scanner.nextDouble();
			account.amountDeposit(amount);
		}
		public void withdraw() {
			System.out.println("Enter the amount to be withdrawn: ");
			double amount = scanner.nextDouble();
			account.withdrawAmount(amount);
		}
	}




