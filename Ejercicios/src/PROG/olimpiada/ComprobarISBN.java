import java.util.Scanner;

public class ComprobarISBN {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        String isbnItroducido;
        int resultado;

        System.out.println("Introduzca el ISBN que quiere comprobar: ");
        isbnItroducido = sc.next();

        resultado = compISBN(isbnItroducido);

        if (resultado % 11 == 0) {
            System.out.println("Isb valido");
        } else System.out.println("Isb no valido");

    }

    //Calcular el isbn
    public static int compISBN(String isbn) {
        char[] caracteresISBN = new char[isbn.length()];
        int[] valoresISBN = new int[isbn.length()];
        int resultado = 0;
        int k = 10;
        boolean tieneLetra = false;

        for (int i = 0; i < isbn.length(); i++) {
            caracteresISBN[i] = isbn.charAt(i);
            if (Character.isDigit(caracteresISBN[i])) {
                valoresISBN[i] = caracteresISBN[i] - '0';
            } else {
                tieneLetra = true;
            }
        }
        resultado = sumatorio(valoresISBN, tieneLetra);
        return resultado;
    }

    //Averiguar como es el ibs correcto si hay un ?
    public static void averiguar(int[] valoresISBN){

    }

    //Sumatorio
    public static int sumatorio(int[] valoresISBN, boolean tieneLetra){
        int resultado = 0;
        int k = 10;
        for (int j : valoresISBN) {
            while (k > 0) {
                resultado += (k * j);
                k--;
                break;
            }
        }
        if (tieneLetra) {
            resultado = resultado + 10;
        }
        return resultado;
    }
}
