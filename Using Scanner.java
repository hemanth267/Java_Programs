import java.util.Scanner;
class NumbersFromUser {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // Read an integer
        int a = sc.nextInt();
        // Read another integer
        int b = sc.nextInt();
        // Read a long (this value is read but not used in the current output)
        long val = sc.nextLong();
        // Read a character (this value is read but not used in the current output)
        char ch = sc.next().charAt(0);
        // Calculate the sum of 'a' and 'b'
        int c = a + b;
        // Print the sum
        System.out.printf("Sum of %d and %d is: %d\n", a, b, c);
    }//output--> declare 4 values
// }10 20
// 23456
// c
// Sum of 10 and 20 is: 30