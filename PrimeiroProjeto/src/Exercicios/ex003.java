package Exercicios;

import java.util.Scanner;

public class ex003 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int vetorA[] = new int[8];
        int vetorB[] = new int[vetorA.length];
        for (int i = 0; i< vetorA.length; i++) {
            System.out.println("Digite o valores do vetor: " );
            vetorA[i] = sc.nextInt();
        }

        for (int i = 0; i < vetorB.length; i++){
            vetorB[i] = vetorA[i] * 2;
        }

        System.out.print("Vetor A = ");
        for (int i = 0; i < vetorA.length; i++) {
            System.out.print(vetorA[i] + " ");
        }

        System.out.print("\nVetor B = ");
        for(int i = 0; i < vetorB.length; i++){
            System.out.print(vetorB[i] + " ");
        }


    }
}
