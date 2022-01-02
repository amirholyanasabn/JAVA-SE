package com.amir;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        long shopSumPrice = 0;
        String bestOperatorName="";
        long bestSumPrice=0;
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        while (true){
            System.out.println("Please enter count of operator : (FOR EXIT PRESS 0)");
            try {
                int operatorCount =Integer.parseInt(reader.readLine());
                int remain = operatorCount;
                if (operatorCount != 0){
                    for (int i=0;i<operatorCount;i++){
                        System.out.println("Please enter name: ");
                        String name = reader.readLine();
                        System.out.println("Please enter Count of invoice :");
                        int invoiceCount = Integer.parseInt(reader.readLine());
                        int sum=0;
                        float avg = 0;
                        for (int j = 0; j <invoiceCount ; j++) {
                            System.out.printf("Please enter %d invoice",j+1);
                            System.out.println();
                            int sale = Integer.parseInt(reader.readLine());
                            sum+=sale;
                            shopSumPrice+=sum;
                        }
                        avg = sum/invoiceCount;
                        if (sum > 5000000){
                            System.out.println("Good");
                        }else {
                            System.out.println("Worst");
                        }
                        System.out.printf("invoice of %s is %d and avg is %.2f",name,sum,avg);
                        System.out.println();
                        remain-=1;
                        System.out.printf("remain %d operator",remain);
                        System.out.println();
                        if (sum > bestSumPrice){
                            bestSumPrice = sum;
                            bestOperatorName = name;
                        }
                    }
                }else break;
                System.out.printf("best operator is %s and best sum price is %d",bestOperatorName,bestSumPrice);
                System.out.println();
                System.out.println("Shop sum price is "+shopSumPrice);
            } catch (IOException e) {
                System.err.println("Invalid input for number of operator");
            }
        }
    }
}
