import java.util.Scanner;
 
public class App {
    public static void main(String[] args) {
         
        // Create scanner object
        Scanner input = new Scanner(System.in);
         
        // Output the prompt
        System.out.println("Enter a floating point value: ");
         
        // Wait for the user to enter something.
        double value = input.nextDouble();
         
        // Tell them what they entered.
        System.out.println("You entered: " + value);


        // Read an entire line (as a String) from the system input (keyboard)
        String entireLine = input.nextLine();

        // Prints the read line to the system output after having transformed it to uppercase
        System.out.println(entireLine.toUpperCase());
    }
}