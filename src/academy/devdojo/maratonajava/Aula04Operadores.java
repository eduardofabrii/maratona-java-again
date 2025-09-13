package academy.devdojo.maratonajava;

public class Aula04Operadores {
    public static void main(String[] args) {
        //   + - / *
        int numero1 = 10;
        int numero2 = 20;

        System.out.println("+ : " + (numero1 + numero2));
        System.out.println("- : " + (numero1 - numero2));
        System.out.println("/ : " + (numero1 / numero2));
        System.out.println("* : " + (numero1 * numero2));

        // %
        int resto = 20 % 2;
        System.out.println("Resto: " + resto);

        // < > >= <= != ==
        boolean isDezMaiorQueVinte = 10 > 20;
        boolean isDezMenorQueVinte = 10 < 20;
        boolean isDezIgualAVinte = 10 == 20;
        boolean isDezIgualDez = 10 == 20;
        boolean isDezDiferenteDeVinte = 10 != 20;

        System.out.println("Dez maior que vinte: " + isDezMaiorQueVinte);
        System.out.println("Dez menor que vinte: " + isDezMenorQueVinte);
        System.out.println("Dez igual a vinte: " + isDezIgualAVinte);
        System.out.println("Dez igual a dez: " + isDezIgualDez);
        System.out.println("Dez diferente de vinte: " + isDezDiferenteDeVinte);
    }
}
