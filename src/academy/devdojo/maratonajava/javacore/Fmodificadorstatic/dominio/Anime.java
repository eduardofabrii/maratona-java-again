package academy.devdojo.maratonajava.javacore.Fmodificadorstatic.dominio;

import java.util.Arrays;

public class Anime {
    // 0 passo - bloco de inicializacao eh carregado quando a JVM carregar a classe
    // 1 passo - aloca memoria pro objeto
    // 2 passo - cada atributo da classe eh criado e inicializado com os valores default, ou o que for setado
    // 3 passo - bloco de inicializacao eh executado
    // 4 passo - construtor eh inicializado

    private String nome;
    private static int[] episodios;
    static {
        episodios = new int[100];
        for (int i = 0; i < episodios.length; i++) {
            episodios[i] = i + 1;
        }
        System.out.println(Arrays.toString(episodios));
    }

    public Anime() {}

    public Anime(String nome) {
        this.nome = nome;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int[] getEpisodios() {
        return episodios;
    }

    public void setEpisodios(int[] episodios) {
        this.episodios = episodios;
    }
}
