package checklist;

import java.util.Locale;
import java.util.Scanner;

import checklist.entities.CurrencyConverter;

public class Estaticosex {
    public static void main(String[] args) {

    Locale.setDefault(Locale.US);
    Scanner sc = new Scanner(System.in);

    System.out.println("what's the dollar price: ");
    double dollarPrice = sc.nextDouble();

    System.out.println("how many dollars will be bought: ");
    double dollar = sc.nextDouble();

    double x = CurrencyConverter.reais(dollar, dollarPrice);

    System.out.printf("Amount to be paid in reais = %.2f%n", x);
        
    sc.close();
    }
}
