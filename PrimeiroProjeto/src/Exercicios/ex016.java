package Exercicios;

import java.util.Scanner;

public class ex016 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Digite um número entre 1 e 999: ");
        int num = sc.nextInt();

        System.out.print( num + "= ");

        if(num < 1 || num > 999){
            System.out.println("Número inválido");
        }else {
           int centenas = num / 100;
           int resto = num % 100;
           int dezenas = resto / 10;
           int unidade = resto % 10;

           String unid = "unidades";
           String dez = "dezenas";
           String cent = "centenas";

           if(unidade == 1){
               unid = "unidade";
           }else if(dezenas == 1){
               dez = "dezena";
           }else if(centenas == 1){
               cent = "centena";
           }


           if(centenas == 0 && dezenas == 0) {
               System.out.print(unidade + " "+ unid);
           }else if(centenas == 0){
               System.out.print(dezenas + " " + dez + " e " + unidade + " "+ unid);
           }else{
               System.out.print(centenas  + " " + cent + " , " + dezenas + " " + dez + " e " + unidade + " " +unid );
           }
        }
    }
}
