package Group01;

import java.util.Arrays;

public class Exams02 {

    public static void main(String[] args) {

        int arr[][] = { {3,2,1},{1,2,3} };


        for (int i = 1; i < arr.length; i++) {

            for (int k = 1; k < arr[0].length; k++) {

                System.out.println("i " + i);
                System.out.println("k " + k);

                System.out.println(Arrays.deepToString(arr));

                if (arr[i][k] % 2 == 1){

                    System.out.println("if  1 " + arr[i][k]);
                    arr[i][k] = arr[i][k] + 1;
                    System.out.println(Arrays.deepToString(arr));
                }

                if (arr[i][k] % 2 == 0){
                    System.out.println("if 2 " + arr[i][k]);
                    arr[i][k] = arr[i][k] * 2;
                    System.out.println(Arrays.deepToString(arr));
                }
            }
        }
        System.out.println(Arrays.deepToString(arr));
    }
}
