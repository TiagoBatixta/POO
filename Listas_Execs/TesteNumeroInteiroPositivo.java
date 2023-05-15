package Listas_Execs;

import java.util.Scanner;

public class TesteNumeroInteiroPositivo {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite um número inteiro positivo: ");
        int numero = scanner.nextInt();

        NumeroInteiroPositivo n = new NumeroInteiroPositivo(numero);

        System.out.println("O número " + numero + " é par? " + n.ehPar());
        System.out.println("O número " + numero + " é primo? " + n.ehPrimo());
        System.out.println("O fatorial de " + numero + " é " + n.fatorial());

        scanner.close();

    }

}
