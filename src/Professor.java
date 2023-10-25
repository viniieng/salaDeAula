public class Professor extends Pessoa {
    private double salario;

    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }

    public Professor() {

    }

    public Professor(String nome, int idade, double salario) {
        this.salario = salario;
        this.setNome(nome);
        this.setIdade(idade);
    }
}
