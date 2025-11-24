class Two_D_Array_1{
    public static void main(String[] args) {
        int[][] arr={{10, 20}, {30, 40}, {50, 60}};
        System.out.println(arr.length);//3
        System.out.println(arr[1][1]);//40
        System.out.println(arr[0][1]);//20
        for(int i=0;i<arr.length;i++){
            for(int j=0;j<arr[i].length;j++){
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }
    }
}
//output:
// 3
// 40
// 20
// 10 20
// 30 40
// 50 60