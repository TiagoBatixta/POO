package Listas_Execs;
import java.util.Scanner;

public class Lista1_exec9 {
    public static void main(String args[]){
        Scanner input = new Scanner(System.in);

        int maior = 0;

        for(int i = 0; i<3; i++){
            System.out.print("Digite um numero: ");
            int num = input.nextInt(); 
            if(num > maior){
                maior = num;
            }
        }
        System.out.print("Maior numero é : "+ maior);

        input.close();
    }
}
