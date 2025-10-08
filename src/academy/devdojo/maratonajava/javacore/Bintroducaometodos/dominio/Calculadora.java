package academy.devdojo.maratonajava.javacore.Bintroducaometodos.dominio;

public class Calculadora {

    public void somar(int num1, int num2) {
        System.out.println(num1 + num2);
    }

    public void subtrair(int num1, int num2) {
        System.out.println(num1 - num2);
    }

    public void multiplicar(int num1, int num2) {
        System.out.println(num1 * num2);
    }

    public double dividir(double num1, double num2) {
        if (num2 == 0) {
            return 0;
        }
        return num1 / num2;
    }

    public void dividirAlternativo(double num1 , double num2) {
        if (num2 == 0) {
            System.out.println("Nao existe divisao por 0");
            return;
        }
        System.out.println(num1 / num2);
    }

    public void alterarDoisNumeros(int numero1, int numero2) {
        numero1 = 99;
        numero2 = 33;
        System.out.println("Dentro do altera dois numeros");
        System.out.println("num1: " + numero1);
        System.out.println("num2: " + numero2);
    }
}

