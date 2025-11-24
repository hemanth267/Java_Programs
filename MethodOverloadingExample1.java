class MethodOverloadingExample1{
    //overloaded method
    static void add(int a, int b){
        System.err.println(a+b);
    }
    //overloaded method-->change in no.of parameters
    static void add(int a, int b, int c){
        System.out.println(a+b+c);
    }
    //overloaded method-->change in no.of parameters
    static void add(int a, int b, int c, int d){
        System.out.println(a+b+c+d);
    }
    //overloaded method-->change in type of parameter
    static void add(double a, double b){
        System.out.println(a+b);
    }
    //overloaded method-->change in type of parameter
    static void add(int[] A){
        int sum=0;
        for(int eachElement:A){
            sum+=eachElement;
        }
        System.out.println(sum);
    }
    //overloaded method-->change in type of parameter
    static void add(String s){
        System.out.println(s.charAt(0)+s.charAt(s.length()-1));
    }
    //overloaded method-->by changing the order of parameters
    static void add(String x, int p){
        System.out.println(x.charAt(0)+p);
    }
    //overloaded method-->by changing the order of parameters
    static void add(int p, String x){
        System.out.println(p+x.charAt(x.length()-1));
    }
    public static void main(String[] args) {
        add(10, 20);
        add(10, 20, 30);
        add(10, 20, 30, 40);
        add(1.2, 2.5);
        add(new int[]{10, 20, 30, 40, 50, 60});
        add("hello");
        add("hello", 20);//h+20
        add(20, "hello");//20+o
    }
}
//output:
// 30
// 60
// 100
// 3.7
// 210
// 215
// 124
// 131