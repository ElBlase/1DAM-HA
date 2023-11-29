import java.util.Arrays;
import java.util.Scanner;

public class ejArrays {

    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        //invertir();
        //sumaNum();
        //maxValor();
        ordenarCadena();
    }

    //Ejercicio 1
    public static void invertir() {
        int[] num = {1, 2, 3, 4, 5};
        int[] numInv = new int[num.length];
        int aux;

        for (int i = 0; i < num.length; i++) {
            aux = num.length - i - 1;
            numInv[aux] = num[i];
        }
        System.out.println(Arrays.toString(numInv));
    }

    //Ejercicio 2
    public static void sumaNum() {
        int numeros;
        int resultado = 0;


        System.out.println("Introduzca la cantidad de numeros: ");
        numeros = sc.nextInt();

        int[] cantNum = new int[numeros];
        for (int j = 0; j < cantNum.length; j++) {
            System.out.println("Introduzca el valor " + (j + 1) + " : ");
            cantNum[j] = sc.nextInt();
        }


        for (int i = 0; i < cantNum.length; i++) {
            resultado = (resultado + cantNum[i]);
        }
        System.out.println("El resultado es: " + resultado);
    }

    //Ejercicio 3
    public static void maxValor() {
        int numeros;
        int max, min;
        boolean sonIguales = false;

        System.out.println("Introduzca la cantidad de numeros: ");
        numeros = sc.nextInt();

        int[] cantNum = new int[numeros];
        for (int j = 0; j < cantNum.length; j++) {
            System.out.println("Introduzca el valor " + (j + 1) + " : ");
            cantNum[j] = sc.nextInt();
        }
        max = min = cantNum[0];

        for (int i = 0; i < cantNum.length; i++) {

            if (cantNum[i] > max) {
                max = cantNum[i];
            } else if (cantNum[i] < min) {
                min = cantNum[i];
            } else {
                min = max;
                sonIguales = true;
            }
        }
        if (sonIguales) {
            System.out.println("Los valores son iguales");
        } else {
            System.out.println("El valor maximo es: " + max);
            System.out.println("El valor minimo es: " + min);
        }
    }

    //Ejercicio 4
    public static void ordenarCadena() {
        int numPalabras;

        System.out.println("Introduzca el numero de palabras: ");
        numPalabras = sc.nextInt();

        String[] palabras = new String[numPalabras];

        for (int i = 0; i < palabras.length; i++) {
            System.out.println("Pon la palabra numero " + (i + 1));
            palabras[i] = sc.next();
        }

        Arrays.sort(palabras);
        System.out.println(Arrays.toString(palabras));
    }
}
