/*
Name: Eric Siqueira
PRN: 23070126041
Batch: 2023-27 Batch
*/

import java.util.Scanner;

public class CalculatorMain {

    public static void main(String[] args) {
        // Using try-with-resources to automatically close the Scanner
        try (Scanner scanner = new Scanner(System.in)) {
            int choice;

            // Loop until the user decides to exit.
            while (true) {
                // Display the calculator menu.
                System.out.println("\n******** Calculator Menu ********");
                System.out.println("1. Addition");
                System.out.println("2. Subtraction");
                System.out.println("3. Multiplication");
                System.out.println("4. Division");
                System.out.println("5. Square");
                System.out.println("6. Cube");
                System.out.println("7. Square Root");
                System.out.println("8. Exit");
                System.out.print("Enter your choice: ");
                
                try {
                    // Attempt to read and parse the user's choice.
                    choice = Integer.parseInt(scanner.nextLine());
                } catch (NumberFormatException nfe) {
                    System.out.println("Invalid input. Please enter a valid number.");
                    continue;
                }
                
                if (choice == 8) {
                    System.out.println("Exiting Calculator. Goodbye!");
                    break;
                }
                
                // Process the selected option within a try-catch block
                try {
                    switch (choice) {
                        case 1 -> {
                            System.out.print("Enter two numbers separated by space: ");
                            String[] addNums = scanner.nextLine().split("\\s+");
                            double add1 = Double.parseDouble(addNums[0]);
                            double add2 = Double.parseDouble(addNums[1]);
                            System.out.println("Result: " + Addition.add(add1, add2));
                        }
                        case 2 -> {
                            System.out.print("Enter two numbers separated by space: ");
                            String[] subNums = scanner.nextLine().split("\\s+");
                            double sub1 = Double.parseDouble(subNums[0]);
                            double sub2 = Double.parseDouble(subNums[1]);
                            System.out.println("Result: " + Subtraction.subtract(sub1, sub2));
                        }
                        case 3 -> {
                            System.out.print("Enter two numbers separated by space: ");
                            String[] mulNums = scanner.nextLine().split("\\s+");
                            double mul1 = Double.parseDouble(mulNums[0]);
                            double mul2 = Double.parseDouble(mulNums[1]);
                            System.out.println("Result: " + Multiplication.multiply(mul1, mul2));
                        }
                        case 4 -> {
                            System.out.print("Enter dividend and divisor separated by space: ");
                            String[] divNums = scanner.nextLine().split("\\s+");
                            double dividend = Double.parseDouble(divNums[0]);
                            double divisor = Double.parseDouble(divNums[1]);
                            System.out.println("Result: " + Division.divide(dividend, divisor));
                        }
                        case 5 -> {
                            System.out.print("Enter a number: ");
                            double numSquare = Double.parseDouble(scanner.nextLine());
                            System.out.println("Result: " + Square.square(numSquare));
                        }
                        case 6 -> {
                            System.out.print("Enter a number: ");
                            double numCube = Double.parseDouble(scanner.nextLine());
                            System.out.println("Result: " + Cube.cube(numCube));
                        }
                        case 7 -> {
                            System.out.print("Enter a number: ");
                            double numSquareRoot = Double.parseDouble(scanner.nextLine());
                            System.out.println("Result: " + SquareRoot.squareRoot(numSquareRoot));
                        }
                        default -> System.out.println("Invalid choice. Please select a valid option from the menu.");
                    }
                } catch (NumberFormatException e) {
                    // Handles cases where the input number format is invalid.
                    System.out.println("Error: Invalid numeric input.");
                } catch (ArithmeticException e) {
                    // Handles arithmetic errors, such as division by zero or invalid square roots.
                    System.out.println("Error: " + e.getMessage());
                } catch (Exception e) {
                    // Handles any other unexpected exceptions.
                    System.out.println("An unexpected error occurred: " + e.getMessage());
                }
            } // end of while loop
        } // Scanner will be automatically closed here
    }
}

