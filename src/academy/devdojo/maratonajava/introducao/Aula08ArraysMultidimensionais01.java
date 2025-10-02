package academy.devdojo.maratonajava.introducao;

public class Aula08ArraysMultidimensionais01 {
    public static void main(String[] args) {
        int[][] dias = new int[3][3];

        dias[0][0] = 23;
        dias[0][1] = 31;
        dias[0][2] = 12;

//        for (int i = 0; i < dias.length; i++) {
//            for (int j = 0; j < dias[i].length; j++) {
//                dias[i][j] += i;
//            }
//        }

        for (int[] i:dias) {
            for (int j:i) {
                System.out.println(j);
            }
        }
    }
}
