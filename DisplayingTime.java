
package displayingtime;

import java.util.Scanner;

public class DisplayingTime {

    public static void main(String[] args) {
      //Displaying Time:   Write a program that obtains minutes and remaining seconds from seconds. 
      Scanner input = new Scanner(System.in);
        System.out.println("please enter total seconds");
        int totalSeconds = input.nextInt();
        int minutes = totalSeconds / 60;
        System.out.println("This is a minutes:" + minutes);
        int remainingSeconds = totalSeconds % 60;
        System.out.println("This is a remainingSeconds:" + remainingSeconds);

    }
    
}
