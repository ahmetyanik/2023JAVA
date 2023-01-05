package day04;

import java.lang.reflect.Array;
import java.util.Scanner;

public class day04Scanner {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.println("Enter your name and last name, please");

        String fullName = input.nextLine();

        char first = fullName.charAt(0);

        char second = fullName.split(" ")[1].charAt(0);

        System.out.println(first + " " + second);

    }
}
