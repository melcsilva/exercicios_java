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
        usuario.setConta(sc.nextInt());
        System.out.print("Saldo Atual: ");
        usuario.setSaldoAtual(sc.nextDouble());
        
        int x = 0;

        while (x != 4) {

        System.out.println("Usuario: " + usuario.nome);
        System.out.println("Conta: " + usuario.getConta());
        
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
                System.out.println("Saldo Atual: " + usuario.getSaldoAtual());
                break;
            case 2:
                System.out.print("Digite o valor do saque: ");
                valor = sc.nextDouble();
                usuario.sacar(valor); 
                if (usuario.getSaldoAtual() < valor) {
                System.out.println("Saldo Insuficiente!");
                } else {
                    System.out.printf("Saque conluido com sucesso!");
                }
                System.out.println();
                break;
            case 3:
                System.out.print("Digite o valor do seposito: ");
                valor = sc.nextDouble();
                usuario.depositar(valor);
                System.out.printf("Deposito concluido com sucesso!");
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
