import java.util.Scanner;
class LargestOfThree {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num1 = sc.nextInt();
        int num2 = sc.nextInt();
        int num3 = sc.nextInt();
        int largest = Math.max(num1, Math.max(num2, num3));
        System.out.println(largest);
    }
}//output:
// 100 200 300-->typed
// 300