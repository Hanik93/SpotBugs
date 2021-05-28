package Aufgaben;

// Welchen Bug könnte SpotBugs hier finden? Analysiere den Code mithilfe von SpotBugs und versuche anschließen eine Lösung für die Bugs zu finden

import java.util.Random;

public class Aufgabe6 {

    public static void main (String[] args){

        Random rand = new Random();
        int value;

        Integer[] arr = new Integer[100];
        for (int i =0; i< arr.length; i++){
            value = rand.nextInt(Integer.MAX_VALUE);

            if(value <= Integer.MAX_VALUE){
                arr[i] = rand.nextInt(100);
            }
        }

        CheckValue(arr);

    }

    public static void CheckValue(Integer[] arr){
        for(int j=0; j <arr.length;j++){
            int value2 = arr[j];
            int value3 = value2 % 2;
            switch (value3) {
                case 0 : System.out.println(value2 + " = even number");
                    break;
                case 1: System.out.println(value2 + " = odd number");
                    break;
            }
        }
    }


}
