package academy.devdojo.maratonajava.javacore.Dconstrutores.test;


import academy.devdojo.maratonajava.javacore.Dconstrutores.dominio.Anime;

public class AnimeTest01 {
    public static void main(String[] args) {
        Anime anime1 = new Anime("Akudama Drive", "TV", "Disney");
        Anime anime2 = new Anime();

        System.out.println(anime1);
        System.out.println(anime2);
    }
}