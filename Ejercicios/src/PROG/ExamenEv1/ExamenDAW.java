import java.util.Scanner;

public class ExamenDAW {

    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        do {
            CadBinaria();
        } while (seSale());

        // CalcTasas();
    }

    //Ejercicio 1 Binario
    public static void CadBinaria() {

        String txtSol;
        String salir;

        System.out.println("Introduzca el texto de forma binaria: ");
        txtSol = sc.next();

        Comprobar(txtSol);

    }

    //Se repite hasta que se diga
    public static boolean seSale() {
        boolean seSale = false;
        String salir;

        do {
            System.out.println("Desea seguir? si/no: ");
            salir = sc.next();

            if ("si".equalsIgnoreCase(salir)) {
                seSale = true;
                System.out.println("Usted continua preguntando");

            } else if ("no".equalsIgnoreCase(salir)) {
                seSale = false;
                System.out.println("El programa ha finalizado");

            } else System.out.println("Respuesta no valida");
        } while (!("si".equalsIgnoreCase(salir) || "no".equalsIgnoreCase(salir)));

        return seSale;
    }

    //Comprobar el char de la cadena
    public static void Comprobar(String txt) {
        char comprobar;
        boolean esBinario = false;

        for (int i = 0; i < txt.length(); i++) {

            comprobar = txt.charAt(i);

            if (comprobar != '0' && comprobar != '1') {
                System.out.println("No es una cadena binaria");
                esBinario = false;
                break;
            } else esBinario = true;
        }
        if (esBinario) {
            System.out.println("Es una cadena binaria");
        }

    }

    //Ejercicio 2 calculo tasas
    public static void CalcTasas() {

        double salario;
        double[] resultados = new double[3];
        int edad;

        System.out.println("Introduzca su edad: ");
        edad = sc.nextInt();

        System.out.println("Introduzca su salario: ");
        salario = sc.nextDouble();

        if (salario > 6000) {
            System.out.println("El salario maximo es de 6000 euros");
            salario = 6000;
        }

        resultados = CalcTotal(edad, salario);

        System.out.println("El salario en empleado es: " + ((Math.round(resultados[0] * 100)) / 100));
        System.out.println("El salario en empleado es: " + ((Math.round(resultados[1] * 100)) / 100));
        System.out.println("El salario en empleado es: " + ((Math.round(resultados[2] * 100)) / 100));
    }

    //Calculo empleado , empleador y total
    public static double[] CalcTotal(int edad, double salario) {

        double[] resultados = new double[3];
        double tEmpleado, tEmpleador;

        if (edad <= 55) {
            tEmpleado = 0.2;
            tEmpleador = 0.17;
            System.out.println("la tasa de empleado con " + edad + " es 20% y la tasa de empleador es 17%");
            resultados[0] = salario * tEmpleado;
            resultados[1] = salario * tEmpleador;
            resultados[2] = resultados[0] + resultados[1];

        } else if (edad >= 56 && edad <= 60) {
            tEmpleado = 0.13;
            tEmpleador = 0.13;
            System.out.println("la tasa de empleado con " + edad + " es 13% y la tasa de empleador es 13%");
            resultados[0] = salario * tEmpleado;
            resultados[1] = salario * tEmpleador;
            resultados[2] = resultados[0] + resultados[1];

        } else if (edad >= 61 && edad <= 65) {
            tEmpleado = 0.075;
            tEmpleador = 0.09;
            System.out.println("la tasa de empleado con " + edad + " es 7.5% y la tasa de empleador es 9%");
            resultados[0] = salario * tEmpleado;
            resultados[1] = salario * tEmpleador;
            resultados[2] = resultados[0] + resultados[1];

        } else {
            tEmpleado = 0.05;
            tEmpleador = 0.075;
            System.out.println("la tasa de empleado con " + edad + " es 5% y la tasa de empleador es 7.5%");
            resultados[0] = salario * tEmpleado;
            resultados[1] = salario * tEmpleador;
            resultados[2] = resultados[0] + resultados[1];
        }
        return resultados;
    }
}
