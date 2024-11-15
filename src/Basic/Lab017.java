package Basic;

import java.util.Map;
import java.util.Scanner;

public class Lab017 {
    // Find the max value, get input from the user
    public static void main(String[] args) {
        System.out.println("Enter the value1");
        Scanner sc = new Scanner(System.in);
        int num1 = sc.nextInt() ;

        System.out.println("Enter the value2");
        int num2 = sc.nextInt() ;

        int max = Math.max(num1, num2);
        System.out.println("max by Math.max fun()===" + max);

        if (num1>num2){
            System.out.println("Max is "+num1);
        }else{
            System.out.println("Max is "+num2);
        }
        sc.close();

    }

}
