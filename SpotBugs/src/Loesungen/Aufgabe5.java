package Loesungen;

public class Aufgabe5 {
    public static void main(String[] args){


        int value = 3;

        if(value == 1 && test()){
            System.out.println("print something");
        } else if(value == 3 && test()){
            System.out.println("print something2");
        }else if(value == 1 && test()){  // Hier wird ein zweites mal exakt dasselbe überprüft
            System.out.println("print something3");

        }
    }

    public static Boolean test(){
        return true;
    }
}
