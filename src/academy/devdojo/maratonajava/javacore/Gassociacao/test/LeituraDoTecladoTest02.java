package academy.devdojo.maratonajava.javacore.Gassociacao.test;

import java.sql.SQLOutput;
import java.util.Scanner;

public class LeituraDoTecladoTest02 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("O GRANDE SOFTWARE DE PREVISÃO DO FUTURO\n");

        System.out.print("Digite sua pergunta e eu responderei 'SIM' ou 'NAO': ");
        String pergunta = sc.nextLine();

        if (pergunta.startsWith(" ")) {
            System.out.println("SIM");
        } else {
            System.out.println("NAO");
        }
    }
}
