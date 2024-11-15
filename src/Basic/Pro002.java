package Basic;

public class Pro002 {
    public static void main(String[] args) {

        int a =10;
        System.out.println(++a + a++ + a++);// ++a(11) + a++(11) + a++(12) =34

        int b = 10;
        System.out.println(--b + b++ + ++b);// --b(9) + b++(9) + ++b(11) = 29
    }
}
