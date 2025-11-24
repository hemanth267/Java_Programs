class Arrayforeachloop{
    public static void main(String[] args) {
        int[] A={10, 20, 30};
        for(int eachValue: A){
            System.out.println(eachValue*eachValue);
    }
    String[] names={"alice", "bob", "alain"};
    for(String eachName: names){
        System.out.println(eachName.charAt(0));
    }
    }
}
//output:
// 100
// 400
// 900
// a
// b
// a