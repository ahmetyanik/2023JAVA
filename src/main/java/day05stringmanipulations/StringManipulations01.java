package day05stringmanipulations;

public class StringManipulations01 {

    public static void main(String[] args) {

        {
            //Example1: Delete all "y"s from a given String
            String s="Everything is easy if you study";
            s.replace("y","");

            System.out.println("s = " + s);

    /*
    what Regular Expression ==>Regex
    1) All digits ==>[0-9]
    2) All lower cases ==>[a-z]
    3) All Upper cases==>[A-Z]
    4) All letters==> [a-zA-Z]
    5) All letters and digits [a-zA-Z0-9]
    6) All vowels ==> [aeiouAEIOU]
    7) All punctuation marks==> //p{Punct}
    8) All characters "different from" is (^i)
    9) All characters "different from" ==>[^a-Z]
    10) All characters "different from" letters ==> [^a-zA-Z]
    11) All characters "different from" vowels==> [^aeiouAEIOU]

     */

            //Example2: Delete all digits(0,1,2,3,4,5,6,7,8,9) from a given String
            //[0-9]==> regular expression in java

            String t="Tom is 13 years old, and his GPa is 3.98";
            String t1= t.replaceAll("[0-9]","");
            System.out.println("t1= " +t1);

            //Example3: Delete all vowels from a given String
            String u= "Tom are you here?";
            String newu=u.replaceAll("[aeiouAEIOU]", "");
            System.out.println("newU= "+ newu);

            //Example4: Count how many letters are there in a String
            //Logic: i)Delete all characters different from letters
            //       ii) Count the remaining characters
            String m= "Tom, are you here?";
            int numM= m.length();
            System.out.println("numM=" + numM);

            int numOfLetters= m.replaceAll("[^a-zA-Z]", ""). length();
            System.out.println("numOfLetters="+ numOfLetters);
            //Example4: Count how many letters are there in a String
            String n="Tom is 13 years old, and his GPA is 3.98";
            int n1=n.replaceAll("[^0-9]", "").length();
            System.out.println("n1=" +n1);

            //Example 5: Check the user's password according to the given rules
            //           i)Password should have at least 8 characters
            //           ii)Password should not have "space" character
            //           iii)Password should have at least 1 upper case
            //           iv)Password should have at least 1 lower case
            //           v)Password should have at least 1 symbol
            //           vi)Password should have at least 1 digit

            String pwd = "As1?fdes3";
            // i)Password should have at least 8 characters
            boolean firstRule=pwd.length()>7;
            System.out.println("firstRule="+ firstRule);

            //ii) Password should not have "space"character

            boolean secondRule=  pwd.replaceAll("[^ ]", "").length()==0;
            System.out.println("secondRule="+ secondRule);

            //           iii)Password should have at least 1 upper case
            boolean thirdRule= pwd.replaceAll("[^A-Z]", "").length()>0;
            System.out.println("thirdRule="+thirdRule);

            //           iv)Password should have at least 1 lower case
            boolean fourthRule=pwd.replaceAll("[^a-z]", "").length()>0;
            System.out.println("fourthRule="+ fourthRule);

            //           v)Password should have at least 1 symbol(Not letter, not digit)
            boolean fifthRule=pwd.replaceAll("[a-zA-Z0-9]","").length()>0;
            System.out.println("fifthRule="+fifthRule);

            //           vi)Password should have at least 1 digit

            boolean sixthRule= pwd.replaceAll("[^0-9]","").length()>0;
            System.out.println("sixthRule="+sixthRule);

            String newPWD="123456789";
            boolean sixth=newPWD.replaceAll("[0-9]", "").length()>0;
            System.out.println("sixth=" + sixth);
        }
    }





}
