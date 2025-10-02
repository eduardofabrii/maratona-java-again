package academy.devdojo.maratonajava;

public class Aula08ArraysMultidimensionais02 {
    public static void main(String[] args) {
        int[][] array = new int[3][];

        array[0] = new int[2];
        array[1] = new int[]{1, 2, 3};
        array[2] = new int[4];

        int[][] array2 = {{0, 41, 23}, {1,2,5}, {1,25,3}};
        for (int[] base:array2) {
            System.out.println("---");
            for (int i:base) {
                System.out.print(i + " ");
            }
        }

        System.out.println(" ");

        for (int[] base:array) {
            System.out.println("---");
            for (int num:base) {
                System.out.print(num + " ");
            }
        }
    }
}
