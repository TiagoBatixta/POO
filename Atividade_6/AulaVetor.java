package Atividade_6;

import java.util.Scanner;

public class AulaVetor {
    public static void main(String args[]){

        Scanner input = new Scanner(System.in);
        int i, quant=0,total=0;
        int N[] = new int[10];

        System.out.println("Digite o numero de valores a inserir: ");
        quant = input.nextInt();

        for(i=0;i<quant;i++){
            System.out.printf("Digite o valor %d: ",i+1);
            N[i] = input.nextInt();
            total += N[i];
        }
        System.out.println("valores do Vetor");
        for(i=0;i<quant;i++){
            System.out.print(N[i]+", "); 
        }

        System.out.println("\nSomatoria = "+total);
        System.out.printf("Media: %.2f",(double)total/quant);
        System.out.printf("\nValor de N: %d", N.length);

        input.close();
    }
}
