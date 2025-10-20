package academy.devdojo.maratonajava.javacore.Fmodificadorstatic.test;

import academy.devdojo.maratonajava.javacore.Fmodificadorstatic.dominio.Carro;

public class CarroTest01 {
    public static void main(String[] args) {
        Carro c1 = new Carro("Bmw", 280);
        Carro c2 = new Carro("Mercedes Benz", 285);
        Carro c3 = new Carro("Audi", 290);

        Carro.setVelocidadeLimite(150);
//        c1.setVelocidadeLim(300); // se mudar um, muda todos pq pertence a classe

        System.out.println(c1);
        System.out.println(c2);
        System.out.println(c3);
    }
}
