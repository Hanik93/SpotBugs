package Loesungen;

import java.util.Arrays;
import java.util.Collection;
import java.util.List;

public class Aufgabe8 {
    public static void main(String[] args){

        Integer value = 20;
        Object newValue = value;
        System.out.println(newValue);


        List<String> list = Arrays.asList("a", "b", "c", "s", "e","d");

        String[] field = getAsArray(list);


        for(int i = 0; i<  field.length ; i++){
            System.out.println(field[i]);
        }
    }

    public static String[] getAsArray(Collection<String> c) {
        return c.toArray(new String[c.size()]);
    }

}
