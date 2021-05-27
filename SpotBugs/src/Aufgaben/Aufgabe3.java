package Aufgaben;

// Welchen Bug könnte SpotBugs hier finden? Analysieren Sie die Aufgabe mithilfe von SpotBugs und versuchen Sie anschließen den Bug zu lösen

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
