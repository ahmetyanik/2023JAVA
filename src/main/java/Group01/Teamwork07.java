package Group01;

import java.util.Arrays;

public class Teamwork07 {

    public static void main(String[] args) {

      //Type code to put all zeros to end in an integer array. Example: (5, 0, 2, 0, 3) ==> (5, 2, 3, 0, 0)

        int [] array  = {5,0,-2,0,3};

        int [] newArray = new int[array.length];



        System.out.println(Arrays.toString(array));

        for(int i=0;i< array.length;i++){

            if(array[i] == 0){
                newArray[i] = array[i];
            }else{


            }


        }

        System.out.println(Arrays.toString(newArray));



    }

}
