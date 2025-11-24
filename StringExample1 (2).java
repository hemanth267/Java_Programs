import java.util.Arrays;
class StringExample1 {
    public static void main(String[] args) {
        String s="hello world";
        //you need to acess a charAt() method
        //string_name.charAt(index_value);
        System.out.println(s.charAt(0));
        System.out.println(s.charAt(3));
        //length() method used to find total length of strings
        //string_name.length();
        int len=s.length();
        System.out.println(len);
        //run a loop on string
        for(int i=0;i<s.length(); i++){
            System.out.println(s.charAt(i));
        }
        //run a loop on string backwards
        for(int i=s.length()-1;i>=0;i--){
            System.out.println(s.charAt(i));
        }
        //Converting to lowerCase and upperCase
        String originalString="ADITYA";
        String lowerCaseVersion=originalString.toLowerCase();
        System.out.println(lowerCaseVersion);
        System.out.println(originalString);
        String upperCaseVersion=lowerCaseVersion.toUpperCase();
        System.out.println(upperCaseVersion);
        //toCharArray() method
        String x="technicalhab";
        //converting String into Character array
        char[] arr=x.toCharArray();
        System.out.println(Arrays.toString(arr));
        arr[10]='u';//changing 'a' at 10 index into 'u'
        System.out.println(Arrays.toString(arr));
        //Coverting character array back into string
        String outputString=new String(arr);
        System.out.println(outputString.toUpperCase());
        }
    }
//output:
// h
// l
// 11
// h
// e
// l
// l
// o

// w
// o
// r
// l
// d
// d
// l
// r
// o
// w

// o
// l
// l
// e
// h
// aditya
// ADITYA
// ADITYA
// [t, e, c, h, n, i, c, a, l, h, a, b]
// [t, e, c, h, n, i, c, a, l, h, u, b]
// TECHNICALHUB