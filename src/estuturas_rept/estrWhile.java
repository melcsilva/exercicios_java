package estuturas_rept;

import java.util.Scanner;

public class estrWhile {
    public static void main  (String[] args) {
        Scanner sc = new Scanner(System.in);

        int nums = sc.nextInt();

        int soma = 0;

        while (nums != 0) {
            soma += nums;
            nums = sc.nextInt();
        }
        System.out.println(soma);
        
        sc.close();
    }
}
