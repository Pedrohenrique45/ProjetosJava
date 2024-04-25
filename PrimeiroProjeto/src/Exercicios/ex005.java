package Exercicios;

import java.util.Scanner;

public class ex005 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.print("Primeira nota: ");
        double nota1 = scan.nextDouble();

        System.out.println("Segunda nota: ");
        double nota2 = scan.nextDouble();

        double media  = (nota1 + nota2)/2;

        if(media == 10){
            System.out.println("Parabéns você foi aprovado com distinção!!");
        }else if (media >= 6){
            System.out.println("Parbéns você foi aprovado!!");
        }else if (media < 6 && media >=4) {
            System.out.println("Reprovado, mas pode fazer prova final");
        }else {
            System.out.println("Reprovado");
        }
    }
}
