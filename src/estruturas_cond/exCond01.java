package estruturas_cond;

import java.util.Scanner;

public class exCond01 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int num;

        System.out.println("Digite um numero: ");
        num = sc.nextInt();

        if (num < 0){
            System.out.println("NEGATIVO");
        } else {
            System.out.println("POSITIVO");
        }

        sc.close();
    }
}
