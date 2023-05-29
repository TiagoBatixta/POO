public class Aluno extends Pessoa {
    private String curso;

    public Aluno(String nome, int idade, String endereco, String curso) {
        super(nome, idade, endereco);
        this.curso = curso;
    }
    public String getCurso() {
        return curso;
    }

    public void setCurso(String curso) {
        this.curso = curso;
    }

    public String toString(){
        return super.toString() + "\nCurso: " + getCurso();
    }

}