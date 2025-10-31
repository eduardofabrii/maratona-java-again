package academy.devdojo.maratonajava.javacore.Gassociacao.test;

import academy.devdojo.maratonajava.javacore.Gassociacao.dominio.Estudante;
import academy.devdojo.maratonajava.javacore.Gassociacao.dominio.Local;
import academy.devdojo.maratonajava.javacore.Gassociacao.dominio.Professor;
import academy.devdojo.maratonajava.javacore.Gassociacao.dominio.Seminario;

public class AssociacaoTest01 {
    public static void main(String[] args) {
        Local local1 = new Local("Rua Alianz Parq", "A", "311");
        Estudante estudante1 = new Estudante("Eduardo", 19);
        Estudante estudante2 = new Estudante("José", 21);
        Professor professor1 = new Professor("Paradise", "Java");
        Seminario seminario1 = new Seminario("ACH-001 - Palmeiras campeão", local1);
        Estudante[] estudantes = {estudante1, estudante2};
        Seminario[] seminarios = {seminario1};
        estudante1.setSeminario(seminario1);
        estudante2.setSeminario(seminario1);
        seminario1.setEstudantes(estudantes);
        professor1.setSeminarios(seminarios);

        System.out.println(seminario1);
    }
}
