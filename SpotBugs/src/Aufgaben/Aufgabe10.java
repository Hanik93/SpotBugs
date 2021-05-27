package Aufgaben;


import java.util.Random;

// Analysieren Sie die Aufgabe mithilfe von SpotBugs und versuchen Sie anschließen eine Lösung für den Bug zu finden

public class Aufgabe10 {

    public static void main(String[] args){
         Random rand = new Random();
         int value = rand.nextInt(5);
         String str = "SpotBugs";


        System.out.println(str.substring(3,11));


        int x = 2;
        int y = 5;

        double value1 = x / y;

        System.out.println(value1);





    }

}

