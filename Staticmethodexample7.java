//Write a static method that takes a string and returns it's last character
public class Staticmethodexample7 {
    public static char getLastChar(String str) {
        return str.charAt(str.length() - 1);
    }
    public static void main(String[] args) {
        System.out.println(getLastChar("world")); // Output: d
        System.out.println(getLastChar("java"));  // Output: a
    }
}