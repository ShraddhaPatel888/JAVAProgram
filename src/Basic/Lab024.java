package Basic;

import java.sql.SQLOutput;

// while -> initialisation -> condition -> body -> increment/decrement
//Do While
// int ->body ->condition -> incre / decre
public class Lab024 {
    public static void main(String[] args) {
        int  a = 0;
        do {
            System.out.println(a);
            a--;
        }while(a> -5);
    }
}
