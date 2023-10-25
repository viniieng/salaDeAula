public class Main {
    public static void main(String[] args) {

        Aluno aluno1 = new Aluno(2.0, "Vinicius", 19);
        Aluno aluno2 = new Aluno(7.0, "Kath", 20);
        Aluno aluno3 = new Aluno(10, "Thomas", 21);
        Professor professor1 = new Professor("Fabricio", 18, 1000);
        Turma turma1 = new Turma();

        turma1.setNome("305");
        turma1.adicionarProfessor(professor1);
        turma1.adicionarAluno(aluno1);
        turma1.adicionarAluno(aluno2);
        turma1.adicionarAluno(aluno3);
        turma1.vizualizarTurma();

    }
}