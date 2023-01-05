package day04;

public class InterviewQuestion01 {

    public static void main(String[] args) {
        // Example1: Type code to swap to integers

        // a = 12 and b=5 ==> a=5 and b=12

        int a=12;
        int b=5;

        int temp = 0;
        temp = a;

        a=b;

        b=temp;

        System.out.println(a + " " + b);

        // Second Way


        int x=12;
        int y=5;

        x = x + y;

        y = x - y;

        x = x - y;

        System.out.println(x + " " + y);


    }


}
