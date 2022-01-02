package com.amir;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.time.LocalDateTime;

public class Utilities {
    public static void showDayMessage(LocalDateTime time){
        System.out.println("Today is : "+time.getDayOfWeek());
        System.out.println("Date is : "+time.getYear()+"/"+time.getMonth()+"/"+time.getDayOfMonth());
        System.out.println("Time is  "+time.getHour()+":"+time.getMinute());
        switch (time.getDayOfWeek()){
            case SATURDAY:
                System.out.println("شنبه به خیر");
                break;
            case SUNDAY:
                System.out.println("یکشنبه به خیر");
                break;
            case MONDAY:
                System.out.println("دوشنبه به خیر");
                break;
            case TUESDAY:
                System.out.println("سه شنبه به خیر");
                break;
            case THURSDAY:
                System.out.println("چهارشنبه به خیر");
                break;
            case WEDNESDAY:
                System.out.println("پنجشنبه به خیر");
                break;
            case FRIDAY:
                System.out.println("جمعه به خیر");
                break;
        }
    }
    public static void showMenu(){
        System.out.println("0 : EXIT");
        System.out.println("1 : ENTER CAR");
        System.out.println("2 : SHOW REMAIN,ENTERED,EXITED");
        System.out.println("3 : SHOW CAR DETAIL");
        System.out.println("4 : EXIT CAR");
    }
    public static int getMenu() throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Please enter your choice:");
        int choice = Integer.parseInt(reader.readLine());
        return choice;
    }
}
