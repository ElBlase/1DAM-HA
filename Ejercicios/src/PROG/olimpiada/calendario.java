import java.util.Scanner;
import java.time.Year;

public class calendario {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int anyo;
        boolean esBisiesto;
        int dia, contDia;
        int z;

        System.out.print("Introduzca el anyo: ");
        anyo = sc.nextInt();
        esBisiesto = EsBisiesto(anyo);

        for (int i = 1; i <= 12; i++) {
            System.out.println("\nMes: " + i);
            System.out.println("Dom\tLun\tMar\tMie\tJue\tVie\tSab");
            dia = DiaMes(i, esBisiesto);

            z = Zeller(anyo, i);
            contDia = 0;
            for(int k = 0; k < z; k++){
                contDia++;
                System.out.print("\t");
            }

            for(int j = 1; j <= dia; j++){
                System.out.print(j + "\t");
                contDia++;
                if(contDia == 7){
                    System.out.println();
                    contDia = 0;
                }
            }
        }
    }

    //Es bisiesto
    public static boolean EsBisiesto(int anyo) {
        boolean bisiesto;

        bisiesto = Year.isLeap(anyo);
        return bisiesto;
    }

    //Dia de cada mes
    public static int DiaMes(int mes, boolean esBisiesto) {
        int dias;
        switch (mes) {
            case 1, 3, 5, 7, 8, 10, 12:
                dias = 31;
                break;
            case 4, 6, 9, 11:
                dias = 30;
                break;
            default:
                dias = esBisiesto ? 29 : 28;
                break;
        }
        return dias;
    }

    /*Congetura de zeller
     0 = Luenes 1 = Martes 2 = Miercoles 3 = Jueves
     * 4 = Viernes 5 = Sabado 6 = Domingo */
    public static int Zeller(int anyo, int mes){
        int a = (14 - mes)/12;
        int y = anyo - a;
        int m = mes + 12 * a - 2;
        int dia = 1, d;

        d = (dia + y + y / 4 - y / 100 + y / 400 + (31 * m) / 12) % 7;

        return d;
    }
}
