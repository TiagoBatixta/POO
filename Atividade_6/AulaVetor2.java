package Atividade_6;
import java.util.Scanner;

    public class AulaVetor2{
        public static void main (String args[]){
            double notas[][] = new double[3][2]; 
            Scanner input = new Scanner(System.in); 

            double media;
            int aluno, nota;

            for (aluno=0; aluno<3;aluno++){
                for(nota=0;nota<2;nota++){
                    System.out.print("Aluno "+(aluno+1)+": digite a " +(nota+1)+" nota: ");
                    notas[aluno][nota]= input.nextDouble();
                }
            }
                    System.out.println("Digite o Num do aluno:");
                    aluno = input.nextInt();
                    
                    System.out.print("Aluno: "+aluno);
                    System.out.print("\nNota 1: "+notas[aluno-1][0]);
                    System.out.print("\nNota 2: "+notas[aluno-1][1]);
                    media = (notas[aluno-1][0]+notas[aluno-1][1])/2;
                    System.out.println("\nmedia: "+media);                   
        }
}