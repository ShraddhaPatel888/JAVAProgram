package Basic;

import java.util.Scanner;

public class Pro008 {
    public static void main(String[] args) {


        // Program to Find the Largest Among Three Numbers:


        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter three numbers:");

        double num1 = scanner.nextDouble();
        double num2 = scanner.nextDouble();
        double num3 = scanner.nextDouble();

        double largest = num1;

        if (num2 > largest) {
            largest = num2;
        }

        if (num3 > largest) {
            largest = num3;
        }

        System.out.println("The largest number is: " + largest);

        scanner.close();
    }
}
