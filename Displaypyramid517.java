
package displaypyramid5.pkg17;
import java.util.Scanner;

public class Displaypyramid517 {

    public static void main(String[] args) {
        // Disply pyramid from chapter 5.17
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the number of lines between 1 and 15 :");
        int numberOfLines = input.nextInt();
        
        if (numberOfLines < 1 ||numberOfLines > 15) {
            System.out.print("please enter number of between 1 and 15");
            return;
        }
        for (int currentLine = 1; currentLine<=numberOfLines; currentLine++) {
            
            for (int space = 1; space <= (numberOfLines - currentLine) * 2; space++) {
                System.out.print(" ");
            }
            for (int number = currentLine; number >= 1; number--) {
                System.out.printf("%2d", number);
                System.out.print(" ");
            }
            for (int number = 2; number <= currentLine; number++) {
                System.out.printf("%2d", number);
                System.out.print(" ");
            }
            System.out.println();
        }
        input.close();
    }
    
}
