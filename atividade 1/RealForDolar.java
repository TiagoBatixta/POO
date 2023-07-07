import java.util.Scanner;

public class RealForDolar {
    public static void main(String[] args) {
        final double CAMBIO = 5.20;
        Scanner input = new Scanner(System.in);
        System.out.print("Digite um valor em Real: R$");
        double valorEmReal = 0;
        try {
            valorEmReal = input.nextDouble();
        } catch (Exception e) {
            System.out.println("Valor invalido. Tente novamente.");
        }
        double valorEmDolar = valorEmReal / CAMBIO;
        System.out.printf("R$ %.2f é equivalente a US$ %.2f\n", valorEmReal, valorEmDolar);

        input.close();
    }
}
