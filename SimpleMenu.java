import java.util.Scanner;

public class MenuDrivenProgram {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int choice;

        // Loop until the user chooses to exit (choice 3)
        while (true) {
            // Display the menu
            displayMenu();

            // Get the user's choice
            choice = scanner.nextInt();

            // Handle the user's menu choice
            handleMenuChoice(choice);

            // Exit the loop if choice 3 is selected
            if (choice == 3) {
                break;
            }
        }

        scanner.close(); // Close the scanner when done
    }

    // Method to display the menu
    public static void displayMenu() {
       
