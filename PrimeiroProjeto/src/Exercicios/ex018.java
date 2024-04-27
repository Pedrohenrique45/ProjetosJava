package Exercicios;

import java.util.Scanner;

public class ex018 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Qual valor deseja sacar: ");
        int valor = sc.nextInt();

        int centenas = valor /100;
        int resto = valor %100;
        int dezenas = resto / 10;
        int unidades = valor % 10;

        if (valor >= 10 && valor <=600){
            switch (centenas){
                case 1: System.out.println("1 nota de 100"); break;
                case 2: System.out.println("2 notas de 100"); break;
                case 3: System.out.println("3 notas de 100"); break;
                case 4: System.out.println("4 notas de 100"); break;
                case 5: System.out.println("5 notas de 100"); break;
                case 6: System.out.println("6 notas de 100"); break;
                case 0: System.out.println(" --- "); break;
            }
            switch (dezenas){
                case 1: System.out.println("1 nota de 10"); break;
                case 2: System.out.println("2 notas de 10"); break;
                case 3: System.out.println("3 notas de 10"); break;
                case 4: System.out.println("4 notas de 10"); break;
                case 5: System.out.println("1 nota de 50"); break;
                case 6: System.out.println("1 nota de 50 e 1 nota de 10"); break;
                case 7: System.out.println("1 nota de 50 e 2 notas de 10"); break;
                case 8: System.out.println("1 nota de 50 e 3 notas de 10"); break;
                case 9: System.out.println("1 nota de 50 e 4 notas de 10"); break;
                case 0: System.out.println(" --- "); break;
            }
            switch (unidades){
                case 1: System.out.println("1 nota de 1"); break;
                case 2: System.out.println("2 notas de 1"); break;
                case 3: System.out.println("3 notas de 1"); break;
                case 4: System.out.println("4 notas de 1"); break;
                case 5: System.out.println("1 nota de 5"); break;
                case 6: System.out.println("1 nota de 5 e 1 nota de 1"); break;
                case 7: System.out.println("1 nota de 5 e 2 notas de 1"); break;
                case 8: System.out.println("1 nota de 5 e 3 notas de 1"); break;
                case 9: System.out.println("1 nota de 5 e 4 notas de 1"); break;
                case 0: System.out.println(" --- "); break;
            }
        }else{
            System.out.println("Valor invalido");
        }


    }
}
