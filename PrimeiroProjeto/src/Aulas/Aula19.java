package Aulas;

public class Aula19 {
    public static void main(String[] args) {
        double temperatura[] = new double[365];

        temperatura [0] = 32.1;
        temperatura [1] = 33.1;
        temperatura [2] = 32.5;
        temperatura [3] = 33;
        temperatura [4] = 33.1;

        //definir tamanho do array
        System.out.println("o tamanho do array" + temperatura.length);
        //Mostra a posição do array na memória
        System.out.println("Os valores do array: " + temperatura);
        //forma padrão de interar array
        for(int i = 0; i < temperatura.length; i++){
            System.out.println(temperatura[i]);
        }

        //for melhorado
        // o temp intera o array, pega a posição zero e coloca dentro do array, tem somente acesso ao valor
        for(double temp : temperatura){
                System.out.println(temp);
        }


    }
}
