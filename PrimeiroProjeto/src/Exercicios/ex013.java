package Exercicios;

import java.util.Scanner;

public class ex013 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Digite a nota do aluno: 1° Unidade");
        double nota = sc.nextDouble();
        System.out.println("Digite a nota do aluno: 2° Unidade");
        double nota2 = sc.nextDouble();

        double media =  (nota + nota2) / 2;
        System.out.println("Media: " + media);

        if (media >=9 && media <=10) {
            System.out.println("Nota: A");
            System.out.println("Aprovado");
        } else if (media >= 7.5 && media < 9) {
            System.out.println("Nota: B");
            System.out.println("Aprovado");
        }else if (media >=6 && media < 7.5) {
            System.out.println("Nota: C");
            System.out.println("Aprovado");
        }else if (media >= 4 && media < 6) {
            System.out.println("Nota: D");
            System.out.println("Reprovado");
        }else if (media >= 0 && media < 4) {
            System.out.println("Nota: E");
            System.out.println("Reprovado");
        }
    }
}
