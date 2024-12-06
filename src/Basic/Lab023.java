package Basic;

import java.util.Scanner;

/*      Factorial Program
            1! - 1
            2! = 1*2
            .
            .
            .
            6! - 6*5*4*3*2*1
                 */
public class Lab023 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        long fact = 1;
        for (int i = 1; i <= num; i++) {
            fact = fact * i;
        }
        System.out.println(fact);
        sc.close();
    }
}
