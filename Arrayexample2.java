//Reading the 'n' string
import java.util.Scanner;
public class Arrayexample2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number of strings: ");
        int n = sc.nextInt();
        sc.nextLine(); 
        String[] strings = new String[n];
        System.out.println("Enter " + n + " strings:");
        for (int i = 0; i < n; i++) {
            strings[i] = sc.nextLine();
        }
        System.out.println("You entered:");
        for (String s : strings) {
            System.out.println(s);
        }
    }
}
//output:
// Enter number of strings: 2
// Enter 2 strings:
// ash
// brock
// You entered:
// ash
// brock