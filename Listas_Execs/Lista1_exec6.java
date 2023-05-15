package Listas_Execs;

import java.util.Scanner;

public class Lista1_exec6{

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Informe o consumo de energia em kWh: ");
        double consumo = sc.nextDouble();

        double valorConta = 0.0;

        if (consumo <= 50.0) {
            valorConta = 10.0;
        } else if (consumo <= 100.0) {
            valorConta = 10.0 + (consumo - 50.0) * 0.2;
        } else if (consumo <= 200.0) {
            valorConta = 10.0 + 50.0 * 0.2 + (consumo - 100.0) * 0.25;
        } else {
            valorConta = 10.0 + 50.0 * 0.2 + 100.0 * 0.25 + (consumo - 200.0) * 0.35;
        }

        System.out.printf("O valor da conta de energia é R$ %.2f", valorConta);

        sc.close();
    }
}
