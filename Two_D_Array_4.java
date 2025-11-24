//row wise sum of matrix
import java.util.Scanner;
class Two_D_Array_4{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int r=sc.nextInt();
        int c=sc.nextInt();
        int[][] mat=new int[r][c];
        for(int i=0;i<r;i++){
            for(int j=0;j<c;j++){
                mat[i][j]=sc.nextInt();
            }
        }
        for(int i=0;i<r;i++){
            int sum=0;
            for(int j=0;j<c;j++){
                sum+=mat[i][j];
            }
            System.out.println(sum);
        }
    }
}
//output:
//2 3 4-->typed
// 1 5 6-->typed
// 9
// 12