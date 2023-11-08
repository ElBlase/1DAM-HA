import java.util.Scanner;

public class UdFinal2{
	
	public static void main(String[] args){
		
		//Ejercicio1();
		//Ejercicio2();
		Ejercicio3();
		//Ejercicio4();
	}
	//Ejercicio 1
	public static void Ejercicio1(){
		
		int x = 144, y = 999;
		
		System.out.println("Suma: "+(x + y));
		System.out.println("Resta: "+(x - y));
		System.out.println("Division: "+(x / y));
		System.out.println("Multiplicacion: "+(x * y));
	}
	//Ejercicio 2
	public static void Ejercicio2(){
		double iva, base;
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Introduzca una base: ");
		base = sc.nextDouble();
		
		sc = new Scanner(System.in);
		System.out.println("Introduzca una valor de IVA en %: ");
		iva = sc.nextDouble();
		
		System.out.println("El total de la factura es: "+ (base +(base * (iva / 100))));
	}
	//Ejercicio 3
	public static void Ejercicio3(){
		String valor1, valor2;
		int num1, num2;
		
		valor1 = System.console().readLine("Introduzca el primer valor: ");
		
		valor2 = System.console().readLine("Introduzca el segundo valor: ");
		
		num1 = Integer.parseInt(valor1);
		num2 = Integer.parseInt(valor2);
		
		System.out.println("El valor mayor es: "+(Math.max(num1, num2)));
	}
	//Ejercicio 4
	public static void Ejercicio4(){
		double radio, altura, total;
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Introduzca el radio: ");
		radio = sc.nextDouble();
		
		sc = new Scanner(System.in);
		System.out.println("Introduzca un altura: ");
		altura = sc.nextDouble();
		
		total =  ((Math.PI) * (radio * radio) * altura)/3;
		
		System.out.println("El volumen es: "+total+" ud^3");
	}
	
}