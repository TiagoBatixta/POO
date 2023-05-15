package Atividade_10;

public class ContaEmpresa extends Conta {
    private double limiteEmprestimo;
    
    public ContaEmpresa(int numero, String titular, double saldo, double limiteEmprestimo) {
        super(numero, titular, saldo);
        this.limiteEmprestimo = limiteEmprestimo;
    }
    
    public void emprestimo(double valor) {
        if (valor > limiteEmprestimo) {
            System.out.println("Valor do empréstimo excede o limite disponível!");
        } else {
            setSaldo(getSaldo() + valor);
            System.out.println("Empréstimo realizado com sucesso! Saldo: " + getSaldo());
        }
    }
    
    public void imprime() {
        System.out.println("Tipo da conta: Empresa");
        super.imprime();
    }
}