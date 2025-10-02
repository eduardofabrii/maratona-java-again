package academy.devdojo.maratonajava.javacore.Aintroducaoclasses.test;

import academy.devdojo.maratonajava.javacore.Aintroducaoclasses.dominio.Estudante;

public class EstudanteTest02 {
    public static void main(String[] args) {
        Estudante estudante = new Estudante();
        System.out.println(estudante.getIdade());
        System.out.println(estudante.getSexo());
        System.out.println(estudante.getNome());

        System.out.println("--------");

        Estudante estudante2 = new Estudante();
        estudante2.setNome("Luffy");
        System.out.println(estudante2.getIdade());
        System.out.println(estudante2.getSexo());
        System.out.println(estudante2.getNome());
    }
}
