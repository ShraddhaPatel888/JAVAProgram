package Basic;

public class Pro003 {
    public static void main(String[] args) {

        int x = 10;
        float y = 12.4f;
        float z = 56.78f;
        double result =  Math.cbrt(Math.pow(x,2) + Math.pow(y,2) - Math.abs(z));

        System.out.println(result);
    }
}
