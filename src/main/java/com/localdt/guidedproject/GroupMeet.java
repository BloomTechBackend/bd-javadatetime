package com.localdt.guidedproject;



import java.time.*;
import java.time.format.DateTimeFormatter;
import java.time.format.FormatStyle;
import java.util.Scanner;

public class GroupMeet {
    public static void main(String[] args) {
        LocalDateTime ldt = LocalDateTime.now();
        //warm up examples


        LocalDateTime ldt1 = ldt.plusHours(8);
        System.out.println(ldt1);
        //15 minutes earlier
        LocalDateTime ldt2 = ldt.minusMinutes(15);
        System.out.println(ldt2);
        //5 years from now
        LocalDateTime ldt3 = ldt.plusYears(5);
        System.out.println(ldt3);
        //Last year same time
        LocalDateTime ldt4 = ldt.minusYears(1);
        System.out.println(ldt4);
        //
        LocalDateTime ldt5 = LocalDateTime.of(2019, Month.MARCH, 28, 14, 33);
        System.out.println(ldt5);
        //booleans

        boolean checkNotTime = ldt1.isBefore(ldt3);














        //get all ZoneIds
        // ZoneId.getAvailableZoneIds().forEach(System.out::println);
        //Europe/Dublin
        //America/New_York
        //America/Chicago
        //America/Los_Angeles






    }



}











