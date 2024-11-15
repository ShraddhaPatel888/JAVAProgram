package Basic;

public class Lab010 {
    public static void main(String[] args) {
        // Non-primitive type because it has extra functionality as below
        String name = "Shraddha";

        System.out.println("Upper case=="+name.toUpperCase());

        System.out.println("Lower case=="+name.toLowerCase());

        System.out.println("Length case=="+name.length());

        System.out.println("Replace case=="+name.replace("a","z"));

        char c = name.charAt(3);
        //         |0|1|2|3|4|5|6|7|8|
        System.out.println(c);

        boolean result = name.contains("d");
        System.out.println(result);

        name = name.concat(" Patel");
        System.out.println(name);






    }
}
