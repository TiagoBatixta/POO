package Atividade_10;

public class Conta {
    private int numero;
    private String titular;
    private double saldo;
    
    public Conta() {}
    
    public Conta(int numero, String titular, double saldo) {
        this.numero = numero;
        this.titular = titular;
        this.saldo = saldo;
    }
    
    public void setTitular(String titular) {
        this.titular = titular;
    }
    
    public String getTitular() {
        return titular;
    }
    
    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }
    
    public double getSaldo() {
        return saldo;
    }
    
    public void saque(double valor) {
        if (valor > saldo) {
            System.out.println("Saldo insuficiente!");
        } else {
            saldo -= valor;
            System.out.println("Saque realizado com sucesso! Saldo: " + saldo);
        }
    }
    
    public void deposito(double valor) {
        saldo += valor;
        System.out.println("Depósito realizado com sucesso! Saldo: " + saldo);
    }
    
    public void imprime() {
        System.out.println("Número da conta: " + numero);
        System.out.println("Titular da conta: " + titular);
        System.out.println("Saldo da conta: " + saldo);
    }
}

