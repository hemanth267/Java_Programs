//Write a static method takes 3 integers a, b, c and prints :
        //   yes, if a*c==b
        //   no, otherwise
public class Staticmethodexample3 {
    public static void checkEquality(int a, int b, int c) {
        if (a * c == b) {
            System.out.println("yes");
        } else {
            System.out.println("no");
        }
    }
    public static void main(String[] args) {
        // Sample test
        checkEquality(2, 6, 3);  
        checkEquality(2, 5, 3);  
    }
}
//output:
//yes
//no