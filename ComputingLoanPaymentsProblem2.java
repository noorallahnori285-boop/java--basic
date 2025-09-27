
package computing.loan.payments.problem;

import java.util.Scanner;

public class ComputingLoanPaymentsProblem {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        System.out.println("please enter product orignal price");
        double productPrice = input.nextDouble();
        System.out.println("please enter sale tax");
        double saleTax = input.nextDouble();
        double taxAmount = (productPrice * saleTax)/100;
        double totalproductPrice = (productPrice * taxAmount);
        System.out.println("final product price is " + Math.round(totalproductPrice));
        
        
        System.out.println("please enter interst rate");
        double interstRate = input.nextDouble();
              System.out.println("please enter monthlyInterestRate");
        double monthlyInterestRate = input.nextDouble();
        
        System.out.println("please enter number of years");
        int numberOfYears = input.nextInt();
        System.out.println("please enter loan amount");
        double loanAmount = input.nextDouble();
        System.out.println("please enter computes monthly payment");
        double computesMonthlyPayment = input.nextDouble();
        double monthlyPayment = loanAmount * monthlyInterestRate /(1 - 1/Math.pow(1 + monthlyInterestRate,numberOfYears * 12));
        System.out.println("please enter total payment" + monthlyPayment);
        double totalPayment = input.nextDouble();
        
        
        
        
    
        
        
        
}
        
       
    }
    
