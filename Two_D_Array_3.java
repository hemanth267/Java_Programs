import java.util.Scanner;
public class Two_D_Array_3 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        //dimensions
        int r=sc.nextInt();
        int c=sc.nextInt();
        //declaration
        int[][] mat=new int[r][c];
        //reading values into matrix
        for(int i=0;i<r;i++){
            for(int j=0;j<c;j++){
                mat[i][j]=sc.nextInt();
            }
        }
        //accessing the elements
        //runs on rows
        for(int i=0;i<r;i++){
            //runs on column
            for(int j=0;j<c;j++){
                System.out.print(mat[i][j] * mat[i][j] + " ");
            }
            System.out.println();
        }
    }
}
//output:
// 2 3-->typed
// 1 2 3-->typed
// 4 5 6