package estuturas_rept;

import java.util.Scanner;

public class whilex04 {

    public static void main  (String[] args) {
    Scanner sc = new Scanner(System.in);

    int pessimo = 0;
    int regular = 0;
    int bom = 0;
    int excelente = 0;

    System.out.println("================+==============");
    System.out.println("=+==PESQUISA DE SATISFACAO==+=");
    System.out.println("================+==============");
    System.out.println("Como foi o atendimento:");
    System.out.println("1.     |    Pessimo");
    System.out.println("2.     |    Regular");
    System.out.println("3.     |    Bom");
    System.out.println("4.     |    Excelente");
    System.out.println("5.     |    Fim");

    int opcao = sc.nextInt();

    while (opcao != 5) {
        if (opcao == 1) {
            pessimo += 1;
        } 
        else if (opcao == 2) {
            regular += 1;
        }
        else if (opcao == 3) {
            bom += 1;
        }
        else if (opcao == 4) {
            excelente += 1;
        }
        opcao = sc.nextInt();
    }
        System.out.println("PESQUISA ENCERRADA");
        System.out.println("Pessimo: " + pessimo);
        System.out.println("Regular: " + regular);
        System.out.println("Bom: " + bom);
        System.out.println("Excelente: " + excelente);
    sc.close();
    }
}
