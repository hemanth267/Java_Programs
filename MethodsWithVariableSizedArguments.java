class MethodsWithVariableSizedArguments{
    static void add(int ... A){
        //the value stored in A of data type
        int sum=0;
        for(int eachElement:A){
            sum+=eachElement;
        }
        System.out.println(sum);
    }
    public static void main(String[] args) {
        add(100, 200);
        add(100);
        add(100, 200, 300);
        add(100, 200, 300, 400, 500, 600);
    }
}
//output:
// 300
// 100
// 600
// 2100