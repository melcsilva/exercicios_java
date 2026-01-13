package estuturas_rept;

import java.util.Scanner;

public class whilex01 {
    public static void main  (String[] args) {
    Scanner sc = new Scanner(System.in);

    int senhaCorreta = 2002;
    
    System.out.println("Digite a sua senha: ");
    int senha = sc.nextInt();
    while (senha != senhaCorreta){
        System.out.println("Senha Invalida.");
        senha = sc.nextInt();
    }
    System.out.println("Acesso Permitido!");
    sc.close();
    }
}
