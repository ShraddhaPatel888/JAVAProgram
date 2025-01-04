package Basic;

public class Lab025 {
    public static void main(String[] args) {
        /*
        -Array
        -Collection of similar data type
        -two-way to declare it
        1. int [] a = {1,25,55,36};
        2. int [] b = new [5];
            b[0] = 10;
            b[1] = 10;
            b[2] = 10;
            b[3] = 10;
            b[4] = 10;
        */

        int[] a = {10,20,30,40,50};
        System.out.println(a); // is print the reference value
        System.out.println(a[0]);
        System.out.println(a[1]);
        System.out.println(a[2]);
        System.out.println(a[3]);
        System.out.println(a[4]);
        System.out.println(a.length);
        System.out.println(a[5]); // ArrayIndexOutOfBoundsException
        System.out.println(a[-1]); // ArrayIndexOutOfBoundsException

    }
}
