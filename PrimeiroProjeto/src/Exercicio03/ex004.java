package Exercicio03;

import java.util.Scanner;

public class ex004 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int vetorA[] = new int[15];
        int vetorB[] = new int[vetorA.length];
        for (int i = 0; i < vetorA.length; i++){
            System.out.println("Digite um valor: ");
            vetorA[i] = sc.nextInt();
        }

        for (int i = 0; i < vetorA.length; i++){
            vetorB[i] = vetorA[i] * vetorA[i];
        }

        System.out.print("Vetor A = ");
        for(int i = 0; i < vetorA.length; i++){
            System.out.print(vetorA[i] + " ");
        }

        System.out.print("Vetor B = ");
        for(int i = 0; i < vetorB.length; i++){
            System.out.print(vetorB[i] + " ");
        } 
    }
}
