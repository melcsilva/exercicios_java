package orientacaobjetos;

import java.util.Locale;
import java.util.Scanner;

import orientacaobjetos.entities.Triangule;


public class Problema1 {
    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        Triangule x, y;
        x = new Triangule();
        y = new Triangule();

        System.out.println("Enter the measures of the tringule x:");
        x.a = sc.nextDouble();
        x.b = sc.nextDouble();
        x.c = sc.nextDouble();
        System.out.println("Now enter the measures of the tringule y:");
        y.a = sc.nextDouble();
        y.b = sc.nextDouble();
        y.c = sc.nextDouble();

        double areaX = x.area();

        double areaY = y.area();

        System.out.printf("Triangule X area: %.4f%n", areaX);
        System.out.printf("Tringule Y area: %.4f%n", areaY);

        if (areaX > areaY){
            System.out.println("Larger area: X");
        } else {
            System.out.println("Larger area: Y");
        }

        sc.close();
    }
}
