package academy.devdojo.maratonajava.javacore.Kenum.test;

import academy.devdojo.maratonajava.javacore.Kenum.dominio.Cliente;
import academy.devdojo.maratonajava.javacore.Kenum.dominio.TipoPessoa;

public class ClienteTest01 {
    public static void main(String[] args) {
        Cliente cliente1 = new Cliente("Samambaia", TipoPessoa.PJ);
        Cliente cliente2 = new Cliente("Juninho", TipoPessoa.PF, Cliente.TipoPagamento.CREDITO);
        System.out.println(cliente1);
        System.out.println(cliente2);
    }
}
