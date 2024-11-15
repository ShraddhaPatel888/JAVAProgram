package Basic;

public class Lab014 {
    public static void main(String[] args) {
        // using ternary operator
        // Max and min between a and b
        int a = 10;
        int b= 20;
        int max = a<b ? b: a;
        int min = a<b ? a: b;

        System.out.println(max);
        System.out.println(min);

    }
}
