package day04;

import java.util.Scanner;

public class Deneme {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.println("Enter a string:");
        String s = input.nextLine();

        int numOfChars = s.length();

        System.out.println(numOfChars);
    }
}
