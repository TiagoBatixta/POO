package Listas_Execs;
import java.util.Scanner;

public class Lista1_exec11{
    public static void main(String args[]){
        Scanner input = new Scanner(System.in);
        
        System.out.print("Informe o sexo: ");
        int sexo = input.nextInt();
        System.out.print("Informe altura: ");
        double altura = input.nextDouble();
        double pesoideal = 0.0;

        if(sexo ==1){
            pesoideal = (72.7*altura)-58;
            System.out.printf("Peso ideial para homens é de %.2f de altura é de: %.2f kg",altura, pesoideal);
        }
        else if(sexo==2){
            pesoideal = (62.1*altura)-44.7;
            System.out.printf("Peso ideial para mulheres é de %.2f de altura é de: %.2f kg", altura, pesoideal);
        }
        else
            System.out.print("Valor de Sexo invalido!");
        input.close();
    }

}
