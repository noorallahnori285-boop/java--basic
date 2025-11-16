
package displayfourpatterns5.pkg18;

public class Displayfourpatterns518 {

    public static void main(String[] args) {
        // Display four patterns using loops from chapter 5.18
        System.out.println("pattern A:");
        System.out.println("==========");
        
        for (int i =1; i <=6; i++) {
            for (int j = 1; j<=i; j++) {
                System.out.print(j + " ");
            }
            System.out.println();
        }
        System.out.println("pattern B:");
        System.out.println("==========");
        for (int i = 6; i >= 1; i--) {
            for (int j = 1; j <= i; j++) {
                System.out.print(j + " ");
            }
            System.out.println();
        }
        
        System.out.println("pattern C:");
        System.out.println("==========");
        for (int i = 1; i <=6; i++) {
            for (int j = 1; j<= i; j++) {
                System.out.print(j + " ");
            }
            System.out.println();
        }
        
        System.out.println("pattern D:");
        System.out.println("==========");
        for (int i = 6; i >= 1; i--) {
            for (int j = 1; j <= i; j++) {
                System.out.print(j + " ");
            }
            System.out.println();
        }
    }
    
}
