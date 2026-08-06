package academy.devdojo.maratonajava.javacore.Npolimorfismo.test;

import academy.devdojo.maratonajava.javacore.Npolimorfismo.dominio.Computador;
import academy.devdojo.maratonajava.javacore.Npolimorfismo.dominio.Produto;
import academy.devdojo.maratonajava.javacore.Npolimorfismo.dominio.Televisao;
import academy.devdojo.maratonajava.javacore.Npolimorfismo.dominio.Tomate;
import academy.devdojo.maratonajava.javacore.Npolimorfismo.servico.CalculadoraImposto;

public class ProdutoTest03 {
    public static void main(String[] args) {
        Produto produto1 = new Computador("Computador", 3000);
        Produto produto2 = new Tomate("Tomate Vermelho", 0.19);
        CalculadoraImposto.calcularImposto(produto1);
        Televisao televisao1 = new Televisao("Samsung 15\"", 3500);
        CalculadoraImposto.calcularImposto(televisao1);
    }
}
