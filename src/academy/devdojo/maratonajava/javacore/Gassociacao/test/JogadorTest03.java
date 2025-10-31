package academy.devdojo.maratonajava.javacore.Gassociacao.test;

import academy.devdojo.maratonajava.javacore.Gassociacao.dominio.Jogador;
import academy.devdojo.maratonajava.javacore.Gassociacao.dominio.Time;

public class JogadorTest03 {
    public static void main(String[] args) {
        Jogador jogador1 = new Jogador("Cafu");
        Jogador jogador2 = new Jogador("Romário");
        Time time1 = new Time("Seleção Brasileira");
        Jogador[] jogadores = {jogador1, jogador2};

        jogador1.setTime(time1);
        jogador2.setTime(time1);
        time1.setJogadores(jogadores);

        System.out.println("Jogador");
        System.out.println(jogador1);

        System.out.println(" ");

        System.out.println("Time");
        System.out.println(time1);
    }
}
