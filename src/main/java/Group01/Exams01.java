package Group01;

import java.util.Arrays;

public class Exams01 {

    public static void main(String[] args) {
        int [][] x = {{2,1},{1,7,1},{2,8,9}};

       //   [[2,1],[1,7,1]]

        System.out.println((m(x[2])));
    }


    public static int m(int[] y){
        int result = 0; // 1 + 7 + 1

        System.out.println(Arrays.toString(y));

        for(int i=0;i<y.length;i++){

            result += y[i];
        }

        return result;
    }
}
