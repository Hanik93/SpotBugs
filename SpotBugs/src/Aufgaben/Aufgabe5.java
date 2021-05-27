package Aufgaben;

// In diesem Code gibt es drei Fehler. Welche Fehler sind das? Zwei werden von Spotbugs endeckt, der andere nicht.
// Behebe die Fehler die Spotbugs dir anzeigt.

public class Aufgabe5 {

    public static void main(String[] args){

        int value = 3;

        if(value == 1 && test()){
        } else if(value == 3 && test()){
        }else if(value == 1 && test()){

        }
    }

    public static Boolean test(){
        return null;
    }
}
