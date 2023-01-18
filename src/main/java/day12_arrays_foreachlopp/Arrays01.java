package day12_arrays_foreachlopp;

import java.util.Arrays;

public class Arrays01 {

    public static void main(String[] args) {

        int myArray[] = new int[3];

        myArray[0] = 9;

        myArray[1] = 10;

        myArray[2] = 11;

        System.out.println(Arrays.toString(myArray));


        String[] cities = new String[5];

        cities[0] = "Miami";
        cities[1] = "Miami";
        cities[2] = "Miami";
        cities[3] = "Miami";
        cities[4] = "Miami";


        //Q10
        String e = "Java, I like Java?";
        String ajj[] = e.split("a");

        System.out.println(Arrays.toString(ajj));

        System.out.println("The number of the character: " + (ajj.length-1)); //The number of the character: 4


    }



}
