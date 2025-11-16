
package vowelorconsonant.pkg4.pkg13;
import java.util.Scanner;
public class Vowelorconsonant413 {

    public static void main(String[] args) {
        // vowel or consonant from chapter 4.13
        Scanner input = new Scanner(System.in);
        System.out.println("enter a letter");
        String letter = input.next();
        if (letter.length() != 1) {
            System.out.println("invalid input");
            return;
        }
        char ch = letter.charAt(0);
        if (!Character.isLetter(ch)) {
            System.out.println(ch + "is an invalid input");
            return;
        } else {
            ch = Character.toLowerCase(ch);
        }
        if (ch == 'a' || ch == 'i' || ch == 'o' || ch == 'v' || ch == 'e') {
            System.out.println(ch + "is an vowel ");
        } else {
            System.out.println(ch + "is a consonant");
        }
    } 
}
