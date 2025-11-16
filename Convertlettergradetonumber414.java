
package convertlettergradetonumber4.pkg14;
import java.util.Scanner;

public class Convertlettergradetonumber414 {

    public static void main(String[] args) {
        // convert letter grade to number 4.14
        Scanner input = new Scanner(System.in);
        System.out.println("Enter a letter grade");
        String letter = input.next();
        char ch = letter.charAt(0);
        ch = Character.toUpperCase(ch);
        if (ch == 'A')
            System.out.println("The numeric valude for grade A is " + 4);
        else if (ch == 'B')
            System.out.println("The numeric value for grade B is " + 3);
        else if (ch == 'C')
            System.out.println("The numeric value for grade C is " + 2);
        else if (ch == 'D')
            System.out.println("The numeric value for grade D is " + 1);
        else if (ch == 'F')
            System.out.println("The numeric value for grade F is " + 0);
        else 
            System.out.println(ch + " is an invalid grade");
    }
    
}
