import java.util.Scanner;

public class Problema2 {
	
	public static void main(String[] args){
		
		double imc, peso, altura;
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Introduzca su peso en kg: ");
		peso = sc.nextDouble();
		
		sc = new Scanner(System.in);
		System.out.println("Introduzca su altura en metros: ");
		altura = sc.nextDouble();
		
		imc =(peso/(altura * altura));
		
		System.out.printf("El imc es: %.2f",imc);
		
	}
	
}
