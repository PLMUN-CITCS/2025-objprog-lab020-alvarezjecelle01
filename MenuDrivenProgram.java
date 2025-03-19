import java.util.Scanner;

public class MenuDrivenProgram {

    // Main method - entry point of the program
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int choice;

        // Loop to display the menu until the user chooses to exit
        while (true) {
            // Display the menu to the user
            displayMenu();

            // Get user's choice
            choice = scanner.nextInt();

            // Handle the user's choice and take appropriate action
            handleMenuChoice(choice);

            // Exit the loop if the user chooses option 3 (Exit)
            if (choice == 3) {
                break;
            }
        }

        scanner.close(); // Close the scanner when done
    }

    // Method to display the menu to the user
    public static void displayMenu() {
        System.out.println("\nMenu:");
        System.out.println("1. Greet User");
        System.out.println("2. Check Even/Odd");
        System.out.println("3. Exit");
        System.out.print("Enter your choice (1-3): ");
    }

    // Method to handle the user's menu choice
    public static void handleMenuChoice(int choice) {
        Scanner scanner = new Scanner(System.in); // Create a new scanner instance to take input

        // Execute corresponding action based on user's choice
        if (choice == 1) {
            greetUser();
        } else if (choice == 2) {
            checkEvenOrOdd(scanner);
        } else if (choice == 3) {
            System.out.println("Exiting program. Goodbye!");
        } else {
            System.out.println("Invalid choice. Please select a valid option (1-3).");
        }
    }

    // Method to greet the user
    public static void greetUser() {
        System.out.println("Hello! Welcome!");
    }

    // Method to check if the entered number is even or odd
    public static void checkEvenOrOdd(Scanner scanner) {
        System.out.print("Enter an integer: ");
        int number = scanner.nextInt();

        // Check if the number is even or odd
        if (number % 2 == 0) {
            System.out.println(number + " is an Even number.");
        } else {
            System.out.println(number + " is an Odd number.");
        }
    }
}
