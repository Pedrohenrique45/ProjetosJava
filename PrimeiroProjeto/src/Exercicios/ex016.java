package Exercicios;

import java.util.Scanner;

public class ex016 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Digite um número entre 1 e 999: ");
        int num = sc.nextInt();

        if(num < 1 || num > 999){
            System.out.println("Número inválido");
        }else {
           int centenas = num / 100;
           int resto = num % 100;
           int dezenas = resto / 10;
           int unidade = resto % 10;
        }
    }
}
