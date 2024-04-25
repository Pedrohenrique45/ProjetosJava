package Exercicios;

import java.util.Scanner;

public class ex006 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.print("Numero 1: ");
        double numero1 = scan.nextDouble();
        System.out.print("Numero 2: ");
        double numero2 = scan.nextDouble();
        System.out.print("Numero 3: ");
        double numero3 = scan.nextDouble();

        if(numero1 > numero2 && numero1 >numero3){
            System.out.println("O " + numero1 + " é o maior");
        }else if (numero2 > numero1 && numero2 > numero3){
            System.out.println("O " + numero2 + " é maior");
        }else if(numero3 > numero1 && numero3 > numero2){
            System.out.println("O " + numero3 + " é maior");
        }
    }
}
