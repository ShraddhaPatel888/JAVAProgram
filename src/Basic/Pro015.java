package Basic;

public class Pro015 {

    // JDK >13 new feature '->'

    public static void main(String[] args) {
        int itemCode = 001; // JDK  >13

        switch (itemCode) {
            case 001 -> System.out.println("001"); // '->' work as break
            case 002 -> System.out.println("002");
            case 003 -> System.out.println("003");
            default -> System.out.println("Default");

        }

                char ch = 'z';
                switch (ch){
                    case 'a','e','i','o','u' -> System.out.println("Vowel");
                    default -> System.out.println("Consonant");
                }




    }

}
