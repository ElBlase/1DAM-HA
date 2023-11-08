import java.util.Scanner;

public class ejerciciosBucles{
	
	public static void main(String[] args){
		
		//sumatorioFor();
		//sumatorioWhile();
		tablaMultiplicar();
		//serieNumerica();
	}
	
	//Ejercicio 1 (For)
	public static void sumatorioFor(){
		
		int total = 0;
		
		for(int i = 1; i <= 10; i++){
			
			total = i + total;
		}
		
		System.out.println("El total es: "+total);
	}
	
	//Ejercicio 1 (while)
	public static void sumatorioWhile(){
		
		int total = 0, i = 1;
		
		while (i<=10){
			
			total = i + total;
			
			i++;
		}
		
		System.out.println("El total es: "+total);
	}
	
	//Ejercicio 2
	public static void tablaMultiplicar(){
		
		for (int i = 1; i <= 10;i++){
				switch (i){
					case 1: System.out.println("---La tabla del 1---");
						break;
						
					case 2: System.out.println("---La tabla del 2---");
						break;
						
					case 3: System.out.println("---La tabla del 3---");
						break;
					
					case 4: System.out.println("---La tabla del 4---");
						break;
					
					case 5: System.out.println("---La tabla del 5---");
						break;
					
					case 6: System.out.println("---La tabla del 6---");
						break;
					
					case 7: System.out.println("---La tabla del 7---");
						break;
					
					case 8: System.out.println("---La tabla del 8---");
						break;
					
					case 9: System.out.println("---La tabla del 9---");
						break;
					
					case 10: System.out.println("---La tabla del 10---");
						break;
					
					case 11: System.out.println("---La tabla del 11---");
						break;
					
					case 12: System.out.println("---La tabla del 12---");
						break;	
				}
			for (int j = 0; j <= 10; j++){
				
				System.out.println(i + " X " + j + " = " + (i * j));
				
			}
			
		}
	}
	
	//Ejercicio 3
	public static void serieNumerica(){
		
		Scanner sc = new Scanner(System.in);
		int cantidad, resultado = 1, total = 0;
		
		System.out.print("Introduzca el numero de digitos (este tiene que se mayor a 10 y entero): ");
		cantidad = sc.nextInt();
		
		if (cantidad >= 10){
		
			for (int i = 1; i <=cantidad; i++){
			
				if (i == cantidad){
				
					System.out.print(resultado +" ");
				
					total = resultado + total;;
			
				
				} else{
			
				System.out.print(resultado +" + ");
			
				total = resultado + total;;
			
				resultado = resultado + 3;
				}
			}
			
			System.out.println("= " + total);
			
		} else System.out.println("Cantidad no valida");
	}
}