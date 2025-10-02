package academy.devdojo.maratonajava.introducao;

public class Aula06EstruturasDeRepeticao04 {
    public static void main(String[] args) {
        // Dado um valor de um carro, descubra em quantas vezes ele pode ser parcelado
        // Condicao valorParcela >= 1000

        float valorCarro = 35341f;
        float parcelaMinima = 1000f;

        for (int parcela = 1; parcela <= valorCarro; parcela++) {
            double valorParcela = valorCarro / parcela;
            if (valorParcela <= parcelaMinima) {
                break;
            }
            System.out.println("Parcela " + parcela + " | R$" + valorParcela);
        }
    }
}
