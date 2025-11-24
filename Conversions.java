class Conversions{
    public static void main(String[] args) {
        //converting string into a number by--->parseInt() method
        String num="54";
        int val=Integer.parseInt(num);
        System.out.println(val * val);
        System.out.println(Integer.parseInt("11011", 2));//binary to decimal
        System.out.println(Integer.parseInt("1b", 16));//hexa-decimal to decimal
        System.out.println(Integer.parseInt("33", 8));//octal to decimal
        //coverting integer to string by--->toString() method
        int i=123;
        String s=Integer.toString(i);
        System.out.println(s.length());
        int x=27;//binary of 27
        System.out.println(Integer.toString(x, 2));
        System.out.println(Integer.toString(x, 8));//octal of 27
        System.out.println(Integer.toString(x, 16));//hexa-decimal of 27
    }
}
//output:
// 2916
// 27
// 27
// 27
// 3
// 11011
// 33
// 1b