
package phonekeypads4.pkg15;
import java.util.Scanner;

public class Phonekeypads415 {

    public static void main(String[] args) {
        // phone key pads from chapter 4.15 (if)
        Scanner input = new Scanner(System.in);
        /*System.out.println("Enter a letter");
        char ch = input.next().charAt(0);       // or String letter = input.next(); char ch = letter.chartAt(0); it is correct
        ch = Character.toUpperCase(ch);
        if (ch == 'A' || ch == 'B' || ch == 'C')
            System.out.println("The corresponding number is " + 2);
        else if (ch == 'D' || ch == 'E' || ch == 'F')
            System.out.println("The corresponding number is " + 3);
        else if (ch == 'G' || ch == 'H' || ch == 'I')
            System.out.println("The corresponding number is " + 4);
        else if (ch == 'J' || ch == 'K' || ch == 'L')
            System.out.println("The corresponding number is " + 5);
        else if (ch == 'M' || ch == 'N' || ch == 'O')
            System.out.println("The corresponding number is " + 6);
        else if (ch == 'P' || ch == 'Q' || ch == 'R' || ch == 'S')
            System.out.println("The corresponding number is " + 7);
        else if (ch == 'T' || ch == 'U' || ch == 'V')
            System.out.println("The corresponding number is " + 8);
        else if (ch == 'W' || ch == 'X' || ch == 'Y' || ch == 'Z')
            System.out.println("The corresponding number is " + 9);
        else 
            System.out.println(ch + " is an invalid input");*/
        // switch
        System.out.println("Enter a letter");
        char ch = input.next().charAt(0);
        ch = Character.toUpperCase(ch);
        switch (ch) {
            case 'A': case 'B': case 'C':
                System.out.println("The corresponding number is " + 2);
                break;
            case 'D': case 'E': case 'F':
                System.out.println("The corresponding number is " + 3);
                break;
            case 'G': case 'H': case 'I':
                System.out.println("The corresponding number is " + 4);
                break;
            case 'J': case 'K': case 'L':
                System.out.println("The corresponding number is " + 5);
                break;
            case 'M': case 'N': case 'O':
                System.out.println("The corresponding number is " + 6);
                break;
            case 'P': case 'Q': case 'R': case 'S':
                System.out.println("The corresponding number is " + 7);
                break;
            case 'T': case 'U': case 'V':
                System.out.println("The corresponding number is " + 8);
                break;
            case 'W': case 'X': case 'Y': case 'Z':
                System.out.println("The corresponding number is " + 9);
                break;
            default:
                System.out.println(ch + " is an invalid input");
            
                
                
        }
    }
    
}
