import java.util.Arrays;

public class sumatorioMatrices {

    public static void main(String[] args) {
        int[][] matriz = new int[5][6];

        for (int i = 0; i < matriz.length - 1; i++) {
            for (int j = 0; j < matriz[i].length - 1; j++) {
                matriz[i][j] = (int) Math.round(Math.random() * 10);
            }
        }
        System.out.println(Arrays.deepToString(matriz));
        sumatorio(matriz);
    }

    //Sumatorio
    public static void sumatorio(int[][] matriz) {
        int sumaTotal = 0;
        //Suma de filas
        for (int j = 0; j < matriz.length; j++) {
            for (int i = 0; i < matriz[j].length - 1; i++) {
                matriz[j][matriz.length] += matriz[j][i];
                matriz[matriz.length-1][matriz.length-1] +=matriz[j][matriz.length];
            }
        }
        System.out.println(Arrays.deepToString(matriz));
        //Suma columnas
        for (int i = 0; i < matriz[0].length - 1; i++) {
            for (int j = 0; j < matriz.length - 1; j++) {
                matriz[matriz.length - 1][i] += matriz[j][i];
            }
        }
        System.out.println(Arrays.deepToString(matriz));

        //Imprimir la matriz
        for(int i = 0; i < matriz.length; i++ ){
            for (int j = 0; j < matriz[i].length; j++){
                System.out.print("|");
                System.out.print(matriz[i][j]);
            }
            System.out.println();
        }
    }
}
