package academy.devdojo.maratonajava;

public class Aula06EstruturasDeRepeticao05 {
    public static void main(String[] args) {
        // Dado um valor de um carro, descubra em quantas vezes ele pode ser parcelado
        // Condicao valorParcela >= 1000

        float valorCarro = 35341f;

        for (int parcela = (int) valorCarro; parcela >= 1; parcela--) {
            double valorParcela = valorCarro / parcela;
            if (valorParcela < 1000) {
                continue;
            }
            System.out.println("Parcela " + parcela + " | R$" + valorParcela);
        }
    }
}
