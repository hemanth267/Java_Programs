class Arrayexample1{
    public static void main(String[] args) {
        //datatype arrayname[size];
        //d_type[] arr_name=new d_type[size];
        //Length arr array can be obtained using arr_name.length
        int[] arr={10, 20, 30, 40, 50, 60};
        System.out.println(arr.length);
        System.out.println(arr[5]);
        for(int i=0;i<arr.length;i++) System.out.println(i + "-->" + arr[i]);
        String[] names={"paul", "alain", "ash"};
        for(int i=names.length-1;i>=0;i--) System.out.println(names[i]);
        System.out.println(names.length);
        System.out.println(names[2]);
    }
}
//output:
// 6
// 60
// 0-->10
// 1-->20
// 2-->30
// 3-->40
// 4-->50
// 5-->60
// ash
// alain
// paul
// 3
// ash