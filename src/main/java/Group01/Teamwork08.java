package Group01;

import java.util.Scanner;

public class Teamwork08 {

    public static void main(String[] args) {

        // Ask the user to enter 2 Strings.
        // If the characters and the numbers of characters of the Strings are the same then print
        // "Anagram" on the console. Otherwise, print "Not Anagram" on the console.
        // Ignore cases. For example; "Mary" and "army" and "RAMY" are Anagrams.


        Scanner input = new Scanner(System.in);

        System.out.print("Birinci kelimeyi giriniz:");
        String birinci = input.next().toLowerCase();
        System.out.print("Ikinci kelimeyi giriniz:");
        String ikinci = input.next().toLowerCase();

        birinci.contains(ikinci.substring(0,1));

        int sum = 0;


        if(birinci.length() != ikinci.length()){
            System.out.println("Bu kelimeler anagram degil!");
        }else{
            for(int i=0;i<birinci.length();i++){

                if(!birinci.contains(ikinci.substring(i,i+1))){
                    System.out.println("Bu kelimeler anagram degil!");
                    break;
                }else{
                   if(ikinci.contains(birinci.substring(i,i+1))){
                       sum++;
                   }
                }

            }
        }

        if(birinci.length() == sum){
            System.out.println("Anagram");
        }else{
            System.out.println("Anagram degil!");
        }








    }
}
