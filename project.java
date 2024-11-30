import java.util.Scanner;

public class project {
    public static void main(String[] args) {
        // Create a scanner object for input
        Scanner scanner = new Scanner(System.in);
        
        // Ask the user for the operation
        System.out.println("Enter first number:");
        double num1 = scanner.nextDouble();

        System.out.println("Enter an operator (+, -, *, /):");
        char operator = scanner.next().charAt(0);

        System.out.println("Enter second number:");
        double num2 = scanner.nextDouble();

        double result = 0;

        // Perform the operation based on the operator
        switch (operator) {
            case '+':
                result = num1 + num2;
                break;
            case '-':
                result = num1 - num2;
                break;
            case '*':
                result = num1 * num2;
                break;
            case '/':
                result = num1 / num2;
                break;
            default:
                System.out.println("Invalid operator!");
                return;
        }

        // Display the result
        System.out.println("The result is: " + result);

        // Close the scanner
        scanner.close();
    }
}

