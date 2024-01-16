import java.util.Scanner;

public class UserInput {
    public static void main(String[] args) {
        // Create a Scanner object to read input
        Scanner scanner = new Scanner(System.in);
        
        // Prompt the user for input
        System.out.print("Enter something: ");
        
        // Read a line of text from the user
        String userInput = scanner.nextLine();
        
        // Display the user's input
        System.out.println("You entered: " + (userInput + 75));
        
        // Close the Scanner
        scanner.close();
    }
}
