import java.util.Scanner;

import static java.lang.Character.toLowerCase;

public class PiedraPapelTijera {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        char seleccion, seleccionMaquina = 'a';
        int randomMaquina;

        System.out.print("Piedra, papel o tijera? (p/a/t): ");
        seleccion = sc.next().charAt(0);
        seleccion = toLowerCase(seleccion);

        randomMaquina = (int) (Math.random() * 3);

        switch (randomMaquina) {
            case 0:
                seleccionMaquina = 'p';
                System.out.println("El ordenador ha elegido: Piedra");
                break;
            case 1:
                seleccionMaquina = 'a';
                System.out.println("El ordenador ha elegido: Papel");
                break;
            default:
                seleccionMaquina = 't';
                System.out.println("El ordenador ha elegido: Tijeras");
                break;
        }
        Comparacion(seleccionMaquina, seleccion);
    }

    public static void Comparacion(char maquina, char seleccion) {

        if (maquina == 't' && seleccion == 'a') {
            System.out.println("Has perdido!!");

        } else if (maquina == 'p' && seleccion == 't') {
            System.out.println("Has perdido!!");

        } else if (maquina == 'a' && seleccion == 'p') {
            System.out.println("Has perdido!!");

        } else if (seleccion == 't' && maquina == 'a') {
            System.out.println("Has ganado!!");

        } else if (seleccion == 'p' && maquina == 't') {
            System.out.println("Has ganado!!");

        } else if (seleccion == 'a' && maquina == 'p') {
            System.out.println("Has ganado!!");

        } else System.out.println("Empate");

    }
}
