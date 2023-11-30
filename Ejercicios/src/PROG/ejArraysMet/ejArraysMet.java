import java.util.Arrays;

public class ejArraysMet {

    public static void main(String[] args){
        //ArrayToString();
        ArrayCopyOf();
        ArraysCopyOf2();
        ArraysIguales();
        ArrayShort();
    }

    //Ejercicio 1 (toString)
    public static void ArrayToString(){
        int[] vecNum = {1,2,5,6,7};

        System.out.println(Arrays.toString(vecNum));
    }

    //Ejercicio 2 (copyOf)
    public static void ArrayCopyOf(){
        int[] vecNum = {1,2,5,6,7};
        int[] newVecNum = new int[vecNum.length + 1];

        Arrays.copyOf(vecNum, vecNum.length + 1);

        System.out.println(Arrays.toString(vecNum));
    }
    //Ejercicio 4
    public static void ArraysCopyOf2(){
        int[] vecNum = {1,2,3,4,5};

        System.out.println(Arrays.toString(Arrays.copyOfRange(vecNum, 1, 4)));

    }
    //Ejercicio 5
    public static void ArraysIguales(){
        int[] vecNum = {1,2,3,4,5};
        int[] vecNumNew = {5,6,7,8};

        System.out.println(Arrays.equals(vecNumNew, vecNum) ? "Son iguales" : "Son diferentes");
    }

    //Ejercicio 7
    public static void ArrayShort(){
        int[] vecNum = {3,45,6545,67,34765,123};

        System.out.println("Sin ordenar "+ Arrays.toString(vecNum));

        Arrays.sort(vecNum, 2,4);
        System.out.println("Ordenado "+ Arrays.toString(vecNum));

    }
}
