import java.util.Scanner;

public class Suma{
	
	public static void main(String [] args){
		
		int a, b, suma;
		
		//Pido el primer num
		Scanner Num1=new Scanner(System.in);
		System.out.println("Introduzca el primer valor: ");
		a=Num1.nextInt();
		
		//Pido el segundo num
		Scanner Num2=new Scanner(System.in);
		System.out.println("Introduzca el segundo valor: ");
		b=Num2.nextInt();
		
		//Cálculo
		suma=a+b;
		
		System.out.println("La suma de ambos valores "+a+" y "+b+" es: "+suma);
		
		Num1.close();
		Num2.close();
	}
}