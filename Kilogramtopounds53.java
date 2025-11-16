
package kilogramtopounds5.pkg3;

//import java.util.Scanner;

public class Kilogramtopounds53 {

    public static void main(String[] args) {
        // conversion from kilograms to pounds
        /*Scanner input = new Scanner(System.in);   /این را از یوزر گرفتم
        System.out.println("Please enter a kilogram");
        double kilogram = input.nextDouble();
        double pounds = kilogram * 2.2;
        //System.out.printf("%.1f kilogram = %.1f pounds%n", kilogram,pounds);
        System.out.println("The kilogram to pounds is :" + pounds);*/
        System.out.println("kilogram    pounds");
        System.out.println("--------    -------");
        for (int kilogram = 1; kilogram <=199; kilogram += 2) {
            double pounds = kilogram * 2.2;
            System.out.printf("%-12d%6.1f%n", kilogram,pounds);
            
        }
    }
    
}
