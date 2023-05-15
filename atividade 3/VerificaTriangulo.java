import java.util.Arrays;
import java.util.Scanner;

public class VerificaTriangulo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("Digite o valor do primeiro lado: ");
        int a = scanner.nextInt();
        
        System.out.println("Digite o valor do segundo lado: ");
        int b = scanner.nextInt();
        
        System.out.println("Digite o valor do terceiro lado: ");
        int c = scanner.nextInt();
        
        // Ordena os valores em ordem crescente
        int[] valores = {a, b, c};
        Arrays.sort(valores);
        
        // Verifica se pode formar um triângulo
        if (valores[0] + valores[1] > valores[2]) {
            // Verifica o tipo de triângulo
            if (a == b && b == c) {
                System.out.println("É possivel formar um Triângulo: equilátero");
            } else if (a == b || b == c || a == c) {
                System.out.println("É possivel formar um Triângulo: isósceles");
            } else {
                System.out.println("É possivel formar um Triângulo: escaleno");
            }
        } else {
            System.out.println("Não é possível formar um triângulo");
        }
        scanner.close();
    }
}
