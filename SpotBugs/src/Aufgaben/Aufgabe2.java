package Aufgaben;

// Analysieren Sie die Aufgabe mithilfe von SpotBugs und versuchen Sie anschließen eine Lösung für den Bug zu finden
public class Aufgabe2 {
    public static void main(String[] args) {
        double pi = getPI();

        System.out.println(pi);
    }

    private static double getPI() {
        return 3.141;
    }

}

