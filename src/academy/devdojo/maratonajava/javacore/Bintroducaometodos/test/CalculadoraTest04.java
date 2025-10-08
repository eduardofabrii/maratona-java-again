package academy.devdojo.maratonajava.javacore.Bintroducaometodos.test;

import academy.devdojo.maratonajava.javacore.Bintroducaometodos.dominio.Calculadora;

public class CalculadoraTest04 {
    public static void main(String[] args) {
        Calculadora calculadora = new Calculadora();
        int[] array = new int[8];
        array[0] = 2;
        array[2] = 2;
        array[7] = 4;
        array[3] = 7;

        calculadora.somarArray(array);
        calculadora.somarVarArgs(2,2,4,7,7,8,8,9);
    }
}
