package estuturas_rept;

import java.util.Scanner;

public class forex05 {
    public static void main(String[] args) {

	Scanner sc = new Scanner(System.in);

    System.out.println("Digite um numero: ");

    int n = sc.nextInt();

    int fat = 1;
    for (int i = 1; i <= n; i++) {
        fat *= i;
    }

    System.out.print(fat);

    sc.close();
    }
}
