package exercicios;

import java.util.Locale;
import java.util.Scanner;
import exercicios.entities.Account;

public class ex07 {
    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        Account account;

        System.out.println("Enter account number: ");
        int number = sc.nextInt();
        System.out.println("Enter account holder: ");
        sc.nextLine();
        String holder = sc.nextLine();
        System.out.println("Is there an initial deposit: (y/n) ");
        char response = sc.next().charAt(0);
        if (response == 'y') {
            System.out.println("Enter initial deposit: ");
            double initialDeposit = sc.nextDouble();
            account = new Account(number, holder, initialDeposit);
        } else {
            account = new Account(number, holder);
        }

        int x = 0;

        while (x != 4) {

            System.out.println();
            System.out.println("Account data: ");
            System.out.println(account);

            System.out.println();
            System.out.println("============+++===========");
            System.out.println("1. View current balance");
            System.out.println("2. Withdraw money");
            System.out.println("3. Deposit money");
            System.out.println("4. Log out");
            System.out.println("============+++===========");
            System.out.println();

            String option = ("Choose an option above: ");
            System.out.print(option);
            x = sc.nextInt();
            System.out.println();

            double value;

            switch (x) {
                case 1:
                    System.out.println("Current balance: " + account.getBalance());
                    break;
                case 2:
                    System.out.print("Enter withdraw value: ");
                    value = sc.nextDouble();
                    account.withdraw(value);
                    System.out.printf("Withdraw completed successfully!");
                    System.out.println();
                    break;
                case 3:
                    System.out.print("Enter the deposit amount: ");
                    value = sc.nextDouble();
                    account.deposit(value);
                    System.out.printf("Deposit completed successfully!");
                    break;
                case 4:
                    System.out.print("Login out.. ");
                    break;

                default:
                    System.out.println("Invalid Option!");
            }
        }

        sc.close();
    }
}
