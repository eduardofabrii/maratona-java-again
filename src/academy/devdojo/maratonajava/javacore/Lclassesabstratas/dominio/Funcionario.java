package academy.devdojo.maratonajava.javacore.Lclassesabstratas.dominio;

public abstract class Funcionario extends Pessoa {
    protected String nome;
    protected double salario;
    protected double bonus;

    public Funcionario(String nome, double salario) {
        this.nome = nome;
        this.salario = salario;
        calcularBonus();
    }

    @Override
    public void imprime() {
        System.out.println("Nome: " + this.nome);
        System.out.println("Salário: " + this.salario);
        System.out.println("Bônus: " + this.bonus);
    }

    public abstract void calcularBonus();
}
