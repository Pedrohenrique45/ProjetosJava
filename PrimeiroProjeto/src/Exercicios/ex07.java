package Exercicios;

import java.util.Scanner;

public class ex07 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        // Melhoria no exercicio 006

        System.out.print("Numero 1: ");
        double numero1 = scan.nextDouble();
        System.out.print("Numero 2: ");
        double numero2 = scan.nextDouble();
        System.out.print("Numero 3: ");
        double numero3 = scan.nextDouble();

        double maiorNumero = numero1;
        double menorNumero = numero1;

        if (numero2 > maiorNumero){
            maiorNumero = numero2;
        }else if (numero3 > maiorNumero){
            maiorNumero = numero3;
        }

        if(numero2 < menorNumero){
            menorNumero = numero2;
        }else if(numero3 < menorNumero){
            menorNumero = numero3;
        }

        System.out.println("O maior número é: " + maiorNumero);
        System.out.println("O menor número é: " + menorNumero);
    }
}
