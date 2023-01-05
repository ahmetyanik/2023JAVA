package day04;

public class StringManipulations03 {

    public static void main(String[] args) {
        //Example 1: Check the password if it has given rules.
        //           i)It should start with "J"
        //           ii)It should have at least 8 characters
        //           iii)Last 3 characters should be "AVA"

        String pwd = "J12!?AVA";

        boolean start = pwd.startsWith("J");
        boolean eight = pwd.length() > 7;



        boolean last = pwd.substring(pwd.length()-3).equals("AVA") ;

        System.out.println(start + " " + eight + " "  + last);

    }
}
