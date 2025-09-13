package academy.devdojo.maratonajava;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

// Crie variáveis para os campos descritos abaixo entre <> e imprima a seguinte mensagem:
// Eu <nome>, morando no endereço <endereço>, confirmo que recebi o salário de <salario>, na data <data>.
public class Aula03TiposPrimitivosExercicio {
    public static void main(String[] args) {
        String nome = "Eduardo Henrique Fabri";
        String endereco = "Rua Nabuco Donosor, 113";
        double salario = 3360d;
        LocalDate data = LocalDate.now();
        String dataFormatada = data.format(DateTimeFormatter.ofPattern("dd/MM/yyyy"));
        String relatorio = "Eu " + nome + ", morando no endereço " + endereco + " confirmo que recebi o salário de " + salario + " na data " + dataFormatada;

        System.out.println(relatorio);
    }
}
