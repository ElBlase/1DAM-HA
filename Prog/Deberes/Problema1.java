import java.util.Scanner;

public class Problema1 {
	
	public static void main(String[] args){
		
		double resultado, dinero, horas;
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Indique el número de horas trabajadas: ");
		horas = sc.nextDouble();
		
		sc = new Scanner(System.in);
		System.out.println("Indique el número de dinero por hora: ");
		dinero = sc.nextDouble();
		
		resultado = horas * dinero;
		
		System.out.println("El total de dinero cobrado es: " + resultado + " euros");
	}
}