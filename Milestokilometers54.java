
package milestokilometers5.pkg4;
//import java.util.Scanner;

public class Milestokilometers54 {

    public static void main(String[] args) {
        // conversion from miles to kilometers 
        /*Scanner input = new Scanner(System.in);
        System.out.println("please enter a miles");
        double miles = input.nextDouble();
        double kilometers = miles * 1.609;
        System.out.println(kilometers);*/
        
        System.out.println("miles   kilometers");
        System.out.println("-----   --------");
        for (int miles =1; miles <=199; miles += 2) {
            double kilometers = miles * 1.602;
            System.out.printf("%-12d%6.1f%n", miles,kilometers);
        }
    }
    
}
