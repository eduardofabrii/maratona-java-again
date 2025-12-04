package academy.devdojo.maratonajava.javacore.Hheranca.test;

import academy.devdojo.maratonajava.javacore.Hheranca.dominio.Endereco;
import academy.devdojo.maratonajava.javacore.Hheranca.dominio.Funcionario;
import academy.devdojo.maratonajava.javacore.Hheranca.dominio.Pessoa;

public class HerancaTest01 {
    public static void main(String[] args) {
        Endereco endereco = new Endereco();
        endereco.setCep("83130-600");
        endereco.setRua("Rua das Laranjeiras");

        Pessoa pessoa = new Pessoa();
        pessoa.setNome("Toyohisa");
        pessoa.setEndereco(endereco);
        pessoa.setCpf("12345678900");

        System.out.println(pessoa);

        Funcionario funcionario = new Funcionario();
        funcionario.setNome("Joao Paulo");
        funcionario.setCpf("12312312333");
        funcionario.setNome("Joao Paulo");
        funcionario.setEndereco(endereco);

        System.out.println(funcionario);
    }
}
