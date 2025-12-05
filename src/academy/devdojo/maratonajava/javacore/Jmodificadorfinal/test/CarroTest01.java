package academy.devdojo.maratonajava.javacore.Jmodificadorfinal.test;

import academy.devdojo.maratonajava.javacore.Jmodificadorfinal.dominio.Carro;
import academy.devdojo.maratonajava.javacore.Jmodificadorfinal.dominio.Comprador;
import academy.devdojo.maratonajava.javacore.Jmodificadorfinal.dominio.Ferrari;

public class CarroTest01 {
    public static void main(String[] args) {
        Carro carro1 = new Carro();
        Comprador comprador1 = new Comprador();
        System.out.println(Carro.VELOCIDADE_LIMITE);
        System.out.println(carro1.COMPRADOR);
        carro1.COMPRADOR.setNome("Bonifácio");
        System.out.println(carro1.COMPRADOR);
        Ferrari ferrari = new Ferrari();
        ferrari.setNome("Enzo");
        ferrari.imprimir();
    }
}   