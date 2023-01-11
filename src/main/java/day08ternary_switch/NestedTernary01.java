package day08ternary_switch;

import java.util.Scanner;

public class NestedTernary01 {

    public static void main(String[] args) {

          /*
            Type java code by using nested ternary.
            Write a program to check if a year is "leap year" or not.
            i)If the year is divisible by 100 then it must be divisible by 400.==>1600+   1800-
            ii)If a year is not divisible by 100 then it must be divisible by 4.==>2004+  1997-
        */



         /*
            Type code to check the password
            If it has more than 8 characters, initial should be 'i'
            If it has no more than 8 characters initial should be 'K'
            Solve the task by using nested-ternary
        */


        Scanner input = new Scanner(System.in);
        System.out.println("Enter your password");

        String psw = input.nextLine();

        System.out.println(psw.length() > 8 ? (psw.startsWith("i")  ? true : false) : (psw.startsWith("K") ? true : false));




    }

}
