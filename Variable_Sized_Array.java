//variable sized arrays (or) arrays of varying lengths
class Variable_Sized_Array{
    public static void main(String[] args) {
        //Java allows variable sized inner most arrays
        int[][] mat={{10, 20, 30}, {10, 20, 30, 40, 50}, {10}};
        for(int i=0;i<mat.length;i++){
            for(int j=0;j<mat[i].length;j++){
                System.out.print(mat[i][j] + " ");
            }
            System.out.println();
        }
    }
}
//output:
// 10 20 30 
// 10 20 30 40 50 
// 10 