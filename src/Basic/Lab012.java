package Basic;

public class Lab012 {
    public static void main(String[] args) {
        String password = "Shraddha@123";
        String pass_u = password.toLowerCase();

        System.out.println(pass_u == password); // check the references
        System.out.println(pass_u.equals(password)); //check the values
        System.out.println(pass_u.equalsIgnoreCase(password) ); // check and ignore values

        System.out.println(password.substring(0,3));
        System.out.println(password.indexOf("h"));
        System.out.println(password.indexOf("h "));
    }
}
