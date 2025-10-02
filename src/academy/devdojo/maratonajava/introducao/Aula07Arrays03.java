package academy.devdojo.maratonajava.introducao;

public class Aula07Arrays03 {
    public static void main(String[] args) {
        int[] numeros1 = {1,2,23,4,5};
        int[] numeros2 = new int[]{6,4,1,3,5};
        int[] numeros3 = new int[3];

        for (int i = 0; i < numeros1.length; i++) {
            System.out.println(numeros1[i]);
        }

        System.out.println(" ");

        for (int i:numeros2) {
            System.out.println(i);
        }
    }
}
