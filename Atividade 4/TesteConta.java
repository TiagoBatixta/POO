import java.util.Scanner;
public class TesteConta {
    
    public static void main (String args[]){
        Scanner input = new Scanner(System.in);

        Conta c1 = new Conta(1489.56, "Tiago Batista", 4565);

        Conta c2 = new Conta();
        System.out.println("Adicione um conta");
        
        System.out.println("\nNome do titular: ");
        String nome = input.nextLine(); 
        c2.setTitular(nome);
        
        System.out.println("\nNumero da Conta: ");
        int num = input.nextInt(); 
        c2.setNumConta(num);
        
        // // System.out.println("\nSaldo da Conta: ");
        // double saldo = 0.0; 
        // c2.setSaldo(saldo);
        
        c2.verDados();
        
        System.out.println("\nQual conta deseja efetuar a operacao:");
        int cont = input.nextInt();


        System.out.println("Escolha uma opção:");
        System.out.println("1. Depósito");
        System.out.println("2. Saque");
        int op = input.nextInt();

        try {
            if(cont == 1){
                if(op == 1){
                    System.out.println("\nValor para depositar na Conta: "+ c1.getNumConta());
                    double valorDeposito = input.nextDouble();
                    c1.deposito(valorDeposito);
                    System.out.println("\nDados da conta "+ c1.getNumConta() + " atualizados após a operação de Depósito:\n");
                    c1.verDados();
                }
                else if(op == 2){
                    System.out.println("\nValor para ser sacado da Conta: " + c1.getNumConta());
                    double valorSaque = input.nextDouble();
                    c1.saque(valorSaque);
                    System.out.println("\nDados da conta "+ c1.getNumConta() + " atualizados após a operação de Saque:\n");
                    c1.verDados();
                }
                else{
                    System.out.println("Operação inválida");
                }
            }
            else if(cont == 2){
                if(op == 1){
                    System.out.println("\nValor para depositar na Conta: "+ c2.getNumConta());
                    double valorDeposito = input.nextDouble();
                    c2.deposito(valorDeposito);
                    System.out.println("\nDados da conta "+ c2.getNumConta() + " atualizados após a operação de Depósito:\n");
                    c2.verDados();
                }
                else if(op == 2){
                    System.out.println("\nValor para ser sacado da Conta: " + c2.getNumConta());
                    double valorSaque = input.nextDouble();
                    c2.saque(valorSaque);
                    System.out.println("\nDados da conta "+ c2.getNumConta() + " atualizados após a operação de Saque:\n");
                    c2.verDados();
                }
                else{
                    System.out.println("Operação inválida");
                }
            }
            else{
                System.out.println("Conta inválida");
            }
            
        } catch (IllegalArgumentException e) {
            System.out.println("Erro. Fim do Programa.");
        }
        input.close();
    }
}
