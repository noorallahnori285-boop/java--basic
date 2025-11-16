
package areaofahexagon4.pkg4;

import java.util.Scanner;

public class AreaofaHexagon44 {

    public static void main(String[] args) {
        //area of a hexagon 4.4
        Scanner input = new Scanner(System.in);
        System.out.println("please enter a side");
        double s = input.nextDouble();
        double area = 6 * Math.pow(s, 2) / (4 * Math.tan(Math.PI/6));
        System.out.println("The area of a hexagon is:" + area);
    }  
}
