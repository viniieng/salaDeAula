public class Aluno extends Pessoa {
    private double nota;

    public Aluno(double nota, String nome, int idade) {
        this.nota = nota;
        this.setNome(nome);
        this.setIdade(idade);
    }

    public Aluno() {

    }

    public double getNota() {
        return nota;
    }

    public void setNota(double nota) {
        this.nota = nota;
    }
}
