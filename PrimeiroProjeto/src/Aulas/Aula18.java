package Aulas;

import java.util.Scanner;

public class Aula18 {
    public static void main(String[] args) {
        //Comando break e continuos
        Scanner entrada = new Scanner(System.in);
        System.out.println("Digite um número: ");
        int numero = entrada.nextInt();
        System.out.println("Entre com um limite: ");
        int max = entrada.nextInt();

        for(int i = numero; i <=max; i++){
            if (i%7 == 0){
                System.out.println("o Valor de i: " + i);
                break;
            }
        }
    }
}
