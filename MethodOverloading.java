public class MethodOverloading {
    
    public static void main(String[] args) {
        // Call the overloaded printValue methods with different argument types
        printValue(10);         // Integer argument
        printValue(3.14);       // Double argument
        printValue("Hello!");   // String argument
    }

    // First overloaded method that accepts an int argument
    public static void printValue(int number) {
        System.out.println("Integer value: " + number);
    }

    // Second overloaded method that accepts a double argument
    public static void printValue(double number) {
        System.out.println("Double value: " + number);
    }

    // Third overloaded method that accepts a String argument
    public static void printValue(String text) {
        System.out.println("String value: " + text);
    }
}
