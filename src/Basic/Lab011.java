package Basic;

public class Lab011 {
    public static void main(String[] args) {
        String n1 = "My name is Shraddha";//SCP
        String n2 = "My Name Is Shraddha";//SCP
        String n3 = new String ("My name is Shraddha");//Head area
        String n4 = "My name is Shraddha";


        System.out.println(n1 == n2); // Check the references in memory
        System.out.println(n1 == n4); // Check the references in memory
        System.out.println(n1 == n3); // Check the references in memory
        System.out.println(n1.equals(n3));// check the Value
        System.out.println(n1.equals(n2));// check the Value
    }
}

