import java.util.Scanner;
class Strings1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int number = sc.nextInt();
        // Consume the leftover newline character after reading the number
        sc.nextLine(); 
        System.out.print("Enter a name: ");
        String name = sc.nextLine();
        System.out.println("Entered number is: " + number);
        System.out.println("Entered name is: " + name);
    }
}
// output:
// Enter a number: 10  -->typed
// Enter a name: Hemanth sri sai  -->typed
// Entered number is: 10
// Entered name is: Hemanth sri sai1