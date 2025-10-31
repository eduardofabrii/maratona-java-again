package academy.devdojo.maratonajava.javacore.Gassociacao.test;

import academy.devdojo.maratonajava.javacore.Gassociacao.dominio.Jogador;

public class JogadorTest01 {
    public static void main(String[] args) {
        Jogador jogador1 = new Jogador("Neymar Jr");
        Jogador jogador2 = new Jogador("Lamine Yamal");
        Jogador jogador3 = new Jogador("Pelé");

        Jogador[] jogadores = new Jogador[]{jogador1, jogador2, jogador3};

        for (Jogador jogador : jogadores) {
            System.out.println(jogador);
        }
    }
}
