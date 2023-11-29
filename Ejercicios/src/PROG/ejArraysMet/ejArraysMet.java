import java.util.Arrays;

public class ejArraysMet {

    public static void main(String[] args){
        //ArrayToString();
        ArrayCopyOf();
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
}
