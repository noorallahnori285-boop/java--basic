
package showsevenoroddnumber;

import java.util.Scanner;
        
public class ShowsEvenorOddNumber {
    
    public static void main(String[] args) {
        // This program is shows even or odd number
        Scanner input = new Scanner(System.in);
        System.out.println("please inter number");
        int x = input.nextInt();
        if (x == 0)
            System.out.println("Zero");
        else
            if (x % 2 == 0)
                System.out.println("Even");
        else
                System.out.println("Odd");
        
        
    }
    
}
