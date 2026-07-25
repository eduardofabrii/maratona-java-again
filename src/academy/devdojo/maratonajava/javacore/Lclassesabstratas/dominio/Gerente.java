package academy.devdojo.maratonajava.javacore.Lclassesabstratas.dominio;

public class Gerente extends Funcionario {
    public Gerente(String nome, double salario) {
        super(nome, salario);
    }

    @Override
    public String toString() {
        return "Gerente{" +
                "nome='" + nome + '\'' +
                ", salario=" + salario +
                ", bonus=" + bonus +
                '}';
    }

    @Override
    public void calcularBonus() {
        this.bonus = this.salario * 0.4;
        this.salario = this.salario + this.bonus;
    }
}
