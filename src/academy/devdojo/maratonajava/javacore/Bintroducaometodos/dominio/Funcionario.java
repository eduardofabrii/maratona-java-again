package academy.devdojo.maratonajava.javacore.Bintroducaometodos.dominio;

import java.util.Arrays;

public class Funcionario {
    private String nome;
    private int idade;
    private double[] salarios;

    public Funcionario(String nome, int idade, double... salarios) {
        this.nome = nome;
        this.idade = idade;

        if (salarios.length > 3) {
            throw new IllegalArgumentException("Só aceita 3 salarios meu irmao!!!");
        } else {
            this.salarios = salarios;
        }
    }

    public void imprimir() {
        System.out.println("Nome: " + this.nome + " | Idade: " + this.idade + " | Salários: " + Arrays.toString(this.salarios));
    }

    public double tirarMediaSalarial() {
        double soma = 0;

        for (double salario : salarios) {
            soma += salario;
        }

        return soma / salarios.length;
    }
}
