package com.amir;

import java.io.IOException;
import java.time.LocalDateTime;
import java.util.Date;

public class App
{
    public static void main( String[] args )
    {
        LocalDateTime dateTime = LocalDateTime.now();
        if (dateTime.getHour() < 8 ){
            System.out.println("Time is "+dateTime.getHour()+" Working day not start yet.");
            return;
        }
        Utilities.showDayMessage(dateTime);
        System.out.println("---------------------------------");
        if ( dateTime.getDayOfWeek().equals("FRIDAY") ){
            System.out.println("The repair shop is closed today.");
        }else {
            while (true){
                Utilities.showMenu();
                System.out.println("---------------------------------");
                try {
                    int menu = Utilities.getMenu();
                    switch (menu){
                        case 0 :
                            System.out.println("Goodbye");
                            return;


                    }
                } catch (IOException e) {
                    System.err.print("Invalided input....");
                }
            }

        }
    }
}
