package org.example;

import java.time.*;
import java.time.zone.ZoneRules;
import java.util.Scanner;

public class LocalTimeTest {
    public static void main(String[] args) {

//        LocalTime lt=LocalTime.now();
//        //System.out.println(lt);
//        int hour = lt.getHour();
//        int minute = lt.getMinute();
//        int second = lt.getSecond();
//        int nano = lt.getNano();
//        System.out.printf("%d: %d: %d :%d", hour, minute, second,nano);
//
//        //LocalDate Calss:...
//
//        LocalDate d=LocalDate.now();
//        int dayOfMonth = d.getDayOfMonth();
//        Month month = d.getMonth();
//        int year = d.getYear();
//        System.out.printf("\n %d %s %d", dayOfMonth, month, year);
//

        //LocalDateTime Class:.....

//        LocalDateTime dt=LocalDateTime.now();
//        //System.out.println(dt);
//        int dayOfMonth = dt.getDayOfMonth();
//        int month = dt.getMonthValue();
//        int year = dt.getYear();
//        System.out.printf(" %d-%d-%d", dayOfMonth, month, year);
//
//        int hour = dt.getHour();
//        int minute = dt.getMinute();
//        int second = dt.getSecond();
//        int nano = dt.getNano();
//        System.out.printf(" \n %d:%d:%d:%d", hour, minute, second,nano);


//        LocalDateTime ld=LocalDateTime.of(2024,2,29,15,51);
//
//        //Two Days Before.
//        LocalDateTime localDateTime = ld.minusDays(2);
//        System.out.println(localDateTime);
//        DayOfWeek dayOfWeek1 = localDateTime.getDayOfWeek();
//        System.out.println(dayOfWeek1);
//
//        //After 3 Days.
//        LocalDateTime localDateTime1 = ld.plusDays(3);
//        System.out.println(localDateTime1);
//        DayOfWeek dayOfWeek2 = localDateTime1.getDayOfWeek();
//        System.out.println(dayOfWeek2);
//        //After One Week.
//        LocalDateTime localDateTime2 = ld.plusWeeks(2);
//        System.out.println(localDateTime2);
//
//        DayOfWeek dayOfWeek3 = localDateTime2.getDayOfWeek();
//        System.out.println(dayOfWeek3);
//        //Before One Week.
//        LocalDateTime localDateTime3 = ld.minusWeeks(2);
//        System.out.println(localDateTime3);
//        DayOfWeek dayOfWeek = localDateTime3.getDayOfWeek();
//        System.out.println(dayOfWeek);


        //Find Date Of Birth.
//
//        LocalDate ld=LocalDate.of(2002,02,05);
//
//        LocalDate ld1=LocalDate.now();
//
//        Period p=Period.between(ld,ld1);
//        int years = p.getYears();
//        int days = p.getDays();
//        int months = p.getMonths();
//
//        int i = years * 365 + months * 30 + days;
//
//        System.out.println("Total Year:"+years);
//        System.out.println("Total Month:"+months);
//        System.out.println("Total Days:"+days);
//        System.out.println("Total days From Birth:"+i);

//        LocalDate ld=LocalDate.of(2002*60,02,05);
//
//        LocalDate ld1=LocalDate.now();
//        Period p=Period.between(ld1,ld);
//        int i = p.getYears() * 365 + p.getMonths() * 30 + p.getDays();
//        System.out.println(i);

        //Check Given Year is leap Year Or Not.

//        Scanner s=new Scanner(System.in);
//        System.out.println("Ente a Year:");
//        int i = s.nextInt();
//
//        Year y=Year.of(i);
//        if(y.isLeap()){
//            System.out.println("Yes It Is Leap Year:"+y);
//        }else{
//            System.out.println("No Not Leap Year");
//        }

//        ZoneId id=ZoneId.systemDefault();
//        System.out.println(id);
//        String id1 = id.getId();
//        System.out.println(id1);
//        ZoneRules rules = id.getRules();
//        System.out.println(rules);

//        ZoneId id=ZoneId.of("Australia/Sydney");
//
//        LocalDateTime lt=LocalDateTime.now(id);
//        System.out.println(lt);



        //Year Class.
        Year y=Year.now();
        System.out.println(y);

        boolean leap = y.isLeap();
        System.out.println(leap);

        Year year = y.minusYears(1);
        System.out.println(year);

        Year year1 = y.plusYears(1);
        System.out.println(year1);

        if(year1.isAfter(year)){
            System.out.println("Yes");
        }else{
            System.out.println("No");
        }

        if(year1.isBefore(year)){
            System.out.println("Yes");
        }else {
            System.out.println("No");
        }
    }
}
