package academy.devdojo.maratonajava.javacore.Gassociacao.test;

import java.util.Scanner;

public class LeituraDoTecladoTest01 {
    public static void main(String[] args) {
        // Next le string mas só a primeira palavra
        Scanner sc = new Scanner(System.in);

        System.out.print("Escreve ai uma coisa: ");
        String palavraSolo = sc.next();
        System.out.println("Palavra solo: " + palavraSolo);

        System.out.println(" ");

        System.out.print("Digite um numero: ");
        double numero1 = sc.nextDouble();

        System.out.print("Digite outro numero: ");
        double numero2 = sc.nextDouble();
        System.out.println(numero1 * numero2);

        System.out.println(" ");

        System.out.println("Digite M ou F para sexo: ");
        char letra = sc.next().charAt(0);

        if (letra == 'M') {
            System.out.println("Homi");
        } else if (letra == 'F') {
            System.out.println("Muié");
        } else {
            System.out.println("CACHORRO");
        }


    }
}
