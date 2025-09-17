package academy.devdojo.maratonajava;

public class Aula05EstruturasCondicionais03 {
    public static void main(String[] args) {
        float salario = 3000.5f;
        String msgDoar = "Eu vou doar 500 reais para o Eduardo";
        String msgDaoDoar = "Ainda não tenho condiçoes";
        String resultado;

        resultado = salario > 5000 ? msgDoar : msgDaoDoar;
        boolean possoDoar = salario > 5000 ? true : false;
        System.out.println(resultado);
        System.out.println(possoDoar);

    }
}
