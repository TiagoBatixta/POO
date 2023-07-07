import java.util.Scanner;

public class CalculaDigitoVerificador {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("Digite o número da conta:");
        String conta = scanner.next();
        
        // Soma os dígitos da conta
        int soma = 0;
        for (int i = 0; i < conta.length(); i++) {
            int digito = Character.getNumericValue(conta.charAt(i));
            soma += digito;
        }
        //System.out.println(soma);
        
        // Calcula o dígito verificador
        int resto = soma % 10;
        int dv = 10 - resto;
        if (dv == 10 || dv == 11) {
            dv = 0;
        }
        
        System.out.println("O Numero da conta é: 00"+conta+"-"+dv);
        scanner.close();
    }
}