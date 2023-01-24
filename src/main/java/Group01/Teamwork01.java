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


        //Find the smallest positive element and greatest negative element in an integer array
        //Example:(-12, 18, -5, 23, -2) ==> Smallest positive is 18, greatest negative is -2

        int array[] = {-12,18,-5,23,-2,-25,89,78,1,-159,-1};

        Arrays.sort(array);

        System.out.println(Arrays.toString(array));

        int index =-1;

        for(int i=0;i< array.length;i++){

            if(array[i] == Math.abs(array[i])){
                index = i;
                break;
            }
        }

        System.out.println("Smallest positive is "+ array[index] + ", greatest negative is " + array[index-1]);


    }
}
