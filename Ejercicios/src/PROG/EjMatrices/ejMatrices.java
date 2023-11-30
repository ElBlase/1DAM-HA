import java.util.Arrays;

public class ejMatrices {

    public static void main(String[] args) {
        int[][] matriz = {{1, 2, 3, 4},
                {5, 6, 7, 8,},
                {9, 10, 11, 12}};
        int[][] matrizEqual = {{1, 2, 3, 4},
                {5, 6, 7, 8,},
                {9, 10, 11, 12}};

        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[i].length; j++) {
                System.out.print(matriz[i][j]);
            }
            System.out.println();
        }
        System.out.println("\n-----------------------------");
        System.out.println(Arrays.deepToString(matriz));

        boolean sonIgaules = Arrays.deepEquals(matriz, matrizEqual);
        System.out.println("------------------");

        System.out.println(sonIgaules);
    }
}

