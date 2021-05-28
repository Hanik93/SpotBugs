package Aufgaben;

//Welchen Bug könnte SpotBugs hier finden? Analysiere den Code mit SpotBugs und überprüfe ob deine Antwort richtig ist.
//Finde anschließen eine Lösung für den Bug.
public class Aufgabe2 {
    public static void main(String[] args) {
        double pi = pi();

        System.out.println(pi);
    }

    private static double pi() {
        return 3.141592;
    }
}
