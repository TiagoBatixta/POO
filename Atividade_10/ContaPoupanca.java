package Atividade_10;

public class ContaPoupanca extends Conta {
    private double taxaJuros;
    
    public ContaPoupanca(int numero, String titular, double saldo, double taxaJuros) {
        super(numero, titular, saldo);
        this.taxaJuros = taxaJuros;
    }
    
    public void atualizaSaldo() {
        double juros = getSaldo() * taxaJuros / 100;
        setSaldo(getSaldo() + juros);
        System.out.println("Saldo atualizado com sucesso! Saldo: " + getSaldo());
    }
    
    public void imprime() {
        System.out.println("Tipo da conta: Poupança");
        super.imprime();
    }
}