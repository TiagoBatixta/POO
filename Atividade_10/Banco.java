package Atividade_10;

import java.util.Scanner;

public class Banco {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Digite os dados da conta poupança:");
        System.out.print("Número da conta: ");
        int numContaPoupanca = sc.nextInt();
        sc.nextLine();
        System.out.print("Titular da conta: ");
        String titularPoupanca = sc.nextLine();
        System.out.print("Saldo da conta: ");
        double saldoPoupanca = sc.nextDouble();
        System.out.print("Taxa de juros: ");
        double taxaJuros = sc.nextDouble();
        
        ContaPoupanca contaPoupanca = new ContaPoupanca(numContaPoupanca, titularPoupanca, saldoPoupanca, taxaJuros);
        
        System.out.println("\nDigite os dados da conta empresa:");
        System.out.print("Número da conta: ");
        int numContaEmpresa = sc.nextInt();
        sc.nextLine();
        System.out.print("Titular da conta: ");
        String titularEmpresa = sc.nextLine();
        System.out.print("Saldo da conta: ");
        double saldoEmpresa = sc.nextDouble();
        System.out.print("Limite de empréstimo: ");
        double limiteEmprestimo = sc.nextDouble();
        
        ContaEmpresa contaEmpresa = new ContaEmpresa(numContaEmpresa, titularEmpresa, saldoEmpresa, limiteEmprestimo);
        
        System.out.println("\nDados da conta poupança:");
        contaPoupanca.imprime();
        
        System.out.println("\nDados da conta empresa:");
        contaEmpresa.imprime();
        
        sc.close();
    }
}