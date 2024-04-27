package Exercicios;

import java.util.Scanner;

public class ex017 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Nota do aluno no primeiro trimestre: ");
        double nota = sc.nextDouble();
        System.out.println("Nota do aluno no segundo trimestre: ");
        double nota2 = sc.nextDouble();
        System.out.println("Nota do aluno no terceiro trimestre: ");
        double nota3 = sc.nextDouble();

        double media = (nota + nota2 + nota3) / 3;
        System.out.println("Media do aluno: " + media);

        if (media == 10) {
            System.out.println("Aprovado com distinção");
        } else if (media >= 7 && media <= 10) {
            System.out.println("Aprovado");
        } else {
            System.out.println("Reprovado");
        }
    }
}
