package day08ternary_switch;

public class Ternary01 {

    public static void main(String[] args) {

        int a = -12 ;

        int b = 15;

        System.out.println(a<b ? a: b);


        int abs = a < 0 ? (-1 * a) : b ;

        System.out.println(abs);
    }

}
