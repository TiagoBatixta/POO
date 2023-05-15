package Listas_Execs;

public class NumeroInteiroPositivo {

    private int valor;

    public NumeroInteiroPositivo(int valor) {
        if (valor < 1) {
            throw new IllegalArgumentException("O valor deve ser maior ou igual a 1.");
        }
        this.valor = valor;
    }

    public boolean ehPar() {
        return valor % 2 == 0;
    }

    public boolean ehPrimo() {
        if (valor == 2) {
            return true;
        } else if (valor < 2 || valor % 2 == 0) {
            return false;
        } else {
            for (int i = 3; i <= Math.sqrt(valor); i += 2) {
                if (valor % i == 0) {
                    return false;
                }
            }
            return true;
        }
    }

    public int fatorial() {
        int resultado = 1;
        for (int i = 2; i <= valor; i++) {
            resultado *= i;
        }
        return resultado;
    }

}
