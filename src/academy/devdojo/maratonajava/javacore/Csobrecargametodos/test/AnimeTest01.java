package academy.devdojo.maratonajava.javacore.Csobrecargametodos.test;

import academy.devdojo.maratonajava.javacore.Csobrecargametodos.dominio.Anime;

public class AnimeTest01 {
    public static void main(String[] args) {
        Anime anime1 = new Anime();
        Anime anime2 = new Anime();

        anime1.init("Akudama Drive", "TV", 12);
        anime2.init("Akudama Drive 2", "TV", 12, "Romance");

        System.out.println(anime1);
        System.out.println(anime2);
    }
}
