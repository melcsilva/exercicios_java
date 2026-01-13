package estruturas_cond;

import java.util.Scanner;

public class exCond05 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        System.out.println("--------------------------------------");
        System.out.println("CODIGO     CARDAPIO            PRECO");
        System.out.println("--------------------------------------");
        System.out.println("1        Cachorro-Quente       R$ 4.00");
        System.out.println("2        X-Salada              R$ 4.50");
        System.out.println("3        X-Bacon               R$ 5.00");
        System.out.println("4        Torrada Simples       R$ 1.50");
        System.out.println("5        Refrigerante          R$ 1.50");
        System.out.println("--------------------------------------");

        System.out.println("Digite o numero do pedido e a quantidade que deseja: ");
        int codigo = sc.nextInt();
        int quantidade = sc.nextInt();

        double total;
        if(codigo == 1){
            total = quantidade * 4;
        } else if (codigo == 2){
            total = quantidade * 4.50;
        } else if (codigo == 3){
            total = quantidade * 5.00;
        } else if (codigo == 4){
            total = quantidade * 2.00;
        } else {
            total = quantidade * 1.50;
        }

        System.out.printf("Total: R$ %.2f%n", total);
        
        sc.close();
    }
    
}
