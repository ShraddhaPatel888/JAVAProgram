package Basic;

public class Lab005 {
    public static void main(String[] args) {
        int a=10;

        System.out.println(a++ + ++a + a++);
        // part-1  a++ -> Expretion1 = 10 ; valut a=11
        // part-2  ++a -> Expretion1 = 12 ; valut a=12
        // part-3  ++a -> Expretion1 = 12 ; valut a=13

        System.out.println(a);

    }
}
