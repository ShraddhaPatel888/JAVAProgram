package Basic;

import java.util.Scanner;

public class Pro012 {
    public static void main(String[] args) {

        //Program to Check if a Number is Prime or Not
        //Prime numbers between 1 and 100:
        //2 3 5 7 11 13 17 19 23 29 31 37 41 43 47 53 59 61 67 71 73 79 83 89 97


        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int number = scanner.nextInt();

        // Check if the number is prime
        boolean isPrime = true;
        if (number <= 1) {
            isPrime = false;
        } else {
            for (int i = 2; i <= Math.sqrt(number); i++) {
                if (number % i == 0) {
                    isPrime = false;
                    break;
                }
            }
        }

        // Output the result
        if (isPrime) {
            System.out.println(number + " is a prime number.");
        } else {
            System.out.println(number + " is not a prime number.");
        }

        scanner.close();
    }
}
