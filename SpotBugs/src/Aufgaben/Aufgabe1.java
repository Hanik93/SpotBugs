package Aufgaben;
//Welchen Bug könnte SpotBugs hier finden? Analysiere den Code mit SpotBugs und überprüfe ob deine Antwort richtig ist.
//Finde anschließen eine Lösung für den Bug.

public class Aufgabe1 {

    public static void main (String[] args){
        int value = 10;

        while(value >= 1){
            System.out.println("BUG"+ value);
        }
    }
}
