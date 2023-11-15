import java.time.LocalDate;
import java.time.Period;
import java.util.Scanner;

public class CalculadorFechaNacimiento {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        LocalDate fechaActual = LocalDate.now();
        boolean esBisiesto;
        int diaNacimiento, diaActual;
        final int DIABISIESTO = LocalDate.of(2023,02,28).getDayOfYear();

        Period periodo;

        System.out.println("Introduzca su fecha de nacimiento (yyyy-mm-dd): ");
        LocalDate fechaNacimiento = LocalDate.parse(sc.next());

        esBisiesto = fechaNacimiento.isLeapYear();
        diaNacimiento = fechaNacimiento.getDayOfYear();
        diaActual = fechaActual.getDayOfYear();

        //Faltan dias
        if (diaNacimiento > diaActual){
            System.out.println("Faltan "+ (diaNacimiento - diaActual)+ " dias");

        } else if (diaNacimiento == diaActual) {
            System.out.println("Faltan 365 dias");

        } else System.out.println("Faltan "+(365-(diaActual-diaNacimiento) +" dias"));


        //Sacar Edad
        periodo = Period.between(fechaNacimiento, fechaActual);
        System.out.println("Tienes " + periodo.getYears() + " anyos");

        //Feliciaddes, faltan horas, fue

        if (esBisiesto && diaNacimiento > DIABISIESTO ) {

            diaNacimiento -= 1;

        }

        if (diaNacimiento == diaActual) {

            System.out.println("Felicidades!!!, hoy es tu cumpleanyos");

        } else if (diaNacimiento > diaActual) {

            System.out.println("Faltan " + (diaNacimiento - diaActual) * 24 + " horas para tu cumpleanyos en " + fechaActual.getYear());

        } else System.out.println("Tu cumpleanyos fue hace " + (diaActual - diaNacimiento) + " dias");

    }
}
