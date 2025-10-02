package academy.devdojo.maratonajava.javacore.Aintroducaoclasses.test;

import academy.devdojo.maratonajava.javacore.Aintroducaoclasses.dominio.Professor;

public class ProfessorTest01 {
    public static void main(String[] args) {
        // Alta coesão é essencial e acontece quando cada classe serve a um propósito específico e nao se misturam
        Professor professor = new Professor();
        professor.setNome("Paradise");
        professor.setSexo('M');
        professor.setIdade(21);

        System.out.println(professor.toString());
    }
}
