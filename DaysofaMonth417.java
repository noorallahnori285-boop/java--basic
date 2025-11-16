
package daysofa.month4.pkg17;
import java.util.Scanner;

public class DaysofaMonth417 {

    public static void main(String[] args) {
        // Days of a month from chapter 4.17
        Scanner input = new Scanner(System.in);
        // we use switch
        /*System.out.println("Enter a year");
        int year = input.nextInt();
        System.out.println("Enter a month");
        String month = input.next();
        month = month.toLowerCase();
        switch (month) {
            case "jan": case "mar": case "may": case "jul": case "aug": case "oct": case "dec":
                System.out.println(" month " + month + " in " + year + " has 31 days");
                break;
            case "apr": case "jun": case "sep": case "nov": 
                System.out.println("month " + month + " in " + year + " has 30 days");
                break;
            case "feb":
                boolean isLoap = (year % 4 == 0 && year % 400 == 0 || year % 100 != 0 );
                int days = isLoap ? 29: 28;
                System.out.println("feb" + year + "has" + days + "days");
            default:
                System.out.println("it is not correct");
                
        }*/
        // we use if
        System.out.println("Enter a year");
        int year = input.nextInt();
        System.out.println("Enter a month");
        String month = input.next();
        month = month.toLowerCase();
        if (month.equals("jan") || month.equals("mar") || month.equals("may") || month.equals("jul") || month.equals("aug") || month.equals("oct") || month.equals("dec")) {
            System.out.println("month " + month + " in " + year + " has 31 days");
        }
        else if (month.equals("apr")|| month.equals("jun") || month.equals("sep") || month.equals("nov")) {
            System.out.println("month " + month + " in " + year + " has 30 days");
        }
        else if (month.equals("feb")) {
             boolean isLoap =  (year % 4 == 0 && year % 400 == 0 || year % 100 != 0 );
             if (isLoap)
                 System.out.println("feb " + year + "has 29 days");
             else 
                 System.out.println("feb " + year + "has 28 days");
        }
        else {
            System.out.println(month + " is not correct");
        }
        
    }
    
}
