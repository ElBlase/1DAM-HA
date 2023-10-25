
0import java.util.Scanner;

public class Problema3{
	
	public static void main(String[] args){
		
		int valor1, valor2;
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Introduzca el primer valor: ");
		valor1 = sc.nextInt();
		
		sc = new Scanner(System.in);
		System.out.println("Introduzca el segundo valor: ");
		valor2 = sc.nextInt();
		
		System.out.println(valor1 + " entre " + valor2 + " da un cociente " + valor1 / valor2 + " y un resto " + valor1 % valor2);
		
		
		
	}
	
}