package Aufgaben;

//Welchen Bug könnte SpotBugs hier finden? Analysiere den Code mit SpotBugs und überprüfe ob deine Antwort richtig ist.
//Finde anschließen eine Lösung für den Bug.

public class Aufgabe3 {
    private int abc;

    private String ip = "127.0.0.1";

    public void test() {

        String[] field = {"a", "b", "c", "s", "e"};


        String s = "";
        for (int i = 0; i < field.length; ++i) {
            s = s + field[i];
        }

        System.out.println(ip);

    }
}
