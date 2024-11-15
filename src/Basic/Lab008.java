package Basic;

import java.util.Optional;

public class Lab008 {
    public static void main(String[] args) {
        // String is group or a bunch of character
        // String is declared with 2 way which mention as bellow
        String name = "Shraddha"; // with Assignment Optional
        String name2 = new String("Shraddha");// with New Optional
        //Both of them, save name,name2 different way in JVM

        System.out.println(name);
        System.out.println(name2);
        System.out.println("My name is -> " + name);
        System.out.printf("My name is -> %s", name);
    }
}
