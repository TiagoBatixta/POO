import java.util.Scanner;

public class Estudo_P1_1 {
    
    public static void main(String arqs[]){

        Scanner input = new Scanner(System.in);
        
        double valorReal, ValorConvert, ValorDolar;

        ValorDolar = 5.10;

        System.out.print("Valor em Real: R$");
        valorReal = input.nextDouble();

        ValorConvert = (valorReal / ValorDolar);

        System.out.printf("O Valor em real para Dolar é de: $%5.2f\n", ValorConvert);

        input.close();
    }  
}
