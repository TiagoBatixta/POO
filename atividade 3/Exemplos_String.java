
public class Exemplos_String{
    public static void main(String[] args){

        //        1 - Método length()
//        O método length() retorna o número de caracteres na String. O exemplo a seguir mostra como usá-lo:
        String nome_1 = "Tiago";
        int tamanhoNome = nome_1.length(); // Retorna 4
        System.out.println("O tamanho da String "+ nome_1 +" é: "+tamanhoNome);

        //      2 - Método substring()
//        O método substring() retorna uma parte da String com base nos índices especificados. O exemplo a seguir mostra como usá-lo:
        String nomeCompleto = "Tiago Batista da Silva";
        String sobrenome = nomeCompleto.substring(14); // Retorna "da Silva"
        String nome_2 = nomeCompleto.substring(0, 5);
        System.out.println(sobrenome);
        System.out.println(nome_2);

        //        3 -Método replace()
//        O método replace() substitui uma sequência de caracteres por outra sequência de caracteres. O exemplo a seguir mostra como usá-lo:        
        String frase = "O rato roeu a roupa do rei de Roma";
        String novaFrase = frase.replace("rato", "Elefante");
        System.out.println(novaFrase);
    }
}