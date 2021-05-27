package Aufgaben;
//Welchen Fehler könnte SpotBugs hier entdecken? Analysiere den Code und überprüfe ob deine Antwort richtig ist.
// Finde anschließen eine Lösung für den Bug.

public class Aufgabe1 {

    public static void main (String[] args){
        int value = 10;

        while(value >= 10){
            System.out.println("BUG"+ value);
        }
    }
}
