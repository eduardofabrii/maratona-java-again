package academy.devdojo.maratonajava.introducao;

public class Aula05EstruturasCondicionais02 {
    public static void main(String[] args) {
        // idade < 15 - Infantil
        // idade >=  15 && idade < 18 - Juvenil
        // idade >= 18 - Adulto

        int idade = 18;
        String categoria;

        if (idade < 15) {
            categoria = "Infantil";
        } else if (idade >= 15 && idade < 18) {
            categoria = "Juvenil";
        } else {
            categoria = "Adulto";
        }

        System.out.println(categoria);
    }
}
