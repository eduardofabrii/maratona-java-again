package academy.devdojo.maratonajava.javacore.Hheranca.dominio;

public class Funcionario extends Pessoa {
    private double salario;

    @Override
    public String toString() {
        return "Funcionario{" +
                "salario=" + salario +
                '}';
    }

    @Override
    public void imprimir() {
        super.imprimir();
        System.out.println("Salário: " + this.salario);
    }

    public void relatorioPagamento() {
        System.out.println("Eu " + this.nome + " estou realizando o pagamento de R$3120,12");
    }

    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }
}
