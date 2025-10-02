package academy.devdojo.maratonajava.introducao;

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

        // AND (&&) OR (||) NOT (!)
        int idadeBase = 30;
        double salarioBase = 10000;
        int idade = 32;
        double salario = 15000d;
        boolean isDentroDaLeiMaiorQueTrinta = idade >= idadeBase && salario >= salarioBase;
        boolean isDentroDaLeiMenorQueTrinta = idade <=  idadeBase && salario <= salarioBase;

        System.out.println("Está dentro da lei maior que " + idadeBase + " anos e salario maior que R$" + salarioBase + ": " + isDentroDaLeiMaiorQueTrinta);
        System.out.println("Está dentro da lei menor que " + idadeBase + " anos e salario menor de R$" + salarioBase + ": " + isDentroDaLeiMenorQueTrinta);

        double valorTotalContaCorrente = 200;
        double valorTotalContaPoupanca = 10000;
        float valorPlaystation = 5000;

        boolean isPlaystation5Compravel = valorTotalContaCorrente > valorPlaystation || valorTotalContaPoupanca > valorPlaystation;
        System.out.println("Playstation é compravel: " + isPlaystation5Compravel);

        // = += -= *= /= %=
        double bonus = 1000;
        System.out.println("Bonus 1: " + bonus);
        bonus = 2000;
        System.out.println("Bonus 2: " + bonus);
        bonus += 200;
        System.out.println("Bonus 3: " + bonus);
        bonus -= 200;
        System.out.println("Bonus 4: " + bonus);
        bonus /= 2;
        System.out.println("Bonus 5: " + bonus);
        bonus %= 3;
        System.out.println("Bonus 5: " + bonus);

        //
        int contador = 0;
        contador += 1;
        System.out.println(contador);
        contador++;
        System.out.println(contador);
        contador--;
        System.out.println(contador);

        int contador2 = 0;
        int contador3 = 0;
        System.out.println(contador2++);
        System.out.println(++contador3);
    }
}
