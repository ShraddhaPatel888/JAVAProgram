package Basic;

import java.util.Scanner;

public class Pro020 {
     //Find the Sum of Array Elements


        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);
            System.out.print("Enter the number of elements: ");
            int n = scanner.nextInt();

            int[] arr = new int[n];
            System.out.println("Enter the elements of the array:");

            for (int i = 0; i < n; i++) {
                arr[i] = scanner.nextInt();
            }

            int sum = 0;
            for (int num : arr) {
                sum += num;
            }

            System.out.println("Sum of elements: " + sum);
        }
    }


