package Exercicios;
import java.util.Scanner;

public class ex004 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        
        System.out.println("Digite a sua idade: ");
        double idade = scan.nextDouble();
                
        if (idade >= 18){
            System.out.println("Maior de idade");
        } else{
            System.out.println("Menor de idade ");
        }
        
    }   
}
