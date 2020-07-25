import java.util.Scanner;
 
public class App {
    public static void main(String[] args) {
         
        // Create scanner object
        Scanner input = new Scanner(System.in);
         
        // Output the prompt
        System.out.println("Enter an integer value: ");
         
        // Wait for the user to enter something.
        int  intvalue = input.nextInt();

        System.out.println("Enter a floating point value: ");
         
        // Wait for the user to enter something.
        double doublevalue = input.nextDouble();
         
        System.out.println("Enter a word: ");
         
        // Wait for the user to enter something.
        String wordvalue = input.next();
        
        input.nextLine();
         /* Expecting only a word from the previous user input.
        Therefore, moving on to the next line...... */

        System.out.println("Enter a line of text: ");
         
        // Wait for the user to enter something.
        String textvalue = input.nextLine();
          
         
        // Tell them what they entered.
        System.out.println("The integer value you entered: " + intvalue);
        System.out.println("The floating point value you entered: " + doublevalue);
        System.out.println("The word you entered: " + wordvalue);
        System.out.println("The line of text you entered: " + textvalue);
    }
}