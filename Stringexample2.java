import java.util.Scanner;
public class Stringexample2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter first number (a): ");
        int a = sc.nextInt();
        System.out.print("Enter second number (b): ");
        int b = sc.nextInt();
        System.out.print("Choose operation (+, -, *, /): ");
        char op = sc.next().charAt(0);
        int result = 0;
        boolean valid = true;
        switch (op) {
            case '+':
                result = a + b;
                break;
            case '-':
                result = a - b;
                break;
            case '*':
                result = a * b;
                break;
            case '/':
                if (b != 0) {
                    result = a / b;
                } else {
                    System.out.println("Division by zero is not allowed.");
                    valid = false;
                }
                break;
            default:
                System.out.println("Invalid operator.");
                valid = false;
        }
        if (valid) {
            System.out.println("Result: " + result);
        }
    }
}
//output:
// Enter first number (a): 10 -->typed
// Enter second number (b): 20 -->typed
// Choose operation (+, -, *, /): + -->typed
// Result: 30