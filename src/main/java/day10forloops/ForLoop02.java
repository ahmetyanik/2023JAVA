package day10forloops;

import java.util.Scanner;

public class ForLoop02 {


    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.println("Enter an Integer");

        String num = input.next();

        int sumOfUniqes = 0;

        for(int i = 0; i<num.length();i++){

            String ch = num.substring(i,i+1);

            if(num.indexOf(ch) == num.lastIndexOf(ch)){

                sumOfUniqes +=  Integer.valueOf(ch);


            }




        }
        System.out.println(sumOfUniqes);

    }
}
