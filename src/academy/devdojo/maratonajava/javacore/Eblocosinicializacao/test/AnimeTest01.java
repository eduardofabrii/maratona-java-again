package academy.devdojo.maratonajava.javacore.Eblocosinicializacao.test;

import academy.devdojo.maratonajava.javacore.Eblocosinicializacao.dominio.Anime;

public class AnimeTest01 {
    public static void main(String[] args) {
        Anime anime1 = new Anime("One Piece");
        Anime anime2 = new Anime("One Piece");
        Anime anime3 = new Anime("One Piece");
        Anime anime4 = new Anime("One Piece");
        Anime anime5 = new Anime("One Piece");
        Anime anime6 = new Anime("One Piece");

        for (int ep : anime1.getEpisodios()) {
            System.out.print(ep + " ");
        }

    }
}