package orientacaobjetos;

import java.util.Locale;
import java.util.Scanner;

import orientacaobjetos.entities.Student;

public class Oriex03 {
    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        Student student = new Student();
        System.out.print("Student Name: ");
        student.name = sc.nextLine();
        System.out.print("Grades: ");
        student.grade1 = sc.nextDouble();
        student.grade2 = sc.nextDouble();
        student.grade3 = sc.nextDouble();

        System.out.printf("FINAL GRADE: %.2f%n", student.finalGrade());

        if (student.finalGrade() < 60) {
            System.out.println("FAILED");
            System.out.printf("MISSING %.2f%n POINTS", student.missingPoints());
        } 
        else {
            System.out.println("PASS");
        }
        sc.close();
    }
}
