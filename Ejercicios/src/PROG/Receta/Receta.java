import java.util.Scanner;


public class Receta {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int zanahoria;
        double coliflor, cebolla, pollo, pinyones, pasas, caldo, curry;

        System.out.println("Ingrese el numero de personas para la receta: ");
        int persona = sc.nextInt();

        if (persona < 1) {
            persona = 1;
        }

        coliflor = Math.round((600 * (persona / 6.0)) * 100.0) / 100.0;
        pollo = Math.round((500 * (persona / 6.0)) * 100.0) / 100.0;
        caldo = Math.round((220 * (persona / 6.0)) * 100.0) / 100.0;
        cebolla = Math.round((1 * (persona / 6.0)) * 100.0) / 100.0;
        zanahoria = 3 * (persona / 6);
        pinyones = Math.round((25 * (persona / 6.0)) * 100.0) / 100.0;
        pasas = Math.round((75 * (persona / 6.0)) * 100.0) / 100.0;
        curry = Math.round((1.5 * (persona / 6.0)) * 100.0) / 100.0;

        if (cebolla < 0.5) {
            cebolla = 0.5;
        }

        if (zanahoria < 1) {
            zanahoria = 1;
        }

        if (pinyones < 10) {
            pinyones = 10;
        }

        if (pasas < 20) {
            pasas = 20;
        }

        if (curry < 0.5) {
            curry = 0.5;
        }

        System.out.println("La receta para " + persona + " personas consta de :\n"
                + coliflor + " gramos de coliflor\n"
                + pollo + " gramos de pollo\n"
                + caldo + " mililitros de caldo\n"
                + cebolla + " cebollas\n"
                + zanahoria + " zanahorias\n"
                + pinyones + " gramos de piñones\n"
                + pasas + " gramos de pasas\n"
                + curry + " cucharaditas de curry");
    }
}
