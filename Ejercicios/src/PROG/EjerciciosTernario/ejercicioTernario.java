import java.util.Scanner;

public class ejercicioTernario {

    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {

        //diaSemana();
        calificacionExamen();
    }

    //Ejercicio 1
    public static void diaSemana() {

        int numDia;
        String dia;

        System.out.print("Introduza un número del dia de la semana: ");
        numDia = sc.nextInt();

        dia = numDia == 1
                ? "Lunes"
                : numDia == 2
                ? "Martes"
                : numDia == 3
                ? "Miercoles"
                : numDia == 4
                ? "Jueves"
                : numDia == 5
                ? "Viernes"
                : numDia == 6
                ? "Sabado"
                : numDia == 7
                ? "Domingo"
                : "Dia de la semana no valido";

        System.out.println(numDia < 1 ? dia : numDia > 7 ? dia : "El dia de la semana es " + dia);
    }

    //Ejercicio 2
    public static void calificacionExamen() {

        int nota;
        String calificacion;

        System.out.print("Introduzca la calificacion del examen: ");
        nota = sc.nextInt();

        calificacion = (nota >= 0 && nota < 60) ? "F"
                : (nota >= 60 && nota < 70) ? "D"
                : (nota >= 70 && nota < 80) ? "C"
                : (nota >= 80 && nota < 90) ? "B"
                : (nota >= 90 && nota <= 100) ? "A"
                : "Valor no valido";

        System.out.println((nota >= 0 && nota <= 100) ? "Puntuacion: " + nota + " => " + calificacion : calificacion);

    }
}
