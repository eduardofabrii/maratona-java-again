package academy.devdojo.maratonajava.javacore.Hheranca.dominio;

public class Pessoa {
    protected String nome;
    protected String cpf;
    protected Endereco endereco;
    static {
        System.out.println("Dentro do bloco de inicialização static de Pessoa");
    }
    {
        System.out.println("Dentro do bloco de inicialização de Pessoa 1");
    }
    {
        System.out.println("Dentro do bloco de inicialização de Pessoa 2");
    }

    public Pessoa() {}

    public Pessoa(String nome) {
        System.out.println("Dentro do construtor de Pessoa");
        this.nome = nome;
    }

    public Pessoa(String nome, String cpf) {
        this(nome);
    }

    public void imprimir() {
        System.out.println("Nome: " + this.nome + " CPF: " + this.cpf + " Endereço: " + this.endereco.getRua() + " - " + this.endereco.getRua());
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public Endereco getEndereco() {
        return endereco;
    }

    public void setEndereco(Endereco endereco) {
        this.endereco = endereco;
    }
}
