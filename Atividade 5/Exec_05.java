import java.util.Scanner;

public class Exec_05 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Pedir para o usuário informar os dados do terreno
        System.out.print("Informe a largura do terreno: ");
        double largura = input.nextDouble();
        System.out.print("Informe o comprimento do terreno: ");
        double comprimento = input.nextDouble();

        // Calcular e exibir a área do terreno
        double area = calcular(largura);
        System.out.println("Área do terreno quadrado: " + area);

        area = calcular(largura, comprimento);
        System.out.println("Área do terreno retangular: " + area);

        input.close();
    }

    public static double calcular(double lado) {
        return lado * lado;
    }

    public static double calcular(double largura, double comprimento) {
        return largura * comprimento;
    }
}
