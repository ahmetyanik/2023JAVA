package Group01;

import java.util.ArrayList;
import java.util.List;

public class Teamwork011 {

    public static void main(String[] args) {

        //Check if all elements are unique in an integer List by using loops.

        List<Integer> myList = new ArrayList<>();
        myList.add(10);
        myList.add(31);
        myList.add(15);
        myList.add(7);
        myList.add(16);
        myList.add(23);

        System.out.println(myList);

        int sum = 0;
        List <Integer> esitOlanlar = new ArrayList<>();

        for(int i=0;i< myList.size();i++){
            for(int k=i+1;k<myList.size();k++){
                if(myList.get(i) == myList.get(k)){
                    sum++;
                    esitOlanlar.add(myList.get(i));
                }

            }

        }
        System.out.println(esitOlanlar);

        if(sum !=0){
            System.out.println("Not Unique");
        }else {
            System.out.println("Unique");
        }





    }
}
