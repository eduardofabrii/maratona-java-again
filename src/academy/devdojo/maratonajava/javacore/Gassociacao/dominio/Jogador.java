package academy.devdojo.maratonajava.javacore.Gassociacao.dominio;

import java.lang.reflect.Array;

public class Jogador {
    private String nome;
    private Time time;

    @Override
    public String toString() {
        if (time != null) {
            return "Nome do jogador: " + nome + " - Time: " + time.getNome();
        }
        return "Nome do jogador: " + nome;
    }

    public Jogador(String nome) {
        this.nome = nome;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Time getTime() {
        return time;
    }

    public void setTime(Time time) {
        this.time = time;
    }
}
