package academy.devdojo.maratonajava.javacore.Bintroducaometodos.test;

import academy.devdojo.maratonajava.javacore.Bintroducaometodos.dominio.Calculadora;

public class CalculadoraTest03 {
    public static void main(String[] args) {
        Calculadora calculadora = new Calculadora();

        int num1 = 12;
        int num2 = 55;

        calculadora.alterarDoisNumeros(num1, num2);

        System.out.println("Fora do metodo");
        System.out.println("num1: " + num1);
        System.out.println("num2: " + num2);
    }
}
