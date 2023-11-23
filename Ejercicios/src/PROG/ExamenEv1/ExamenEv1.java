import java.util.Scanner;

public class ExamenEv1 {

    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {

        AveriguarNumPrimos();
        //CalculadoraEntradasCine();
    }

    //Ejercicio 1 (primos)
    public static void AveriguarNumPrimos() {

        int numPedido;
        String palabraSalir = "";
        String imprimir; //Oracion que sale por pantalla
        boolean seSale = false;

        while (!seSale) {

            System.out.println("Introduzca el numero deseado: ");
            numPedido = sc.nextInt();

            if (numPedido % 2 == 0 && numPedido != 2) {
                imprimir = "El numero no es primo";

            } else if (numPedido % 3 == 0 && numPedido != 3) {
                imprimir = "El numero no es primo";

            } else if (numPedido % 5 == 0 && numPedido != 5) {
                imprimir = "El numero no es primo";

            } else if (numPedido % 7 == 0 && numPedido != 7) {
                imprimir = "El numero no es primo";

            } else if (numPedido == 1) {
                imprimir = "El numero no es primo";

            } else imprimir = "El numero es primo";

            System.out.println(imprimir);

            do {
                System.out.println("Desea salir? Si es asi escriba 'si' sino escriba 'no': ");
                palabraSalir = sc.next();

                if ("si".equalsIgnoreCase(palabraSalir)) {
                    seSale = true;
                    System.out.println("El programa ha finalizado");

                } else if ("no".equalsIgnoreCase(palabraSalir)) {
                    System.out.println("Usted continua preguntando");

                } else System.out.println("Respuesta no valida");

            } while (!("si".equalsIgnoreCase(palabraSalir) || "no".equalsIgnoreCase(palabraSalir)));

        }
    }

    //Ejercicio 2 (cine)
    public static void CalculadoraEntradasCine() {

        int numPersonas, grupos;
        double precioTotal = 0;

        final double DESCUENTO = 0.1;
        final int PRECIO_BASE = 8;
        final int PRECIO_ESPECIAL = 5;
        final int PRECIO_PAREJAS = 11;

        String diaSemana;
        String tarjeta;
        boolean existe = true;

        System.out.println("Cuantas personas son?: ");
        numPersonas = sc.nextInt();

        System.out.println("Que dia quieren ir?");
        diaSemana = sc.next();

        //Comprobar dia semana
        switch (diaSemana.toLowerCase()) {

            case "lunes", "martes", "viernes", "sabado", "domingo":
                System.out.println("Es un dia normal y la entrada vale 8 euros");

                precioTotal = PRECIO_BASE * numPersonas;
                break;

            case "miercoles":
                System.out.println("Es el dia del espectaor y la entrada vale 5 euros");

                precioTotal = PRECIO_ESPECIAL * numPersonas;
                break;

            case "jueves":
                System.out.println("Es el dia de la pareja y 2 entradas valen 11 euros");

                grupos = numPersonas / 2;
                precioTotal = (grupos * PRECIO_PAREJAS) + (numPersonas - grupos * 2) * PRECIO_BASE;
                break;

            default:
                existe = false;
                break;
        }

        System.out.println();

        if (existe) {
            //Preguntar fidelidad (DESCUENTO)
            do {
                System.out.println("Serian " + precioTotal + " euros");
                System.out.println();

                System.out.println("Tiene tarjeta de fidelidad? (si o no)");
                tarjeta = sc.next();

                if ("si".equalsIgnoreCase(tarjeta)) {
                    System.out.println("Tienes un descuento del 10%");
                    precioTotal = precioTotal - (precioTotal * DESCUENTO);

                } else if ("no".equalsIgnoreCase(tarjeta)) {
                    System.out.println("Lamentablemente no tienes descuento");

                } else System.out.println("Respuesta no valida");

            } while (!("si".equalsIgnoreCase(tarjeta) || "no".equalsIgnoreCase(tarjeta)));

            System.out.println();
            System.out.println("El precio total es de " + precioTotal + " euros");

        } else System.out.println("El dia de la semana introducido no existe");
    }
}
