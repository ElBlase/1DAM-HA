import java.util.Scanner;

public class calculadoraDef {

    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {

        int operacion = 0, i = 0;
        double resultado = 0;
        boolean seSale = false;

        while (!seSale) {

            System.out.println("""
                    ---La calculadora magica---
                    1.Suma
                    2.Resta
                    3.Multiplicacion
                    4.Division
                    5.Potencia
                    6.Raiz
                    7.Salir""");
            System.out.println("Elija lo que desee hacer mediante el numero seleccionado: ");
            operacion = sc.nextInt();

            switch (operacion) {
                case 1, 2:
                    System.out.println("Con cuantos numeros desea operar?: ");
                    i = sc.nextInt();

                    double cantNum[] = CantidadNumeros(i);
                    resultado = SumaResta(operacion, cantNum);
                    break;
                case 3:
                    System.out.println("Elija los numeros con los que quierer operar: ");
                    i = sc.nextInt();

                    cantNum = CantidadNumeros(i);
                    resultado = MultiplicacionDivision(operacion, cantNum);
                    break;
                case 4:
                    System.out.println("Tienen que se 2 numeros dividendo y divisor");
                    i = 2;
                    cantNum = CantidadNumeros(i);
                    resultado = MultiplicacionDivision(operacion, cantNum);
                    break;
                case 5:
                    System.out.println("Tiene que elegir base y exponente");
                    i = 2;
                    cantNum = CantidadNumeros(i);
                    resultado = PotenciaRaiz(operacion, cantNum);
                    break;

                case 6:
                    System.out.println("Solo un numero para hacer la raiz cuadrada");
                    i = 1;
                    cantNum = CantidadNumeros(i);
                    resultado = PotenciaRaiz(operacion, cantNum);
                    break;

                case 7:
                    System.out.println("Espero que le haya servido de ayuda :o");
                    seSale = true;
                    break;

                default:
                    System.out.println("¡¡Valor no valido introduzcalo de nuevo!!");
                    break;
            }
            System.out.println(operacion >= 7 ? "": "El resulado es " + resultado);
            System.out.println();
        }
    }

    //Cantidad de numeros con los que se operan
    public static double[] CantidadNumeros(int i) {
        double[] cantNum = new double[i];

        for (int j = 0; j < cantNum.length; j++) {
            System.out.println("Introduzca el valor " + (j + 1) + " : ");
            cantNum[j] = sc.nextDouble();

        }
        return cantNum;
    }

    //Suma y Resta
    public static double SumaResta(int operacion, double[] cantNum) {

        double resultado = 0;

        if (operacion == 1) {
            for (int i = 0; i < cantNum.length; i++) {
                resultado = (resultado + cantNum[i]);

            }
        } else {
            resultado = cantNum[0];
            for (int i = 1; i < cantNum.length; i++) {
                resultado = resultado - cantNum[i];

            }
        }
        return resultado;
    }

    //Multiplicacion y division
    public static double MultiplicacionDivision(int operacion, double[] cantNum) {
        double resultado = 1;

        for (int i = 0; i < cantNum.length; i++) {
            resultado = operacion == 3 ? (resultado * cantNum[i]) : (cantNum[0] / cantNum[1]);

        }
        return resultado;
    }

    //Potencia y raiz
    public static double PotenciaRaiz(int operacion, double[] cantNum) {
        double resultado;

        resultado = operacion == 5 ? (Math.pow(cantNum[0], cantNum[1])) : (Math.sqrt(cantNum[0]));

        return resultado;
    }

}
