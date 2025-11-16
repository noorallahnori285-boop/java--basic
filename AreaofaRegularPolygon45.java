
package areaofaregularpolygon.pkg4.pkg5;

import java.util.Scanner;

public class AreaofaRegularPolygon45 {

    public static void main(String[] args) {
        // The area of a regular polygon 4.5
        Scanner input = new Scanner(System.in);
        System.out.println("please enter The number of side");
        double n = input.nextDouble();
        System.out.println("please enter the side");
        double s = input.nextDouble();
        double area = n * Math.pow(s, 2) / (4 * Math.tan(Math.PI/n));
        System.out.println("The area of a regular polygon is:" + area);
        
    }
    
}
