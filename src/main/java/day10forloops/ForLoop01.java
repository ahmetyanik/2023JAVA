package day10forloops;

import java.util.Scanner;

public class ForLoop01 {

    public static void main(String[] args) {

        int sum = 0;
        int num = 5783;

        for(int i=num; i>0 ; i = i / 10 ){


            sum += i % 10;
        }

        System.out.println(sum);

        String word = "anna";

        String newWord = "";


        for(int i = 0;i< word.length(); i++){

            newWord += word.charAt(word.length() -1 - i);

        }

        if(word.equals(newWord)){
            System.out.println(word + " is Palindrome...");
        }else{
            System.out.println(word + " is not Palindrome!");
        }


    }


}
