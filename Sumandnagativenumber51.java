
package sumandnagativenumber5.pkg1;
import java.util.Scanner;

public class Sumandnagativenumber51 {
    public static void main(String[] args) {
        // Count positive and negative numbers and compute the average of numbers)
        Scanner input = new Scanner(System.in);
        System.out.println("Please enter an integer the input ends if it is 0:");
        int number;
        int positives = 0;
        int negatives = 0;
        int total = 0;
        while (true) {
            number = input.nextInt();
            if (number == 0) {
                break;
            }
            if (number > 0) {
                positives++;
            } else if (number < 0) {
                negatives++;
            }
            total += number;
        }
        double average = (double) total / positives + negatives;
        System.out.println("The number of positives is :" + positives);
        System.out.println("The number of negatives is :" + negatives);
        System.out.println("The total number of is : " + total);
        System.out.println("The average is:" + average);
        
    }
    
}
