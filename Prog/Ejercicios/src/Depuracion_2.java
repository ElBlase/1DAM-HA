public class Depuracion_2 {

    public static void main(String[] args){

        Depuracion1();
        Depuracion3();
        Depuracion4();

    }

    //Ejercicio 1
    public static void Depuracion1(){

        int numero1 = 10, numero2 = 5;

        int resultado = numero1 * numero2;

        System.out.println("La multiplicación de "+numero1+" y "+numero2+" es "+resultado);
    }

    //Ejercicio3
    public static void Depuracion3(){

        int numero = 10, contador = 0;

        while(contador <= numero){
            System.out.println("Contador es: "+contador);
            contador++;
        }
    }

    //Ejercicio 4
    public static void Depuracion4(){

        String cadena = "Ejemplo";

        for (int i = 0; i <=cadena.length()-1;i++){
            char c = cadena.charAt(i);
            System.out.println("Carácter en la posición "+i+":"+c);
        }
    }
}
