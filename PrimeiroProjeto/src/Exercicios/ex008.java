package Exercicios;

import java.util.Scanner;

public class ex008 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        
        System.out.print("Produto 1: ");
        double valor1 = scan.nextDouble();
        System.out.print("Produto 2: ");
        double valor2 = scan.nextDouble();
        System.out.print("Produto 3: ");
        double valor3 = scan.nextDouble();

        double menorValor = valor2;
        
        if(valor2 <  menorValor){
            menorValor = valor2;
        }else if(valor3 < menorValor){
            menorValor = valor3;
        }

        System.out.println("O produto que vocÊ deve comprar é o de valor: " + menorValor);

    }
}
