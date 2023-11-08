import java.util.Scanner;

public class BreakContinue {

    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {

        //rupturas2En2();
        //rupturas1En1();
        //rupturasInfinito();
        //eco();
        sumaNumPares();
    }

    //Ejercicio 1 (Rupturas 2 en 2)
    public static void rupturas2En2() {

        for (int i = 10; i <= 20; i = i + 2) {

            if (i == 16) {
                continue;
            }

            System.out.println(i);

        }

    }

    //Ejercicio 1 (Rupturas 1 en 1)
    public static void rupturas1En1() {

        for (int i = 10; i <= 20; i++) {

            if (i == 16) {
                continue;
            }

            System.out.println(i);

        }

    }

    //Ejercicio 1 (Bucle infinito)
    public static void rupturasInfinito() {

        int valor = 10;

        while (true) {

            for (; valor <= 20; valor++) {

                if (valor == 16) {
                    continue;
                }

                System.out.println(valor);

            }

            if (valor == 20) {
                break;
            }
        }
    }

    //Ejercicio 2 (Eco)
    public static void eco() {
        String txtSolicitado;

        while (true) {

            System.out.print("Introduzca el texto deseado: ");
            txtSolicitado = sc.next();

            if ("salir".equalsIgnoreCase(txtSolicitado)) {

                break;

            }
            System.out.println("El eco es: " + txtSolicitado);
        }
    }

    //Ejercicio 3 (Suma numeros pares)
    public static void sumaNumPares() {

        int valorLim1, valorLim2, max, min, total = 0, i = 0;

        System.out.print("Introduzca el primer limite: ");
        valorLim1 = sc.nextInt();

        System.out.print("\nIntroduzca el segundo limite: ");
        valorLim2 = sc.nextInt();

        //Max y min
        max = Math.max(valorLim1, valorLim2);
        min = Math.min(valorLim1, valorLim2);

        //Averigua si es par
        if (min % 2 != 0) {

            i = min + 1;

        }

        for (; i <= max; i = i + 2) {

            total = total + i;

        }

        System.out.println("La suma de los numeros pares comprendida desde " + min + " hasta " + max + " es " + total);

    }
}