package Basic;

public class Pro001 {
    public static void main(String[] args) {

        // Max value of 3 number

        int a = 48;
        int b = 2;
        int c = 15;

        int max = (a > b) ? ((a > c) ? a : c) : ((b > c) ? b : c);

        System.out.println("Maximum of the three numbers is: " + max);
    }
}
