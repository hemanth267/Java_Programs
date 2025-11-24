//using while loop
public class FactorialWhileLoop{
    public static void main(String[] args) {
        int number = 5; // The number for which to calculate factorial
        long factorial = 1; // Use long to handle larger factorial values
        int i = 1; // Initialize counter for the while loop
        // Check for negative input
        if (number < 0) {
            System.out.println("Factorial is not defined for negative numbers.");
        } else if (number == 0) {
            System.out.println("The factorial of 0 is 1.");
        } else {
            while (i <= number) {
                factorial *= i; // Multiply factorial by current number (i)
                i++;            // Increment i
            }
            System.out.println("The factorial of " + number + " is: " + factorial);
        }
    }
}
//output:
//The factorial of 5 is: 120