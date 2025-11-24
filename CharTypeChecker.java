//Write a static method that takes character and prints:
    //   1--> if the character is lowercase alphabet
    //   2--> if the character is uppercase alphabet
    //   3--> if the character is digit
public class CharTypeChecker {
    public static void checkCharType(char ch) {
        if (Character.isLowerCase(ch)) {
            System.out.println("1");
        } else if (Character.isUpperCase(ch)) {
            System.out.println("2");
        } else if (Character.isDigit(ch)) {
            System.out.println("3");
        } else {
            System.out.println("Other character type");
        }
    }
    public static void main(String[] args) {
        checkCharType('a'); // Output: 1
        checkCharType('G'); // Output: 2
        checkCharType('5'); // Output: 3
        checkCharType('@'); // Output: Other character type
    }
}    