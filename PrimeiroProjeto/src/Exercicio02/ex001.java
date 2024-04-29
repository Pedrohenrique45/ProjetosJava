package Exercicio02;

import java.util.Scanner;

public class ex001 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while(true){
            System.out.println("Digite uma nota: ");
            double nota = sc.nextDouble();

            if(nota >= 0 && nota <= 10){
                System.out.println("Nota Válida ");
                break;
            }else{
                continue;
            }
        }
    }
}
