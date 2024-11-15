package Basic;

public class Lab009 {
    public static void main(String[] args) {
        // String is a class
        // It is immutable and non-primitive data type
        // Immutable - value of string is not change in memory, eg.
        String name = "Shraddha";
        name = "Patel"; //"Shraddha" value is still memory occupied in memory and create new space for "Patel". Solution is String Buffer and String Builder
        System.out.println(name);
    }
}
