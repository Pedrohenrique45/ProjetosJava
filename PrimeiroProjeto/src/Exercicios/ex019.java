package Exercicios;

import java.util.Scanner;

public class ex019 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Digite um número inteiro: ");
        int n = sc.nextInt();

        if(n%2 == 0){
            System.out.println("Ele é par");
        }else{
            System.out.println("Ele é impar");
        }

    }
}
