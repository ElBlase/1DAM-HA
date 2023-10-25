import java.util.Scanner;

public class Matriz {
    public static void main(String[] args){


        double resultado;
        double valor [][];

        valor = new double[3][3];

        for(int i = 0;i < 3;i++){
            for(int j = 0;j < 3;j++){
                
              Scanner sc = new Scanner(System.in);
                System.out.println("Introduza el valor "+i+","+j);
                valor [i][j] = sc.nextDouble();

            }
        }
        resultado = (valor[0][0]*valor[1][1]*valor[2][2]+valor[0][1]*valor[1][2]*valor[2][0]+valor[1][0]*valor[2][1]*valor[0][2])
        -(valor[0][2]*valor[1][1]*valor[2][0]+valor[0][1]*valor[1][0]*valor[2][2]+valor[1][2]*valor[2][1]*valor[0][0]);

        System.out.println("El determinante es:"+resultado);
    }
}
