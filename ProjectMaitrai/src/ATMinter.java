import java.util.Scanner;

public class ATMinter {

	public static void main(String args[]) {
		int balance = 10000,withdraw, deposit;
		int pin=1234;int tries=0;
		Scanner sc = new Scanner(System.in);
		int entry=sc.nextInt();
		while (true) {
			System.out.println("ATM Machine\n");
			System.out.println("Enter pin");
			System.out.println("Pin number");
			while (entry != pin && tries < 3) {
                System.out.println("\nINCORRECT PIN. TRY AGAIN.");
                System.out.println("ENTER YOUR PIN: ");
                entry = sc.nextInt();
                tries++;
            }
			if (entry == pin)
                System.out.println("\nPIN ACCEPTED. ACCESS GRANTED.");
            else if (tries >= 3)
                System.out.println("\nYOU HAVE RUN OUT OF TRIES. ACCOUNT LOCKED.");

			System.out.println("Choose 1 for Withdraw");
			System.out.println("Choose 2 for Deposit");
			System.out.println("Choose 3 for Check Balance");
			System.out.println("Choose 4 for EXIT\n");
			System.out.print("Choose the operation:");
			int choice = sc.nextInt();
			switch (choice) {
		
			case 1:
				System.out.print("Enter money to be withdrawn:");
				withdraw = sc.nextInt();
				if (balance >= withdraw) {
					balance = balance - withdraw;
					System.out.println("Please collect your money");
				} else {

					System.out.println("Insufficient Balance");
				}
				System.out.println("");
				break;
			case 2:
				deposit = sc.nextInt();
				balance = balance + deposit;
				System.out.println("Your Money has been successfully depsited");
				System.out.println("");
				break;
			case 3:
				System.out.println("Balance : " + balance);
				System.out.println("");
				break;
			case 4:
				System.exit(0);
			}
		}
	}
}

