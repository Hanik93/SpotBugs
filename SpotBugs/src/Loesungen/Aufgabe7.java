package Loesungen;

import java.util.Random;

public class Aufgabe7 {

    public static void main(String[] args) {
        Random rand = new Random();
        int value = rand.nextInt(20);



        System.out.println(getValue(changeValue(value)));

    }

    static int changeValue(int value){
        if(value %2 == 0){
            value += 2;
        }else{
            value -= value ;
            System.out.println(value);
        }
        return value;
    }

    static int getValue(int newValue){
        return 25 / newValue;  // <-- Division durch 0 möglich
    }
}
