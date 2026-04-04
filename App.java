/*
 * Wallace Tyner
 * SDC230L - Final Project
 * Calculator Application with Exception Handling
 */

import java.util.Scanner;

public class App {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Project Week 4 - Exception Handling Calculator - Wallace Tyner");

        System.out.println("Welcome! This program divides two numbers.");
        System.out.println("Enter numbers when prompted. Type 'q' anytime to quit.\n");

        boolean running = true;

        while (running) {
            try {
                System.out.print("Enter first number: ");
                String firstInput = input.nextLine();

                if (firstInput.equalsIgnoreCase("q")) {
                    break;
                }

                double num1 = Double.parseDouble(firstInput);

                System.out.print("Enter second number: ");
                String secondInput = input.nextLine();

                if (secondInput.equalsIgnoreCase("q")) {
                    break;
                }

                double num2 = Double.parseDouble(secondInput);

                if (num2 == 0) {
                    throw new ArithmeticException("Cannot divide by zero.");
                }

                double result = num1 / num2;

                System.out.println("Result: " + result + "\n");

            } catch (NumberFormatException e) {
                System.out.println("Invalid input. Please enter numeric values only.\n");

            } catch (ArithmeticException e) {
                System.out.println("Error: Cannot divide by zero. Try again.\n");
            }
        }

        System.out.println("\nThank you for using the application!");
        input.close();
    }
}