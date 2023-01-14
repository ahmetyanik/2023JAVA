package day10forloops;

import java.util.Scanner;

public class NestedForLoop {

    public static void main(String[] args) {
/*
        int week = 52;

        int day = 7;

        for(int i = 0;i < week ; i++){

            System.out.println("Week: " + (i + 1) );

            for(int j = 0; j<day;j++){


                System.out.println("  Day: " + (j + 1));

            }

        }

/*

        /*
     Example 3: Write a Java Program to Print Rectangle Star Pattern using For Loop
                 ****
                 ****
                 ****
     Note: Get the number of rows and columns from user
 */

        System.out.println("Enter an Row");
        Scanner input = new Scanner(System.in);




        System.out.println("Enter an Stars");

        Scanner input2 = new Scanner(System.in);



        int row = input.nextInt();
        int numberOfstars = input2.nextInt();


        for(int i=0; i< row; i++){

            System.out.println();

            for(int j=0; j<numberOfstars;j++){

                System.out.print("*");
            }

        }


    }

}
