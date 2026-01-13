package estruturas_cond;

import java.util.Scanner;

public class exCond04 {
    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);

        System.out.println("Digite a hora inicial e a hora final do jogo");
        int horaInicio = sc.nextInt();
        int horaFinal = sc.nextInt();

        int horas;

        if(horaInicio < horaFinal){
            horas = horaFinal - horaInicio;
        } else {
            horas = 24 - horaInicio + horaFinal;
        } 
            
        System.out.println("O JOGO DUROU " + horas + " HORA(S)");

        sc.close();
    }
}
