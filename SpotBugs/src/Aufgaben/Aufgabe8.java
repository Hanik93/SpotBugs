package Aufgaben;

// Welchen Bug könnte SpotBugs hier finden? Analysieren Sie die Aufgabe mithilfe von SpotBugs und versuchen Sie anschließen den Bug zu lösen

public class Aufgabe8 {

    private static void cast2(Double aValue) {
       Object doubleValue = Double.valueOf(aValue);
       Long value = (Long) doubleValue;
        System.out.println("Rounded value: " + value);
    }

    public static void main(String[] args) {
        cast2(1.6);
    }

}
