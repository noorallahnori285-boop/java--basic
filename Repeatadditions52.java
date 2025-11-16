
package repeatadditions5.pkg2;
import java.util.Scanner;

public class Repeatadditions52 {

    public static void main(String[] args) {
        // Reapeat additions from chapter 5.2
        Scanner input = new Scanner(System.in);
        /*final int NUMBER_OF_QUESTIONS = 5;
        int correctCount = 0;
        int count = 0;
        long startTime = System.currentTimeMillis();
        String output = "";
        while (count < NUMBER_OF_QUESTIONS) {
            int number1 = (int) (Math.random() * 10);
            int number2 = (int) (Math.random() * 10);
            if (number1 < number2) {
                int temp = number1;
                number1 = number2;
                number2 = temp;
            }
            System.out.println("what is " + number1 + "-" + number2 + "?");
            int answer = input.nextInt();
            if (number1 - number2 == answer) {
                System.out.println("you are correct");
            } else 
                System.out.println("your answer is wrong\n" + number1 + "-" + number2 + "?");
            count++;
            output += "\n" + number1 + "-" + number2 + "=" + answer + 
                    ((number1-number2==answer) ? "correct": "wrong");
            
        }
        long endTime = System.currentTimeMillis();
        long testTime = endTime - startTime;
        System.out.println("correct count is " + correctCount + 
                "\nTest time is " + testTime /1000 + "seconds\n" + output);*/
        final int NUMBER_OF_QUESTIONS = 10;
        int correctCount = 0;
        int count = 0;
        long startTime = System.currentTimeMillis();
        String output = "";
        while (count < NUMBER_OF_QUESTIONS) {
            int number1 = (int) (Math.random()* 15);
            int number2 = (int) (Math.random()* 15);
            if (number1 > number2) {
                int temp = number1;
                number1 = number2;
                number2 = temp;
            }
            System.out.println("what is " + number1 + "+" + number2 + "?");
            int answer = input.nextInt();
            if (number1 + number2 == answer) {
                System.out.println("you are correct");
            } else 
                System.out.println("your answer is wrong\n" + number1 + "+" + number2 + "?");
            count++;
            output += "\n" + number1 + "+" + number2 + "=" + answer +
                    ((number1+number2==answer) ? "correct": "worng");
        }
        long endTime = System.currentTimeMillis();
        long testTime = endTime - startTime ;
        System.out.println("correct count is " + correctCount +
                "\nTest time is " + testTime/1000 + "seconds\n" + output);
        
    }
    
}