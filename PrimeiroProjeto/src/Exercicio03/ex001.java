package Exercicio03;

import java.util.Scanner;

public class ex001 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int[] vetorA = new int[5];
        int[] vetorB = new int[vetorA.length];

        for (int i = 0; i < vetorA.length; i++) {
            System.out.println("Digite o valor do vetor A na posiçã " + i);
            vetorA[i] = sc.nextInt(); //atribuir o valor ao vetor
        }

        for (int i = 0; i < vetorA.length; i++) {
            vetorB[i] = vetorA[i];
        }

        System.out.print("Vetor A = " );
        for (int i = 0; i <vetorA.length; i++) {
            System.out.print(vetorA[i] + " ");
        }

        System.out.print("\nVetor B = " );
        for(int i = 0; i < vetorB.length; i++){
            System.out.print(vetorB[i] + " " );
        }
    }
}
