package academy.devdojo.maratonajava.javacore.Gassociacao.dominio;

import java.util.Arrays;

public class Seminario {
    private String titulo;
    private Local local;
    private Estudante[] estudantes;

    @Override
    public String toString() {
        return "Seminario{" +
                "titulo='" + titulo + '\'' +
                ", local=" + local +
                ", estudantes=" + Arrays.toString(estudantes) +
                '}';
    }

    public Seminario(String titulo, Local local) {
        this.titulo = titulo;
        this.local = local;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public Local getLocal() {
        return local;
    }

    public void setLocal(Local local) {
        this.local = local;
    }

    public Estudante[] getEstudantes() {
        return estudantes;
    }

    public void setEstudantes(Estudante[] estudantes) {
        this.estudantes = estudantes;
    }
}
