//package Atividade_8

public class TesteAluno {
    public static void main(String[] args) {
        Aluno aluno = new Aluno("Tiago Batista", 20, "Avenida Tiradentes, 123", "ADS");
        System.out.println("Nome: " + aluno.getNome());
        System.out.println("Idade: " + aluno.getIdade());
        System.out.println("Endereço: " + aluno.getEndereco());
        System.out.println("Curso: " + aluno.getCurso());
    }
}
