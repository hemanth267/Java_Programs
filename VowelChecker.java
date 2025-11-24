//write a static method that takes character and returns:
    //  true->if it's vowel
    //  false->otherwise
public class VowelChecker {
    public static boolean isVowel(char ch) {
        ch = Character.toLowerCase(ch); 
        return (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u');
    }
    public static void main(String[] args) {
        // Test cases
        System.out.println(isVowel('A')); 
        System.out.println(isVowel('b')); 
        System.out.println(isVowel('u')); 
    }
}    
//output:
//true
//false
//true