package exercicios;

import java.util.Locale;
import java.util.Scanner;

public class ex05 {
    public static void main(String[] args){

        Scanner sc = new Scanner(System.in).useLocale(Locale.US);

        int cod1, cod2, peca1, peca2;
        double valor1, valor2, resu;

        cod1 = sc.nextInt();
        peca1 = sc.nextInt();
        valor1 = sc.nextDouble();

        cod2 = sc.nextInt();
        peca2 = sc.nextInt();
        valor2 = sc.nextDouble();

        resu =  peca1 * valor1 + peca2 * valor2;

        System.out.printf("VALOR A PAGAR= R$ %.2f%n ", resu);

        sc.close();
    }
}
