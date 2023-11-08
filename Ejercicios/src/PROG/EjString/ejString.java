import java.util.Scanner;

public class ejString {

    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {

        //letra();
        diaMes();
    }

    //Ejercicio 1
    public static void letra() {

        String texto;
        char caracter, comprobarChar;
        int numVeces = 0;

        System.out.print("Introduzca una oracion: ");
        texto = sc.next().toLowerCase();

        System.out.print("\nIndica el caracter que quieras contar: ");
        caracter = sc.next().charAt(0);

        caracter = Character.toLowerCase(caracter);

        for (int i = 0; i < texto.length(); i++) {

            comprobarChar = texto.charAt(i);

            if (comprobarChar == caracter) {

                numVeces++;
            }

        }
        System.out.println(numVeces != 1 ? "La letra " + caracter + "se ha repetido " + numVeces + " veces" : "La letra " + caracter + "se ha repetido " + numVeces + " vez");

    }

    //Ejercicio 2
    public static void diaMes() {

        int mes, anyo, dia = 0;
        boolean esBisiesto;

        System.out.print("Introduzca el numero del mes: ");
        mes = sc.nextInt();

        System.out.print("\nIntroduzca el anyo: ");
        anyo = sc.nextInt();

        //Comprobar año bisiesto
        if (anyo % 100 == 0 && anyo % 400 != 0) {

            esBisiesto = false;

        } else if (anyo % 4 == 0 || anyo % 400 == 0) {

            esBisiesto = true;

        } else esBisiesto = false;

        //Comprobar mes
        switch (mes) {

            case 1:
            case 3:
            case 5:
            case 7:
            case 8:
            case 10:
            case 12:
                dia = 31;
                break;
            case 4:
            case 6:
            case 9:
            case 11:
                dia = 30;
                break;
            case 2:
                if (esBisiesto) {
                    dia = 29;
                } else dia = 28;
                break;

        }
        System.out.println(mes < 1 || mes > 12 ? "Este mes no existe" : "El mes " + mes + " tiene " + dia + " dias");


    }
}
