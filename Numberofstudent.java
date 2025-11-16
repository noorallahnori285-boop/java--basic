
package numberofstudent;

import java.util.Scanner;

public class Numberofstudent {

    public static void main(String[] args) {
        // number of student 
        Scanner input = new Scanner(System.in);
        System.out.print("How many subject did you study in current semester: ");
        int totalSubject = input.nextInt();
        int[] score = new int[totalSubject];
        
        for (int x =0; x<totalSubject; x++) {
            System.out.print("Enter score : ");
            score[x] = input.nextInt();
        }
        
        int totalscore = sum(score);
        System.out.println("Your total score is :" + totalscore);
        float averag = (float)totalscore /(float)totalSubject;
        System.out.println("Your averag score is :" + averag);
        System.out.println("Your maximum number is : " + max(score));
        System.out.println("Your minimum number is : " + min(score));
    }
    
    static int max(int[] numbers) {
        int max = numbers[0];
        for (int n : numbers) {
            if (n > max) {
                max = n;
            }
        }
        return max;
    }
    
    static int min(int[] numbers) {
        int min = numbers[0];
        for (int n : numbers) {
            if (n < min ) {
                min = n;
            }
        }
        return min;
    }
    
    static int sum(int[] numbers) {
        int total = 0;
        for (int n : numbers) {
            total = total + n;
        }
        return total;
    }
    
}
