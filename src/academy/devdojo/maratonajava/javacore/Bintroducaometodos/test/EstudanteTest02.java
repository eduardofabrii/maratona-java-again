package academy.devdojo.maratonajava.javacore.Bintroducaometodos.test;

import academy.devdojo.maratonajava.javacore.Bintroducaometodos.dominio.Estudante;
import academy.devdojo.maratonajava.javacore.Bintroducaometodos.dominio.ImpressoraEstudante;

public class EstudanteTest02 {
    public static void main(String[] args) {
        Estudante estudante1 = new Estudante();
        Estudante estudante2 = new Estudante();

        estudante1.nome = "Sabugo";
        estudante1.idade = 16;
        estudante1.sexo = 'M';

        estudante2.nome = "Cleo Cleopoldina";
        estudante2.idade = 53;
        estudante2.sexo = 'F';

        estudante1.imprime();
        System.out.println("-------");
        estudante2.imprime();
    }
}
