
package arrayexample;
import java.util.Scanner;

public class Arrayexample {

    public static void main(String[] args) {
        // Array of example 
        Scanner input = new Scanner(System.in);
        String[] months = {"jan","feb","mar","apr","may","jun","jul","aug","sep","oct","nov","dec"};
        System.out.println("Enter a month number (1 to 12):");
        int monthNumber = input.nextInt();
        System.out.println("The month is :" + months[monthNumber-1]);
    }
}