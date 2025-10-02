package academy.devdojo.maratonajava.javacore.Aintroducaoclasses.test;

import academy.devdojo.maratonajava.javacore.Aintroducaoclasses.dominio.Carro;

public class CarroTest01 {
    public static void main(String[] args) {
        Carro carro1 = new Carro("Porsche", "Cayenne", 2025);
        Carro carro2 = new Carro("Gol", "G3", 2007);

        // Variaveis do tipo reference podem referenciar outros objetos do mesmo tipo
        carro1 = carro2;

        System.out.println(carro1.toString());
        System.out.println(carro2.toString());
    }
}
