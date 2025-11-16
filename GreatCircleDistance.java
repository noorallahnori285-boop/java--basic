
package great.circle.distance;

import java.util.Scanner;

public class GreatCircleDistance {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter piont 1 (latitued and longitude) in degrees");
        double x1 = input.nextDouble();
        double y1 = input.nextDouble();
        x1 = Math.toRadians(x1);
        y1 = Math.toRadians(y1);
        System.out.println("Enter piont 2 (latitued and longitude) in degrees");
        double x2 = input.nextDouble();
        double y2 = input.nextDouble();
        x2 = Math.toRadians(x2);
        y2 = Math.toRadians(y2);
        double radius = 6371.01;
        double d = radius * Math.acos(Math.sin(x1) * Math.sin(x2) + Math.cos(x1) * Math.cos(x2) * Math.cos(y1 - y2));
        System.out.println("The distance between two piont is:" + d + "(KM)");
    }
    
}
