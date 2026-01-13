package exercicios;

import java.util.Locale;
import java.util.Scanner;

public class ex04 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in).useLocale(Locale.US);

        int F, H;

        double V, cal;

        F = sc.nextInt();
        H = sc.nextInt();
        V = sc.nextDouble();

        cal = H * V;

        System.out.println("NUMBER: " + F);
        System.out.printf(Locale.US, "SALARY = %.2f%n", cal);

        sc.close();
    }
}
