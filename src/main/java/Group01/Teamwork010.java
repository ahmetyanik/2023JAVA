package Group01;

import java.util.ArrayList;
import java.util.List;

public class Teamwork010 {

    public static void main(String[] args) {

        // If a list has 15 or 13, remove them.
        //Example: (10, 31, 15, 13, 54) ==> Output is (10, 31, 54)


        List<Integer> nums = new ArrayList<>();

        nums.add(10);
        nums.add(31);
        nums.add(15);
        nums.add(13);
        nums.add(54);

        nums.remove(nums.indexOf(15));

        System.out.println(nums);

        for (int i=0;i<nums.size();i++){

           if(nums.get(i) == 15){
                nums.remove(nums.indexOf(15));

            } else if (nums.get(i) == 13) {
                nums.remove(nums.indexOf(13));
            }
        }

        System.out.println(nums);

    }
}
