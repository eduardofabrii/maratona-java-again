package academy.devdojo.maratonajava.javacore.Hheranca.dominio;

public class Funcionario extends Pessoa {
    private double salario;
    static {
        System.out.println("Dentro do bloco de inicialização static de Funcionario");
    }
    {
        System.out.println("Dentro do bloco de inicialização de Funcionario 1");
    }
    {
        System.out.println("Dentro do bloco de inicialização de Funcionario 2");
    }


    @Override
    public String toString() {
        return "Funcionario{" +
                "salario=" + salario +
                '}';
    }

    public Funcionario() {}

    public Funcionario(String nome) {
        super(nome);
        System.out.println("Dentro do construtor de funcionário");
    }

    public Funcionario(String nome, String cpf, double salario) {
        super(nome, cpf);
        this.salario = salario;
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
