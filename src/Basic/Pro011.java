package Basic;

import java.util.Scanner;

public class Pro011 {
    public static void main(String[] args) {


        // Program to Check if a Year is a Leap Year or Not:


        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a year: ");
        int year = scanner.nextInt();

        // Check if the year is divisible by 4
        if (year % 4 == 0) {
            // If divisible by 100, it should also be divisible by 400 to be a leap year
            if (year % 100 == 0) {
                if (year % 400 == 0) {
                    System.out.println(year + " is a leap year.");
                } else {
                    System.out.println(year + " is not a leap year.");
                }
            } else {
                System.out.println(year + " is a leap year.");
            }
        } else {
            System.out.println(year + " is not a leap year.");
        }
            // other logic if((year % 4 ==0 &&SS year % 100 !==0) || year % 400 == 0)
        scanner.close();
    }

}
