package Group01;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Teamwork09 {

    public static void main(String[] args) {

        // 4) Check if elements are in descending order in a list
        //Example: (Yellow, Blue, Red, Green) ==> Output: It is not in descending order
        //(Yellow, Red, Green, Blue) ==> Output: It is in descending order


        List<String> renkler = new ArrayList<>();

        renkler.add("Yellow");
        renkler.add("Blue");
        renkler.add("Red");
        renkler.add("Green");


        Collections.sort(renkler);

        System.out.println(renkler);

        List<String> descRenkler = new ArrayList<>();

        for(int i=0;i<renkler.size();i++){


            descRenkler.add(renkler.get(renkler.size()-1-i));


        }

        System.out.println(descRenkler);


    }
}
