import java.util.Scanner;

public class billete {

    public static void main(String[] args) {

        int distancia;
        String tipoBillete, tarjeta;
        double precio = 0, descuento;

        Scanner sc = new Scanner(System.in);

        System.out.print("Introduzca la cantidad de kilometros: ");
        distancia = sc.nextInt();

        System.out.print("\nIntroduzca el tipo de billete (sencillo o ida/vuelta): ");
        tipoBillete = sc.next();

        System.out.print("\nTiene tarjeta el cliente (si/no): ");
        tarjeta = sc.next();

        //Precio / km
        if ("sencillo".equalsIgnoreCase(tipoBillete)) {

            precio = 0.33 * distancia;
            System.out.printf("El precio sin descuentos en euros es: %.2f euros", precio);

        } else if ("ida/vuelta".equalsIgnoreCase(tipoBillete)) {
            precio = 0.26 * distancia;
            System.out.printf("El precio sin descuentos en euros es: %.2f euros", precio);

        } else System.out.println("Este tipo de billete no esta reconocido");

        if (precio != 0) {

            //Tarjeta
            if ("si".equalsIgnoreCase(tarjeta)) {

                descuento = 0.25;
                descuento = precio * descuento;
                precio = precio - descuento;

                System.out.printf("\nEl precio en euros es: %.2f euros", precio);

            } else if ("no".equalsIgnoreCase(tarjeta)) {

                descuento = 0;

            } else System.out.println("No se puede reconocer");

            //Descuentos
            if ("no".equalsIgnoreCase(tarjeta) && precio > 50 && precio <= 110) {

                descuento = 0.05;

                descuento = precio * descuento;
                precio = precio - descuento;

            } else if ("no".equalsIgnoreCase(tarjeta) && precio > 110) {

                descuento = 0.1;

                descuento = precio * descuento;
                precio = precio - descuento;

            }
            System.out.printf("\nEl precio en euros es: %.2f euros", precio);
        }
    }
}
