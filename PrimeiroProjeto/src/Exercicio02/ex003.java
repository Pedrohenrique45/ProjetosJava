package Exercicio02;

import java.util.Scanner;

public class ex003 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        while(true){
            System.out.println("Digite seu nome: ");
            String nome = sc.nextLine();
            System.out.println("Digite sua idade: ");
            int idade = sc.nextInt();
            System.out.println("Digite seu sexo: (m ou f)");
            String sexo = sc.next().toLowerCase();
            System.out.println("Digite seu salário: ");
            double salario = sc.nextDouble();
            System.out.println("Digite seu estado civil: (s,v,c,d) ");
            String estadoCivil = sc.next().toLowerCase();

            if(nome.length() < 3){
                System.out.println("Nome inválido");
            }else if(idade < 0 && idade >= 150){
                System.out.println("Idade inválida");
            }else if(salario < 0 ){
                System.out.println("Salário inválido");
            }else if(sexo != "f" || sexo != "m"){
                System.out.println("Sexo inválido");
            }else if(estadoCivil != "s" || estadoCivil != "c" || estadoCivil != "v" || estadoCivil != "d") {
                    System.out.println("Estado inválido");
            }else{
                break;
            }


        }
    }
}
