package Exercicios;

import java.util.Scanner;

public class ex011 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Digite quantas horas você trabalha: ");
        double hora = scan.nextDouble();

        System.out.println("Dgite qual o valor por hora: ");
        double valor = scan.nextDouble();

        double salario = hora * valor;
        double inss = salario * 0.10;
        double ir = 0;
        double fgts = salario * 0.11;

        if(salario <= 900) {
            inss = salario * 0.10;
        } else if(salario > 900 && salario <= 1500) {
            ir = salario * 0.05;
        }else if(salario > 1500 && salario <= 2500) {
            ir = salario * 0.10;
        }else if(salario > 2500) {
            ir = salario * 0.20;
        }

        double totalDesconto = inss + ir;
        double salarioLiquido = salario - totalDesconto;

        System.out.println("Salário bruto: " + salario);
        System.out.println("Inss: " + inss);
        System.out.println("Ir: " + ir);
        System.out.println("FGTS: " + fgts);
        System.out.println("Total desconto: " + totalDesconto);
        System.out.println("Salário Liquido: " + salarioLiquido);



        // Produtos a serem mostrados
        // Salário bruto:
        // IR -- 5%
        // INSS -- 10%
        // FGTS -- 11%
        // Total de descontos = IR + INSS
        // Salário liquido: Salário bruto - Tot de descontos
    }
}
