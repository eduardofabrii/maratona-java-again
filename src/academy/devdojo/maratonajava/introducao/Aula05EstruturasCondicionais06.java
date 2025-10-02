package academy.devdojo.maratonajava.introducao;

public class Aula05EstruturasCondicionais06 {
    public static void main(String[] args) {
        // Dado os valores de 1 a 7, imprima se é dia util ou final de semana
        // Considerando 1 como domingo

        int dia = 2;
        boolean isFinalDeSemana = false;

        switch (dia) {
            case 1, 7 -> isFinalDeSemana = true;
            case 2, 3, 4, 5, 6 -> isFinalDeSemana = false;
            default -> System.out.println("Opção inválida");
        }

        if (isFinalDeSemana) {
            System.out.println("Final de semana");
        } else {
            System.out.println("Dia útil");
        }
    }
}
