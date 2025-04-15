Explanation
Modular Design:
Each operation is contained in its own file and class, ensuring that the code is modular and adheres to the single-responsibility principle.

Main File Comments:
At the top of CalculatorMain.java, comments include the Name, PRN, and Batch details as specified.

Exception Handling:

NumberFormatException: Catches invalid numeric input both when reading the menu choice and when parsing numbers for operations.

ArithmeticException: Specifically used in the division and square root functionalities to prevent division by zero and to block invalid square root calculations on negative numbers.

General Exception: Catches any other exceptions to ensure robust error handling.

Coding Guidelines:
The code follows standard Java naming conventions, includes comments for each block of logic, and clearly separates operations into different functions (each in its own file).

To run the application, compile all the Java files together and run the CalculatorMain class. 
