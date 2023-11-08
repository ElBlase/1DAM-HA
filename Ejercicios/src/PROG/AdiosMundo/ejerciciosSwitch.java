import java.util.Scanner;

public class ejerciciosSwitch {
	
    public static void main(String[] args) {
		
		//animnales();
		calculadora();
		
	}
	
	//Ejercicio 1
	public static void animales(){
		System.out.print("Animales a elegir: cat, dog, lion, cow, tiger");
		System.out.print("\nElija un animal de los mostrados en pantalla para indicar si son o no domesticos: ");
		
		Scanner scanner = new Scanner(System.in);
		String animal = scanner.nextLine();
		
		switch(animal){
			
			case "cat" : System.out.println("El gato es un animal domestico");
				break;
			
			case "dog" : System.out.println("El perro es un animal domestico");
				break;
			
			case "lion" : System.out.println("El leon no es un animal domestico");
				break;
			
			case "cow" : System.out.println("La vaca no es un animal domestico");
				break;
			
			case "tiger" : System.out.println("El tigre no es un animal domestico");
				break;
			
			default : System.out.println("Este animal no esta registrado");
				break;
			
		}
	}
	//Ejercicio 2
	public static void calculadora(){
		
		double numero1, numero2, resultado;
		int operacion;
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Introduzca el primer valor: ");
		numero1 = sc.nextDouble();
		
		System.out.print("\nIntroduzca el segundo valor: ");
		numero2 = sc.nextDouble();
		
		System.out.print("-Bienvenido a la calculadora magia-\n"+
				"Menu:\n"+
				"1.Suma\n"+
				"2.Resta\n"+
				"3.Multiplicacion\n"+
				"4.Resta\n"+
				"Introduzca que quiere realizar: ");
		operacion = sc.nextInt();
		
		switch (operacion){
			
			case 1: 
				resultado = numero1 + numero2;
				System.out.print(numero1 + " + " + numero2 + " = " + resultado);
				break;
			
			case 2: 
				resultado = numero1 - numero2;
				System.out.print(numero1 + " - " + numero2 + " = " + resultado);
				break;
			
			case 3:
				resultado = numero1 * numero2;
				System.out.print(numero1 + " * " + numero2 + " = " + resultado);
				break;
				
			case 4: 
				resultado = numero1 / numero2;
				System.out.print(numero1 + " / " + numero2 + " = " + resultado);
				break;
			
			default : System.out.print("La opcion elegida no realiza nada en la calculadora");
				break;
		}
		
	}
	
}