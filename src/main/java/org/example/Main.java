package org.example;

import java.sql.Time;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Date;
import java.util.Timer;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");
        Countdown();
    }

    public static void Countdown(){
        DateTimeFormatter dtf = DateTimeFormatter.ofPattern("HH:mm:ss");
        LocalDateTime now = LocalDateTime.now();

        String time = dtf.format(now);
        String test = "42";
        // String builder to remove : in time
        int num = Integer.valueOf(test);
        System.out.println(num);

        //for (int i = 10; i > 0; i--) {
            //System.out.println(i);
        //}
    }

}