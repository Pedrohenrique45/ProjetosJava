package Exercicios;

import java.util.Arrays;
import java.util.Scanner;

public class ex009 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        // o programa que pegue três números e mostre em ordem decrescente

        double[] numero = new double[3]; // criar um array

        // pega valores e adiciona no array
        System.out.println("Numero 1: ");
        numero[0] = scan.nextDouble();

        System.out.println("Numero 2: ");
        numero[1] = scan.nextDouble();

        System.out.println("Numero 3: ");
        numero[2] = scan.nextDouble();

        // ordena o array em orde decrescente e com o for mostra os valores na tela
        Arrays.sort(numero); 
        for(int i = numero.length - 1; i >=0; i--){
            System.out.println(numero[i]);
        }

    }
}
