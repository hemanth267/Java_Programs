class Stringcomparing{
    public static void main(String[] args) {
        String s1="hello";
        String s2="world";
        boolean result=s1.equals(s2);
        System.out.println(result);
        String string1="arnav";
        String string2="arjun";
        int res=string1.compareTo(string2);
        if (res<0) System.out.println("s1 is smaller than s2");
        else if(res>0) System.out.println("s1 is greater than s2");
        else System.out.println("s1 is equal to s2");
    }
}
//output:
//false
//s1 is greater than s2