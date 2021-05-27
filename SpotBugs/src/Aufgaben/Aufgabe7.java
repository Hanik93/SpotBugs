package Aufgaben;

// SpotBubgs findet nicht immer alle Fehler. An welcher Stelle im Code, könnte ein Fehler auftreten, der das Programm zum Absturz bringt?

public class Aufgabe7 {
    public static void main(String[] args) {

        System.out.println(divide());
    }

    static boolean returnBoolean(){
        if (System.currentTimeMillis()%2 == 0){
            return true;
        }
        else{
            return false;
        }
    }

    static int divide(){
        int x = 1;
        if(returnBoolean())
        { x = 0; }
        else
        { x = 5; }
        return (10/x);
    }

}
