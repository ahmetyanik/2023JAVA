package day04;

import java.util.Scanner;


public class StringManipulations02 {

    public static void main(String[] args) {

        //Example 1: Get the first 4 characters from a String and convert them to lower cases
        //          Albania ==> Alba ==>  alba

        String s= "GERMANY";


        String str= s.substring(0, 4).toLowerCase();
        System.out.println(str);

        //Example 2: Check if two Strings are same or not.
        String r= "Java";
        String u= "Java";
        boolean same=r.equals(u);
        System.out.println(same);

        boolean sameIgnoreCase= r.equalsIgnoreCase(u);
        System.out.println(sameIgnoreCase);

        System.out.println(r == u);


    }
}