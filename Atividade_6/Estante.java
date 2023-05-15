package Atividade_6;

import java.util.Scanner;

public class Estante{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int estante[][] = new int[4][3];

        // Quantidade de peças em cada compartimento
        for (int i = 0; i < estante.length; i++) {
            for (int j = 0; j < estante[i].length; j++) {
                System.out.print("Quantidade de peças na prateleira " + (i+1) + " e no compartimento " + (j+1) + ": ");
                estante[i][j] = scanner.nextInt();
            }
        }
        // Exibe a quantidade de peças por prateleira
        for (int i = 0; i < estante.length; i++) {
            int totalPrateleira = 0;
            for (int j = 0; j < estante[i].length; j++) {
                totalPrateleira += estante[i][j];
            }
            System.out.println("A prateleira " + (i+1) + " possui " + totalPrateleira + " peças.");
        }
        scanner.close();
    }
}
