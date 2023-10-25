import java.util.ArrayList;

public class Turma {
    private String nome;
    private Professor professor;

    private ArrayList<Aluno> listaAlunos;


    public Turma() {
        this.listaAlunos = new ArrayList<>();
    }

    public Professor getProfessor() {
        return professor;
    }

    public String getNome() {
        return nome;
    }

    public ArrayList<Aluno> getListaAlunos() {
        return listaAlunos;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void adicionarAluno(Aluno aluno) {
        this.listaAlunos.add(aluno);
    }

    public void adicionarProfessor(Professor professor) {
        this.professor = professor;
    }

    public void vizualizarTurma() {
        System.out.println("-------------------------------");
        System.out.println(this.nome);
        System.out.println("-------------------------------");
        System.out.println(this.professor.getNome());
        System.out.println(this.professor.getIdade());
        System.out.println(this.professor.getSalario());
        System.out.println("-------------------------------");
        for (int i = 0; i < this.listaAlunos.size(); i++) {
           Aluno aluno = this.listaAlunos.get(i);
            System.out.println(aluno.getNome() + "|" + aluno.getNota() + "|" + aluno.getIdade());
       }

    }
}

