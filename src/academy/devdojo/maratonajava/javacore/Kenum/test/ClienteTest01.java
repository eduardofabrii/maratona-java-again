package academy.devdojo.maratonajava.javacore.Kenum.test;

import academy.devdojo.maratonajava.javacore.Kenum.dominio.Cliente;
import academy.devdojo.maratonajava.javacore.Kenum.dominio.TipoPagamento;
import academy.devdojo.maratonajava.javacore.Kenum.dominio.TipoPessoa;

public class ClienteTest01 {
    public static void main(String[] args) {
        Cliente cliente1 = new Cliente("Samambaia", TipoPessoa.PJ);
        Cliente cliente2 = new Cliente("Juninho", TipoPessoa.PF, TipoPagamento.CREDITO);
        System.out.println(cliente1);
        System.out.println(cliente2);
        System.out.println(TipoPagamento.DEBITO.calcularDesconto(100));
        System.out.println(TipoPagamento.CREDITO.calcularDesconto(100));
//        TipoPessoa tipoCliente1 = TipoPessoa.valueOf("Pessoa Jurídica");
        TipoPessoa tipoCliente2 = TipoPessoa.tipoPessoaPorNomeRelatorio("Pessoa Jurídica");
//        System.out.println(tipoCliente1);
        System.out.println(tipoCliente2);
    }
}
