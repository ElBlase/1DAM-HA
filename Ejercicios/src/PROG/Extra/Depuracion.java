import java.util.Scanner;

public class Depuracion {

    public static void main(String[] args){

        //Depuracion1();
       // Depuracion2();
        //Depuracion3();
      //  Depuracion4();
        Depuracion5();
    }

    //Ejercicio 1
    public static void Depuracion1(){

        int numero = 5;

        System.out.println("El número es: "+numero);

    }

    //Ejercicio 2
    public static void Depuracion2(){

        int numero1 = 10, numero2 = 5;
        int suma = numero1 + numero2;

        System.out.println("La suma de " + numero1 + " y " + numero2 + " es "+ suma);

    }

    //Ejercicio 3
    public static void Depuracion3(){

        int [] numeros = {1,2,3};
        System.out.println("El tercer número es: "+ numeros[2]);
    }

    //Ejercicio 4
    public static void Depuracion4(){

        int contador = 0;
        while (contador <= 10){
            System.out.println("Contador:"+contador);
            contador++;
        }
    }

    //Ejercico 5
    public static void Depuracion5(){

        String texto1 = "Hola", texto2 = "hola";

        if(texto1.equals(texto2)){

            System.out.println("Las cadenas son iguales");

        } else System.out.println("Las cadenas son diferentes");



    }

}
