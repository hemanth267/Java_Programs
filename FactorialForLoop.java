//using for loop
public class FactorialForLoop {
    public static void main(String[] args) {
        int number = 5; // The number for which to calculate factorial
        long factorial = 1; // Use long to handle larger factorial values
        // Check for negative input
        if (number < 0) {
            System.out.println("Factorial is not defined for negative numbers.");
        } else if (number == 0) {
            System.out.println("The factorial of 0 is 1.");
        } else {
            for (int i = 1; i <= number; i++) {
                factorial *= i; // Multiply factorial by current number (i)
            }
            System.out.println("The factorial of " + number + " is: " + factorial);
        }
    }
}
//output:
//The factorial of 5 is: 120