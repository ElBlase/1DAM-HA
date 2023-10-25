import java.util.Scanner;

public class Condicionales{
	
	public static void main(String[] args){
		
		//mayorEdad();
		//Ejercicio4();
		//Ejercicio5();
		Ejercicio6();
	}
	//Ejercicio 1
	public static void mayorEdad(){
		
		int edad;
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Introducir edad: ");
		edad = sc.nextInt();
		
		if(edad < 18){
			System.out.println("Es menor de edad");
		} else System.out.println("Es mayor de edad");
	}
	//Ejercicio 4
	public static void Ejercicio4(){
		double num1, num2;
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Introduzca el primer valor: ");
		num1 = sc.nextDouble();
		
		sc = new Scanner(System.in);
		System.out.println("Introduzca el segundo valor: ");
		num2 = sc.nextDouble();
		
		if(num1 == num2){
			System.out.println("¡ERROR! Ambos números son iguales");
			} else {
			System.out.println("El número mayor es: "+Math.max(num1, num2));
			System.out.println("El número menor es: "+Math.min(num1, num2));
		}
	}
	//Ejercicio 5
	public static void Ejercicio5(){
		double num1, num2, num3;
		
		//Numero 1
		Scanner sc = new Scanner(System.in);
		System.out.println("Introduzca el primer valor: ");
		num1 = sc.nextDouble();
		
		//Numero 2
		sc = new Scanner(System.in);
		System.out.println("Introduzca el segundo valor: ");
		num2 = sc.nextDouble();
		
		//Numero 3
		sc = new Scanner(System.in);
		System.out.println("Introduzca el tercer valor: ");
		num3 = sc.nextDouble();
		
		if (num1 == num2 || num1 == num3 || num2 == num3){
			System.out.println("Los valores deben de ser distintos");
		} else {
			System.out.println("El número mayor es: "+Math.max(Math.max(num1, num2), num3));
			System.out.println("El número menor es: "+Math.min(Math.min(num1, num2), num3));
		}
	}
	public static void Ejercicio6(){
		String tarta, tipoChocolate, nata, nombre;
		double precio=0;
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Elija un sabor (manzana, fresa, chocolate): ");
		tarta = sc.nextLine();
		
		//Chocolate
		if (tarta.equals("chocolate")){
			sc = new Scanner(System.in);
			System.out.println("¿Qué tipo de chocolate quiere? (negro o blanco): ");
			tipoChocolate = sc.nextLine();
			
			if (tipoChocolate.equals("negro")){
				precio = 14;
				System.out.println("Tarta de chocolate negro: "+precio+" $");
			} else {
				precio = 15;
				System.out.println("Tarta de chocolate blanco: "+precio +" $");
			}
		}
		//Manzana
		if(tarta.equals("manzana")){
			precio = 18;
			System.out.println("Tarta de manzana: "+precio+" $");
		} 
		
		//Fresa
		if(tarta.equals("fresa")){
			precio = 16;
			System.out.println("Tarta de fresa: "+precio+" $");
		}
		
		//Nata
		sc = new Scanner(System.in);
		System.out.println("¿Quiere nata? (si o no): ");
		nata = sc.nextLine();
		
		if(nata.equals("si")){
			precio = precio + 2.5;
			System.out.println("Con nata: 2,50 $");
		}
		
		//Nombre
		sc = new Scanner(System.in);
		System.out.println("¿Quiere ponerle un nombre? (si o no): ");
		nombre = sc.nextLine();
		
		if(nombre.equals("si")){
			precio = precio + 2.75;
			System.out.println("Con nombre: 2,75 $");
		}
		
		//Total
		System.out.println("Total: "+precio+" $");
	}
}