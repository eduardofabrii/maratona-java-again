package academy.devdojo.maratonajava;

public class Aula06EstruturasDeRepeticao02 {
    public static void main(String[] args) {
        // Imprimir todos os numeros pares de 0 ate 1.000.000

        for (int i = 0; i <= 1_000_000; i++) {
            if (i % 2 == 0) {
                System.out.println(i);
            }
        }
    }
}
