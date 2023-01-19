package day13multidimensionalarrays;

import java.util.Arrays;

public class Array01 {
    public static void main(String[] args) {

        //Example 1: Type code to check if a specific element exists in the array or not
        char ch[] = new char[5];
        ch[0] = 'A';
        ch[1] = 'Y';
        ch[2] = 'C';
        ch[3] = 'I';
        ch[4] = 'D';

        System.out.println(Arrays.toString(ch));

        int counter = 0;

        for(char w:ch){

            if(w == 'Y'){
                counter ++;
            }
        }

        System.out.println(counter);

    }
}
