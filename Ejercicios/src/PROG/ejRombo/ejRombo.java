import java.util.Scanner;

public class ejRombo {

    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);
        int filaCentral;

        System.out.println("Introduzca la fila central del rombo: ");
        filaCentral = sc.nextInt();

        for(int i = 1; i <= filaCentral; i++){
            for(int j = 1; j <= filaCentral - i; j++){
                System.out.print(" ");
            }
            for (int k = 1 ; k <=  2 * i -1 ; k++){
                System.out.print("#");
            }
            System.out.println();
        }

        for (int i = 1; i <= filaCentral; i++){
            for (int j = 1; j <= filaCentral - i; j--){

            }
        }

    }
}
