package Group01;

import java.util.Arrays;

public class Teamwork06 {

    public static void main(String[] args) {

       // Count how many words start with 'a' or 'A' in a given String
        String s = "Apex is an object oriented programming language Ahmet";

        String arr [] = s.split("a");

        System.out.println(Arrays.toString(arr));

        int sum = 0;

        for(String w: arr){

            if(w.startsWith("a") || w.startsWith("A")){
                sum++;
            }
        }

        System.out.println(sum);

    }
}
