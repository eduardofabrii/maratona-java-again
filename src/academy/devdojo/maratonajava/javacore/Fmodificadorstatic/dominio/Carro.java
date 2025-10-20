package academy.devdojo.maratonajava.javacore.Fmodificadorstatic.dominio;

public class Carro {
    private String nome;
    private double velocidadeMax;
    public static double velocidadeLim = 250;

    public Carro(String nome, double velocidadeMax) {
        this.nome = nome;
        this.velocidadeMax = velocidadeMax;
    }

    @Override
    public String toString() {
        return "Carro{" +
                "nome='" + nome + '\'' +
                ", velocidadeMax=" + velocidadeMax +
                ", velocidadeLim=" + velocidadeLim +
                '}';
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public double getVelocidadeMax() {
        return velocidadeMax;
    }

    public void setVelocidadeMax(double velocidadeMax) {
        this.velocidadeMax = velocidadeMax;
    }

    public double getVelocidadeLim() {
        return velocidadeLim;
    }

    public void setVelocidadeLim(double velocidadeLim) {
        this.velocidadeLim = velocidadeLim;
    }
}
