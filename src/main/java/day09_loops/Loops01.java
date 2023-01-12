package day09_loops;

public class Loops01 {

    public static void main(String[] args) {

        for(int i=11; i<45; i++){

            if(i%2==0){
                System.out.println(i);
            }
        }


        for(int i=68; i>13;i--){
            if(i%2==0){
                System.out.print(i + " ");
            }
        }

        System.out.println();

        for(char i='c';i<'v';i++){
            System.out.print(i + " ");
        }

        System.out.println();

        for(int i= 'a' - 'a'; i< 'e'; i++){

            System.out.print(i + " ");
        }

    }
}
