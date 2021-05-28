package Aufgaben;

// An welchen Stellen im Code könnte SpotBugs hier Fehler finden? Analysiere den Code mithilfe von SpotBugs und versuche anschließen die Bugs zu lösen

import java.util.Arrays;
import java.util.Collection;
import java.util.List;


public class Aufgabe8 {

    public static void main(String[] args){

        Integer value = 20;
        Object newValue = Integer.valueOf(value);
        System.out.println(newValue);


        List<String> list = Arrays.asList("a", "b", "c", "s", "e","d");

        String[] field = getAsArray(list);


        for(int i = 0; i<  field.length ; i++){
            System.out.println(field[i]);
        }
    }

    public static String[] getAsArray(Collection<String> c) {
        return (String[]) c.toArray();
    }

}
