package Group01;

import java.util.Arrays;

public class Teamwork01 {

    public static void main(String[] args) {

        // Find the middle element in an integer array
        //Example: (12, 5, 8) ==> (5, 8, 12) ==> Output=8
        // (12, 5, 8, 13) ==> (5, 8, 12, 13) ==> Output=(8+12)/2 = 10

        int arr[] = {12, 5, 8,3};

        Arrays.sort(arr);

        System.out.println(Arrays.toString(arr));

        if(arr.length % 2 == 0){

            System.out.println((arr[arr.length / 2] + arr[arr.length / 2 - 1])/2);

        }else{

            System.out.println(arr[arr.length / 2] );
        }



    }
}
