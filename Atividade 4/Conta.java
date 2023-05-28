public class Conta {
    private double saldo;
    private String titular;
    private int NumConta;

    public Conta(double saldo, String titular, int NumConta) {
        setSaldo(saldo);
        setTitular(titular);
        setNumConta(NumConta);
    }
    public Conta(){
        
    }

    public double getSaldo() {
        return saldo;
    }
    
    private void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    public String getTitular(){
        return titular;
    }

    public void setTitular(String titular){
        this.titular = titular;
    }

    public int getNumConta(){
        return NumConta;
    }

    public void setNumConta(int NumConta){
        this.NumConta = NumConta;
    }

    public double saque(double valor) {
        if (valor <= 0) {
            throw new IllegalArgumentException("Valor inválido para saque");
        }
        if (saldo < valor) {
            throw new IllegalArgumentException("Saldo insuficiente");
        }
        setSaldo(saldo - valor);
        return saldo;
    }

    public double deposito(double valor) {
        if (valor <= 0) {
            throw new IllegalArgumentException("Valor inválido para depósito");
        }
        setSaldo(saldo + valor);
        return saldo;
    }

    @Override
    public String toString() {
        return String.format("Conta [saldo=%.2f]", saldo);
    }

    public void verDados(){
        System.out.println("Numero da Conta: " + NumConta);
        System.out.println("Nome Titular: "+ titular);
        System.out.println("Valor do saldo: R$" + saldo);  
    }
 
}
