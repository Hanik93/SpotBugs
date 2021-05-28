package Aufgaben;

import java.util.Random;

//An welchen Stellen könnte SpotBUgs hier Bugs finden? Analysiere den Code mit SpotBugs und überprüfe ob deine Antwort richtig ist.
//Finde anschließen eine Lösung für die Bugs.
public class Aufgabe4 {

    public static void main(String[] args){
        int x = 2;
        int y = 5;
        Random rand = new Random();
        int value = rand.nextInt(5);
        String str = "SpotBugs";

        System.out.println(str.substring(3,11));

        double value1 = x / y;

        System.out.println(value1);


    }

}

