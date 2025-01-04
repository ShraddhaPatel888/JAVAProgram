package Basic;

import java.util.Scanner;

public class Pro019 {
    public static void main(String[] args) {
        //Create an Array and Input Elements from the User


                Scanner scanner = new Scanner(System.in);
                System.out.print("Enter the size of the array: ");
                int size = scanner.nextInt();

                int[] arr = new int[size];
                System.out.println("Enter " + size + " elements:");

                for (int i = 0; i < size; i++) {
                    arr[i] = scanner.nextInt();
                }

                System.out.println("You entered:");
                for (int num : arr) {
                    System.out.print(num + " ");
                }
            }
        }

