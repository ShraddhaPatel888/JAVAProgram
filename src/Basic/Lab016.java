package Basic;

import java.util.Scanner;

public class Lab016 {
    public static void main(String[] args) {
        // Taking an input from the user
        //scanner Class
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Number");
        int num = sc.nextInt();
        if (num%2 == 0)
        {
            System.out.println("Even");
        }
        else {
            System.out.println("odd");
        }
    }
}
