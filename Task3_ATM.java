import java.util.Scanner;

public class ATM {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        BankAccount account = new BankAccount(5000); // initial balance
        int choice;

        System.out.println("Welcome to ATM");

        do {
            System.out.println("\n1. Check Balance");
            System.out.println("2. Deposit");
            System.out.println("3. Withdraw");
            System.out.println("4. Exit");
            System.out.print("Enter your choice: ");
            choice = sc.nextInt();

            if (choice == 1) {
                System.out.println("Your balance is: " + account.getBalance());

            } else if (choice == 2) {
                System.out.print("Enter amount to deposit: ");
                double amount = sc.nextDouble();
                account.deposit(amount);

            } else if (choice == 3) {
                System.out.print("Enter amount to withdraw: ");
                double amount = sc.nextDouble();
                account.withdraw(amount);

            } else if (choice == 4) {
                System.out.println("Thank you for using ATM");

            } else {
                System.out.println("Invalid choice");
            }

        } while (choice != 4);

        sc.close();
    }
}
