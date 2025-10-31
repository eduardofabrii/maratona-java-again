package academy.devdojo.maratonajava.javacore.Gassociacao.test;

import academy.devdojo.maratonajava.javacore.Gassociacao.dominio.Jogador;
import academy.devdojo.maratonajava.javacore.Gassociacao.dominio.Time;

public class JogadorTest02 {
    public static void main(String[] args) {
        Time santos = new Time("Santos");

        Jogador jogador1 = new Jogador("Neymar Jr");
        Jogador jogador2 = new Jogador("Lamine Yamal");
        Jogador jogador3 = new Jogador("Pelé");

        jogador1.setTime(santos);

        Jogador[] jogadores = new Jogador[]{jogador1, jogador2, jogador3};

        for (Jogador jogador : jogadores) {
            System.out.println(jogador);
        }
    }
}
