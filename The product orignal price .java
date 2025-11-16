
package javaapplication24;

import java.util.Scanner;

public class JavaApplication24 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("please enter product orignal price");
        double productPrice = input.nextDouble();
        System.out.println("please enter sale tax");
        double saleTax = input.nextDouble();
        double taxAmount = (productPrice * saleTax) /100;
        double totalproductPrice = (productPrice + taxAmount);
       
        System.out.println("final product price is %.2f " + Math.ceil(totalproductPrice));
        
        
        
        
    }
    
}
