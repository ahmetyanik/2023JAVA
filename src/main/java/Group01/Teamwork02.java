package Group01;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Teamwork02 {

    public static void main(String[] args) {

        //Example 1: Create a salary list and increase the salary %10 if the salary is less than 5000 dollars.
        //           [4500, 6400, 2300, 5000, 7150] ==> 4500-->4950 - 2300-->2530
        //           [4950, 6400, 2530, 5000, 7150]

        List<Double> salaries= new ArrayList<>();

        salaries.add(4500.00);
        salaries.add(6400.00);
        salaries.add(2300.0);
        salaries.add(5000.00);
        salaries.add(7150.00);
        salaries.add(1000.00);
        salaries.add(8000.00);

        Collections.sort(salaries);

        System.out.println(salaries);

        for(int i=0;i<salaries.size();i++){

            if(salaries.get(i)<5000.0){
                salaries.set(i, salaries.get(i) *1.1);

            }else{
                salaries.remove(i);
                i--;
            }
        }
        System.out.println(salaries);
    }
}
