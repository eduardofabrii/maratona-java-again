package academy.devdojo.maratonajava.javacore.Aintroducaoclasses.test;

import academy.devdojo.maratonajava.javacore.Aintroducaoclasses.dominio.Estudante;

public class EstudanteTest01 {
    public static void main(String[] args) {
        // Var referencia   - Objeto de referencia
        Estudante estudante = new Estudante();
        estudante.setNome("Ana Lucia");
        estudante.setIdade(21);
        estudante.setSexo('F');

        System.out.println(estudante.getNome());
        System.out.println(estudante.getIdade());
        System.out.println(estudante.getSexo());
    }
}
