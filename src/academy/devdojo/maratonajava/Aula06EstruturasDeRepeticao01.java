package academy.devdojo.maratonajava;

public class Aula06EstruturasDeRepeticao01 {
    public static void main(String[] args) {
        // while, do while e for
        int count = 0;

        while (count < 10) {
            System.out.println(++count);
        }

        count = 0;
        do {
            System.out.println("Executa " + ++count);
        } while (count < 10);

        for (int i = 0; i < 10; i++) {
            System.out.println(i);
        }
    }
}
