import java.util.Scanner;

public class ComprobarISBN {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        String isbnItroducido;
        int resultado;

        System.out.println("Introduzca el ISBN que quiere comprobar: ");
        isbnItroducido = sc.next();

        resultado = compISBN(isbnItroducido);

    }

    //Calcular el isbn
    public static int compISBN(String isbn) {
        char[] caracteresISBN = new char[isbn.length()];
        int[] valoresISBN = new int[isbn.length()];
        int resultado = 0;

        for (int i = 0; i < isbn.length(); i++) {
            caracteresISBN[i] = isbn.charAt(i);
            valoresISBN[i] = caracteresISBN[i] - '0';
        }
        for (int i = 10; i > 0; i--) {
            for (int j = 0; j < isbn.length(); j++) {
                resultado += (i * valoresISBN[j]);
                break;
            }
        }
        return resultado;
    }
}
