package exercicios;

import java.util.Locale;
import java.util.Scanner;

public class ex02 {
    public static void main(String[] args) {

    Locale.setDefault(Locale.US);
    Scanner sc = new Scanner(System.in);

    double A, R, pi = 3.14159;

    R = sc.nextDouble();

    A = pi * R * R;

    System.out.printf("area = %.4f%n", A);

    sc.close();
    }
}
