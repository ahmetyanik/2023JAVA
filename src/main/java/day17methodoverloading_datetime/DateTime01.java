package day17methodoverloading_datetime;

import java.time.LocalTime;
import java.util.Date;

public class DateTime01 {

    public static void main(String[] args) {

        Date currentDate = new Date();

        System.out.println(currentDate);

        System.out.println(currentDate.getTime());

        LocalTime myTime = LocalTime.now();

        System.out.println(myTime);
    }
}
