package Exercicio02;

import java.util.Scanner;

public class ExerExtra {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        //Sistema de cadastro e de verificação de cadastro
        while(true){
            System.out.println("Usuário: ");
            String usuario = sc.nextLine().toLowerCase();
            System.out.println("Senha: ");
            String senha = sc.nextLine().toLowerCase();

            if(usuario.equals(senha)){
                System.out.println("Senha correta!");
                break;
            }else{
                System.out.println("Senha incorreta!");
            }
        }
    }
}
