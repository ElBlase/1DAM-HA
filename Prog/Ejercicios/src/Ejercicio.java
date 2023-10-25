import java.util.Scanner;

public class Ejercicio {

    public static void main(String[] args){

        //Saludo();
        //Suma();
        //Edad();
        //Conversion();
        StringToInt();
    }
    //Saludo
    public static void Saludo(){

        String nombre = "Hugo";

        System.out.println("¡Hola "+nombre+"!");
    }
    //Suma
    public static void Suma(){
        int num1, num2, total;

        Scanner sc = new Scanner(System.in);
        System.out.println("Inserte el primer valor: ");
        num1 = sc.nextInt();

        sc = new Scanner(System.in);
        System.out.println("Inserte el segundo valor: ");
        num2 = sc.nextInt();

        total = num1 + num2;

        System.out.println("La suma es: "+total);
    }
    //Edad
    public static void Edad(){
        int edad;

        Scanner sc = new Scanner(System.in);
        System.out.println("Introduzca su edad: ");
        edad = sc.nextInt();

        System.out.println("Tienes "+edad+" años");
    }
    //Conversion
    public static void Conversion(){

        double numDouble = 10.5;
        int numEnt = (int) numDouble;

        System.out.println(numEnt);
        System.out.println(numDouble);
    }
    //StringToInt
    public static void StringToInt(){
        String texto = "42";
        int num;

        num = Integer.parseInt(texto);

        System.out.println(num);

    }
}
