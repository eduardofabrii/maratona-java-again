package academy.devdojo.maratonajava.javacore.Bintroducaometodos.test;

import academy.devdojo.maratonajava.javacore.Bintroducaometodos.dominio.Funcionario;

public class FuncionarioTest01 {
    public static void main(String[] args) throws Exception {
        Funcionario funcionario = new Funcionario("Elvira", 28, 1000, 2000, 3123);

        funcionario.imprimir();
        System.out.println(funcionario.tirarMediaSalarial());
    }
}
