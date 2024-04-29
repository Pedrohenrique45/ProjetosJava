package Exercicio02;

import java.util.Scanner;

public class ex002 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);


        while(true){
            System.out.println("Usuário: ");
            String usuario = sc.nextLine();
            System.out.println("Senha: ");
            String senha = sc.nextLine();

            if(!usuario.equals(senha)){
                System.out.println("Senha correta!");
                break;
            }else{
                System.out.println("Senha incorreta!");
                continue;
            }
        }


    }
}
