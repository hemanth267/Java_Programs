import java.util.Arrays;
class StringExample3{
    // 1.this program will print the first character of each string in the array
    // and show the output as a single string
    public static void main(String[] args) {
        String[] names = {"abc", "def", "ghi", "jkl"};
        String ansString="";
        for(String eachString: names){
            ansString += eachString.charAt(0);
        }
        System.out.println(ansString);
        //2.sorting of a String
        String a="university";
        //toCharArray()--->converts string into a character
        char[] arr=a.toCharArray();
        Arrays.sort(arr);
        String result=new String(arr);
        System.out.println(result);
        //3.equalIgnoreCase
        String s1="aBc";
        String s2="abc";
        boolean res=s1.equals(s2);
        System.out.println(res);
        String s3="abc";//equalIgnore here
        String s4="ABC";
        System.out.println(s3.equalsIgnoreCase(s4));
        //4.compareTo
        String s5="pavan";
        String s6="ashok";
        System.out.println(s5.compareTo(s6));
        System.out.println(s6.compareTo(s5));
        String s7="abc";
        String s8="ABC";
        System.out.println(s7.compareToIgnoreCase(s8));//same
        //5.contains()
        String sentence="java is a goat programming language";
        String word="goat";
        char ch='g';
        System.out.println(sentence.contains(""+ch));
        boolean ans=sentence.contains(word);
        System.out.println(ans);
        System.out.println(sentence.contains("mmi"));
        System.out.println(sentence.contains("lnu"));
        String vowels="aeiouAEIOU";
        System.out.println(vowels.contains(""+ch));
        //6.isEmpty() and isBlank()
        String x="abc";
        System.out.println(x.isEmpty());
        String y="   ";
        String z="";
        System.out.println(y.isEmpty());
        System.out.println(y.length());
        System.out.println(z.isEmpty());
        System.out.println(y.isBlank());
        //7.split()--->splits all words
        sentence="java is a goat programming language";
        String words[]=sentence.split(" ");
        for(int i=0; i<words.length;i++){
            System.out.println(words[i]);
        }
        String date="28-07-2025";
        System.out.println(Arrays.toString(date.split("-")));
        //8.indexOf()-->if not exists returns -1
        word="James Gosling";
        char ch1='e';
        char ch2='z';
        System.out.println(word.indexOf(ch1));
        System.out.println(word.indexOf(ch2));
        //9.lastIndexOf()
        String text = "hello world, hello Java";
        int lastIndex = text.lastIndexOf("hello");
        System.out.println("Last index of 'hello': " + lastIndex);
        int charLastIndex = text.lastIndexOf('o');
        System.out.println("Last index of 'o': " + charLastIndex);
        //10.startswith(), endswitch()
        String fileName = "report2025.pdf";
        System.out.println("Starts with 'report': " + fileName.startsWith("report"));
        System.out.println("Ends with '.pdf': " + fileName.endsWith(".pdf"));
    }
}
//adgj
//eiinrstuvy
// false
// true
// 15
// -15
// 0
// true
// true
// true
// false
// false
// false
// false
// 3
// true
// true
// java
// is
// a
// goat
// programming
// language
// [28, 07, 2025]
//3
//-1
// Last index of 'hello': 13
// Last index of 'o': 17
// Starts with 'report': true
// Ends with '.pdf': true