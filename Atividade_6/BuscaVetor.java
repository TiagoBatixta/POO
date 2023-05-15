package Atividade_6;

import java.util.Scanner;

public class BuscaVetor {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        double vetor[]= {1.0, 2.0, 3.0, 4.0, 5.0, 6.0, 7.0, 8.0, 9.0, 10.1,
                          11.2, 12.3, 13.4, 14.5, 15.6, 16.7, 17.8, 18.9, 9.0, 20.1};

        System.out.print("Informe um valor para pesquisar no vetor: ");
        double valor = input.nextDouble();

        boolean encontrado = false;
        int i = 0;
        while(i < vetor.length){
            if(vetor[i] == valor){
                encontrado = true;
                System.out.println("Valor encontrado na posição " + i);
            }
            i +=1;
        }
        if (encontrado==false) {
            System.out.println("Valor não encontrado no vetor.");
        }
        input.close();
    }
}
