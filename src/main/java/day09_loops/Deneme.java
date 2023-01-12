package day09_loops;

public class Deneme {

    public static void main(String[] args) {
        String shirtPrice = "$12.99";

        String s = shirtPrice.replaceAll("[$.]","");

        System.out.println(s);
    }
}
