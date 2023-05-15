public class Conta {
    private double saldo;

    public Conta(double saldo) {
        setSaldo(saldo);
    }

    public double getSaldo() {
        return saldo;
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

    private void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    @Override
    public String toString() {
        return String.format("Conta [saldo=%.2f]", saldo);
    }
}
