package orientacaobjetos;

import java.util.Locale;
import java.util.Scanner;

import orientacaobjetos.entities.ContaBancaria;

public class Orex04 {
    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        ContaBancaria usuario = new ContaBancaria();
        System.out.print("Nome do Usuario: ");
        usuario.nome = sc.nextLine();
        System.out.print("Numero da conta: ");
        usuario.conta = sc.nextInt();
        System.out.print("Saldo Atual: ");
        usuario.saldoAtual = sc.nextDouble();
        
        int x = 0;

        while (x != 4) {
        System.out.println();
        System.out.println("============+++===========");
        System.out.println("1. Ver Saldo Atual");
        System.out.println("2. Sacar dinheiro");
        System.out.println("3. Depositar dinheiro");
        System.out.println("4. Sair");
        System.out.println("============+++===========");
        System.out.println();

        String opcao = ("Escolha uma das opcoes acima: ");
        System.out.print(opcao);
        x = sc.nextInt();
        System.out.println();


        double valor;

        switch (x) {
            case 1:
                System.out.println("Saldo Atual: " + usuario.saldoAtual);
                break;
            case 2:
                System.out.print("Digite o valor do saque: ");
                valor = sc.nextDouble();
                usuario.sacar(valor); 
                System.out.printf("Seu saldo atual e de %.2f%n", usuario.saldoAtual);
                break;
            case 3:
                System.out.print("Digite o valor do seposito: ");
                valor = sc.nextDouble();
                usuario.depositar(valor);
                System.out.printf("Seu saldo atual e de %.2f%n", usuario.saldoAtual);
                break;
            case 4:
                System.out.print("Saindo.. ");
                break;
            
            default:
            System.out.println("Opcao invalida!");
        }
    }
        sc.close();
    }
}
