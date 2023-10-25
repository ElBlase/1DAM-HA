import java.util.Scanner;

public class Autoevaluacion{
	
	public static void main(String [] args){
		
		//Conversion();
		//Formas();
		Maraton();
	}
	//Problema 1
	public static void Conversion(){
		
		double gradosC, gradosK;
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Introduzca una temperatura en grados celsius: ");
		gradosC = sc.nextDouble();
		
		gradosK = gradosC + 273.15;
		
		System.out.printf("La temperatura en grados Kelvin es de: %.3f",gradosK);
	}
	
	//Problema 2
	public static void Formas(){
		
		double altura, peso, imc;
		
		//Pedimos el peso
		Scanner sc = new Scanner(System.in);
		System.out.println("Introduzca su peso en kg: ");
		peso = sc.nextDouble();
		
		//Pedimos altura
		sc = new Scanner(System.in);
		System.out.println("Introduzca su altura en metros");
		altura = sc.nextDouble();
		
		imc = ((peso/(altura * altura)));
		
		System.out.printf("Su imc es: %.2f",imc);
	}
	
	//Problema 3
	public static void Maraton(){
		
		int edad, tiempo;
		String participado;
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Introduzca su edad: ");
		edad = sc.nextInt();
		
		//Comprobar edad
		if(edad >= 18){
			
			sc = new Scanner(System.in);
			System.out.println("¿Ha participado anteriormente en otra maratón? (si o no): ");
			participado = sc.nextLine();
			
			//Combrobar participado
			if(participado.equals("si")){
				
				sc = new Scanner(System.in);
				System.out.println("¿En cuanto tiempo termino? Expreselo en minutos: ");
				tiempo = sc.nextInt();
				
				//Comprobar edad respecto tiempo
				if(edad <=35 && tiempo <= 190){
					
					System.out.println("Persona seleccionada");
					
				} else if (edad > 35 && tiempo <= 225){
					
					System.out.println("Persona seleccionada");
					
				} else System.out.println("Persona no seleccionada");
				
				//No ha participado
			} else System.out.println("No puede participar");
			
			//No da la edad
		} else System.out.println("No puede participar");
		
	}
	
	
}