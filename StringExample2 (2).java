//unicode of a string     
import java.util.Scanner;
class StringExample2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);
            int unicode = (int) ch;
            System.out.println("Character: " + ch + " | Unicode: " + unicode);
        }
    }
}   
//output:
//H-->typed
// Character: H | Unicode: 72
//i-->typed
// Character: i | Unicode: 105
//!-->typed
// Character: ! | Unicode: 33