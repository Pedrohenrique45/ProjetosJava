package Exercicios;

import java.util.Scanner;

public class ex015 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Digite uma data de acordo com esse formato dd/mm/aaaa ");
        String data = sc.nextLine();

        //verificar se a entrada está com o formato correto
        if (data.length() != 10 || data.charAt(2) != '/' || data.charAt(5) != '/') {
            System.out.println("O formato não é aceitável. Use o formato dd/mm/aaaa");
        }else{
            //separar dia, mês e ano
            String[] partesData = data.split("/");
            int dia = Integer.parseInt(partesData[0]);
            int mes = Integer.parseInt(partesData[1]);
            int ano = Integer.parseInt(partesData[2]);

            //verificar se o ano é bissexto
            boolean bissexto = (ano % 4 == 0 && ano % 100 != 0 || ano % 400 == 0);

            if(mes < 1 || mes > 12){
                System.out.println("Mês inválido");
            }else{
                // verificar o número de dias do mês
                int diasNoMes;
                switch (mes) {
                    case 2:
                        diasNoMes = bissexto ? 29 : 28;
                        break;
                    case 4:
                    case 6:
                    case 9:
                    case 11:
                        diasNoMes = 30;
                        break;
                    default:
                        diasNoMes = 31;
                }

                // verificar se o dia é válido
                if(dia < 1 || dia > diasNoMes){
                    System.out.println("O dia é inválido");
                }else{
                    System.out.println("Data válida");
                }
            }
        }




    }
}
