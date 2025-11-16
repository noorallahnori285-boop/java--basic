
package findasciicode4.pkg8;

import java.util.Scanner;

public class FindAsciiCode48 {

    public static void main(String[] args) {
        // find the character of an ASCII code 
        Scanner input = new Scanner(System.in);
        /*System.out.println("Enter an ASCII code");
        int code = input.nextInt();
        char ch = (char) code;
        System.out.println("The character for ASCII code" + code + " is:" + ch);
        */
        // find the unicode of a character
        System.out.println("Enter a character");
        char ch = input.next().charAt(0);
        int code = (int) ch;
        System.out.println("The unicode for the character " + ch + " is: " + code);
    }
    
}
