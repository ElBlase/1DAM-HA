import java.util.Scanner;

public class ejFiguraGeo {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int lado;

        System.out.println("Introduzca la longitud del lado: ");
        lado = sc.nextInt();

        for (int i = 1; i <= lado; i++) {

            for (int j = 1; j <= lado ; j++) {

                System.out.print(" ");

            }
            for (int k = 1; k <= i; k++) {

                System.out.print("*");

            }
            System.out.println();
        }
    }
}
