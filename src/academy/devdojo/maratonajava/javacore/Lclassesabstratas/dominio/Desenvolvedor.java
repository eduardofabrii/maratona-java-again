package academy.devdojo.maratonajava.javacore.Lclassesabstratas.dominio;

public class Desenvolvedor extends Funcionario {
    public Desenvolvedor(String nome, double salario) {
        super(nome, salario);
    }

    @Override
    public String toString() {
        return "Desenvolvedor{" +
                "nome='" + nome + '\'' +
                ", salario=" + salario +
                ", bonus=" + bonus +
                '}';
    }

    @Override
    public void calcularBonus() {
        this.bonus = this.salario * 0.1;
        this.salario = this.salario + this.bonus;
    }

    @Override
    public void imprime() {
        super.imprime();
    }
}
