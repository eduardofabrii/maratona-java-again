package academy.devdojo.maratonajava;

public class Aula07Arrays02 {
    public static void main(String[] args) {
        // byte, short, int, long, float e double retornam por padrao 0
        // char retornam por padrao '\u0000' que na verdade é o ' '
        // String e reference types retornam null

        String[] nomes = new String[3];
        nomes[0] = "Albert Eistein";
        nomes[1] = "Goku";
        nomes[2] = "Tamandua Bandeira";

        for (int i = 0; i < nomes.length; i++) {
            System.out.println(nomes[i]);
        }

        // A referencia antiga morre e a partir de agora temos outra
        // O Garbage Collector limpa a referencia antiga
        nomes = new String[8];

        for (int i = 0; i < nomes.length; i++) {
            System.out.println(nomes[i]);
        }
    }
}
