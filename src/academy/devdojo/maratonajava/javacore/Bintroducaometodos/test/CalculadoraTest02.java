package academy.devdojo.maratonajava.javacore.Bintroducaometodos.test;

import academy.devdojo.maratonajava.javacore.Bintroducaometodos.dominio.Calculadora;

public class CalculadoraTest02 {
    public static void main(String[] args) {
        Calculadora calculadora = new Calculadora();
        calculadora.multiplicar(2, 3);

        System.out.println(calculadora.dividir(5, 2));
        calculadora.dividirAlternativo(5, 0);
    }

}
