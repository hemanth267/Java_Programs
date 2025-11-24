//Write a static method that takes 2 integers and returns a Boolean value:
    //   true->if 1st integer is a factor of 2nd ,i.e.., (b%a==0)
    //   false->otherwise
class Staticmethodexample1{
    //your own methods go
    static boolean isFactor(int a, int b){
        if(b%a==0) return true;
        else return false;
    }
    public static void main(String[] args) {
        boolean result=isFactor(12, 24);
        System.out.println(result);
    }
}    
//output:
//true