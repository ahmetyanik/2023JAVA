package day04;

import java.util.Scanner;

public class StringManipulations01 {

    public static void main(String[] args) {
        //Example 1: Get the full name of the user and make all characters in upper case.

        Scanner input = new Scanner(System.in);

        System.out.println("Enter your first name and last name:");

        String fullName = input.nextLine().toUpperCase();

        System.out.println(fullName);



//Example 2: Get the full name of the user, make all characters in upper cases and remove spaces
// from the beginning and from the end

        System.out.println("Enter your first name and last name");
        String name = input.nextLine().toUpperCase().trim();

        System.out.println(name);





    }
}
