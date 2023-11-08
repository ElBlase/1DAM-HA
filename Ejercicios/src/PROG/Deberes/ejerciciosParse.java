
public class ejerciciosParse{
	
	public static void main(String[] args){
		
		stringToInt();
		intToString();
		charToString();
		stringToBoolean();
		stringToDouble();
	}
		
	public static void stringToInt(){
			
		String texto = "2";
			
		System.out.println(Integer.parseInt(texto));
			
	}
								
	public static void intToString(){
		
		int numero=1985;
		
		System.out.println(String.valueOf(numero));
		
	}
	
	public static void charToString(){
		char letra = 'H';
		
		System.out.println(String.valueOf(letra));
		
	}
	
	public static void stringToBoolean(){
		
		String esverdad = "true";
		
		System.out.println(Boolean.parseBoolean(esverdad));
	}
	
	public static void stringToDouble(){
		
		String texto = "2.5";
		
		System.out.println(Double.parseDouble(texto));
		
	}
	
}
