package Loesungen;
import java.util.Random;

public class Aufgabe6 {

    public static void main (String[] args){

        Random rand = new Random();
        int value;

        Integer[] arr = new Integer[100];
        for (int i =0; i< arr.length; i++){
            value = rand.nextInt(Integer.MAX_VALUE);

            if(value <=200){
                arr[i] = rand.nextInt(100);
            }
        }

        checkValue(arr);

    }

    public static void checkValue(Integer[] arr){
        for(int j=0; j <arr.length;j++){
            int value2 = arr[j];
            int value3 = value2 % 2;
            switch (value3) {
                case 0 : System.out.println(value2 + " = even number");
                    break;
                case 1: System.out.println(value2 + " = odd number");
                    break;
                default: System.out.println("default");
            }
        }
    }
}
