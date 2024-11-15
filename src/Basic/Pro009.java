package Basic;

import java.util.Scanner;

public class Pro009 {
    public static void main(String[] args) {


        // Program to Check if a Character is a Vowel or a Consonant.


        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a character: ");
        char ch = scanner.next().charAt(0);

        // Convert to lowercase to handle both uppercase and lowercase characters
        ch = Character.toLowerCase(ch);

        // Check if the character is a vowel
        if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u') {
            System.out.println(ch + " is a vowel.");
        }
        // Check if the character is a consonant
        else if ((ch >= 'a' && ch <= 'z')) {
            System.out.println(ch + " is a consonant.");
        }
        // If the character is neither a vowel nor a consonant
        else {
            System.out.println(ch + " is not a valid alphabet.");
        }


        scanner.close();
    }
}
