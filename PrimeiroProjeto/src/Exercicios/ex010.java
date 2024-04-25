package Exercicios;

import java.util.Scanner;

public class ex010 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Qual o seu salário? ");
        double salario = scan.nextDouble();

        double reajuste = 0;
        if(salario <= 280 ){
            double valorAplicado = 0.2;
            reajuste = salario * valorAplicado;
            System.out.println("O valor aplicado foi: " + valorAplicado);
        } else if(salario > 280 && salario <= 700){
            double valorAplicado = 0.15;
            reajuste = salario * valorAplicado;
            System.out.println("O valor aplicado foi: " + valorAplicado);
        }else if(salario > 700 && salario <= 1500 ){
            double valorAplicado = 0.10;
            reajuste = salario * valorAplicado;
            System.out.println("O valor aplicado foi: " + valorAplicado);
        }else if(salario > 1500){
            double valorAplicado = 0.05;
            reajuste = salario * valorAplicado;
            System.out.println("O valor aplicado foi: " + valorAplicado);
        }


        System.out.println("Valor do aumento: " + reajuste + " R$");
        System.out.println("Salário: " + salario + " R$");
        System.out.println("Seu aumento: " + (salario + reajuste) + " R$");

      
    }
}
