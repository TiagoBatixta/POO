import java.util.Scanner;

public class CelsiusParaFahrenheit{
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Digite uma temperatura em Celsius: ");
        double celsius = input.nextDouble();
        double fahrenheit =(celsius * 9/5) + 32;
        System.out.printf("%.2f\u00B0C eh equivalente a %.2f\u00B0F", celsius, fahrenheit);
    }
}