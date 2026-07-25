package academy.devdojo.maratonajava.javacore.Lclassesabstratas.test;

import academy.devdojo.maratonajava.javacore.Lclassesabstratas.dominio.Desenvolvedor;
import academy.devdojo.maratonajava.javacore.Lclassesabstratas.dominio.Gerente;

public class FuncionarioTest01 {
    public static void main(String[] args) {
        Desenvolvedor funcionario1 = new Desenvolvedor("João", 2000);
        System.out.println(funcionario1);

        Gerente gerente1 = new Gerente("Maria", 5000);
        System.out.println(gerente1);
    }
}
