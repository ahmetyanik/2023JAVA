package Tryings;

import java.util.Scanner;

public class Ternary {

    public static void main(String[] args) {


        Scanner input = new Scanner(System.in);

        System.out.print("Give a number please:");

        int firstNumber = input.nextInt();

        System.out.print("Give a second number please:");

        int secondNumber = input.nextInt();

        int result = firstNumber > 0 && secondNumber > 0 ? firstNumber * secondNumber : 0;

        String sonuc = result > 0 ? result + "" : "I can not make this operation!";

        System.out.println(sonuc);


    }

}
