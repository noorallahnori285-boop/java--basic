
package salarypaymentsystem;

import java.util.Scanner;

public class SalaryPaymentSystem {

    public static void main(String[] args) {
        // Salary payment system
        
        Scanner input = new Scanner(System.in);
        System.out.print("please enter number of employee: ");
        int lenght = input.nextInt();
        String[] employee = new String[lenght];
        int[] salary = new int[lenght];
        
        for (int x =0; x<lenght; x++) {
            System.out.println("please enter employee name : ");
            employee[x] = input.next();
            System.out.println("please enter " + employee[x] + " salary: ");
            salary[x] = input.nextInt();
        }
        int i = 0;
        for (String e : employee) {
            System.out.println((i+1) + "-> " + e + " = " + salary[i]);
            i++;
        }
        
        System.out.println();
        System.out.print("Now, chose an employee (enter number of employee): ");
        int employee_number = input.nextInt();
        System.out.print("Enter " + employee[employee_number] + " absent day: ");
        int absent = input.nextInt();
        System.out.print("Enter " + employee[employee_number] + " overtime hours: ");
        int overtime = input.nextInt();
        
        System.out.println(calcSalary(salary[employee_number-1], absent, overtime));
        
        
        
    }
    static int calcSalary(int gross_salary, int absent_day, int overtime_hours) {
        float salary_per_day = (float)gross_salary / (float)30;
        float salary_per_hours = (float)salary_per_day / (float)8;
        
        int absent_amount = (int)(absent_day * salary_per_day);
        int overtime_amount = (int)(overtime_hours * salary_per_hours);
        
        int net_salary = gross_salary - absent_amount + overtime_amount;
        
        return net_salary;
    }
    
}
