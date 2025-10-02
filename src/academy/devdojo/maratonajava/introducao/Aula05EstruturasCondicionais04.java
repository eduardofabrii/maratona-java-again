package academy.devdojo.maratonajava.introducao;

public class Aula05EstruturasCondicionais04 {
    public static void main(String[] args) {
        double annualSalary = 70000;
        double tax = 0;
        double taxTotal = 0;

        if (annualSalary <= 34712) {
            tax = 0.0970f;
            taxTotal = annualSalary * tax; // ou passa taxa como 9.70 e faz 9.70 / 100
        } else if (annualSalary >= 34713 && annualSalary <= 68507) {
            tax = 0.3735f;
            taxTotal = annualSalary * tax;
        } else {
            tax = 0.4950f;
            taxTotal = annualSalary * tax;
        }

        System.out.println("O desconto sobre o salário de €" + annualSalary + " é de €" + String.format("%.2f", taxTotal));
    }
}
