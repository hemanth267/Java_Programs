//Write a static method that takes a integer and returns the sum of digits of it
public class DigitSum {
    public static int sumOfDigits(int num) {
        int sum = 0;
        num = Math.abs(num);
        while (num > 0) {
            sum += num % 10;
            num /= 10;
        }
        return sum;
    }
    public static void main(String[] args) {
        System.out.println(sumOfDigits(1234));   // Output: 10
        System.out.println(sumOfDigits(-567));   // Output: 18
        System.out.println(sumOfDigits(0));      // Output: 0
    }
} 