import java.util.Scanner;

public class CurrencyConverter {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Currency Converter");
        System.out.println("1. INR to USD");
        System.out.println("2. USD to INR");
        System.out.println("3. INR to EUR");
        System.out.println("4. EUR to INR");

        System.out.print("Choose an option: ");
        int choice = sc.nextInt();

        System.out.print("Enter amount: ");
        double amount = sc.nextDouble();

        double result = 0;

        if (choice == 1) {
            result = amount / 83;   // INR to USD
            System.out.println("Converted amount: $" + result);

        } else if (choice == 2) {
            result = amount * 83;   // USD to INR
            System.out.println("Converted amount: ₹" + result);

        } else if (choice == 3) {
            result = amount / 90;   // INR to EUR
            System.out.println("Converted amount: €" + result);

        } else if (choice == 4) {
            result = amount * 90;   // EUR to INR
            System.out.println("Converted amount: ₹" + result);

        } else {
            System.out.println("Invalid option");
        }

        sc.close();
    }
}
