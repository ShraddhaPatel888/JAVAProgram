package Basic;

public class Lab006 {
    public static void main(String[] args) {
        int a = 10;

        System.out.println(a-- + --a + a--);
        // part-1  a-- -> Expretion1 = 10 ; valut a=9
        // part-2  --a -> Expretion1 = 8 ; valut a=8
        // part-3  a-- -> Expretion1 = 8 ; valut a=7

        System.out.println(a);
    }
}
