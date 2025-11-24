class Charactercomparing{
    public static void main(String[] args) {
        char ch1='a';//97
        char ch2='b';//98
        if (ch1>ch2) System.out.println("Yes");
        else System.out.println("No");
        System.out.println((int)ch1);//using type casting to print ASCII
        System.out.println(ch2-ch1);
        int x=121;
        System.out.println(x);
        System.out.println((char)x);//using type casting to print character
        int num=3077;
        System.out.println((char)num);
    }
}
// output:
// No
// 97
// 1
// 121
// y
// α░à