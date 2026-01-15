// package estuturas_rept;

// import java.util.Scanner;

// public class forex07 {
//     public static void main(String[] args) {

// 	Scanner sc = new Scanner(System.in);

//     System.out.println("Digite um numero inteiro:");
//     int n = sc.nextInt();

//     int quadrado = 0;
//     int cubo = 0;

//     for(int i = 1; i <= n; i++){

//         quadrado = i * i;
//         cubo = i * i * i;
//         System.out.print(i);
//         System.out.print(quadrado);
//         System.out.println(cubo);
//     }
    
//     sc.close();
//     }
// }

package estuturas_rept;

import java.util.Scanner;

public class forex07 {
    public static void main(String[] args) {

	Scanner sc = new Scanner(System.in);

    System.out.println("Digite um numero inteiro:");
    int n = sc.nextInt();

    for(int i = 1; i <= n; i++){

        int primeiro = i;
        int segundo = i * i;
        int terceiro = i * i * i;

        System.out.printf("%d %d %d%n", primeiro, segundo, terceiro);

    }
    
    sc.close();
    }
}
