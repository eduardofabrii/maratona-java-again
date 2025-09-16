package academy.devdojo.maratonajava;

public class Aula05EstruturasCondicionais01 {
    public static void main(String[] args) {
        int idade = 15;
        boolean isAutorizadoComprarBebida = idade >= 18;

        if (isAutorizadoComprarBebida) {
            System.out.println("Pode comprar uma cerveja");
        } else {
            System.out.println("Nao pode comprar cerveja");
        }

        // !
        if (!isAutorizadoComprarBebida) {
            System.out.println("Nao pode comprar cerveja");
        }

        System.out.println("fora do if");
    }
}
