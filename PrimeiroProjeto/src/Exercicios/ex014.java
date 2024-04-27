package Exercicios;

import java.util.Scanner;

public class ex014 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Me diga um ano: ");
        int ano = sc.nextInt();

        if (ano % 4 == 0 && ano % 100!=0 || ano % 400 ==0) {
            System.out.println("O " + ano + " é bissexto");
        }else{
            System.out.println("Esse ano não é bissexto");
        }
    }
}
