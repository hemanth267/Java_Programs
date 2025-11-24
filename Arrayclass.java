import java.util.Scanner;
import java.util.Arrays;
class Arrayclass{
    public static void main(String[] args) {
        //1.toString()
        int[] intArray={10, 20, 30, 40, 50};
        System.out.println(Arrays.toString(intArray));
        String[] names={"ash", "alain", "clemont"};
        String resultstring=Arrays.toString(names);
        System.out.println(resultstring);
        //2.Arrays.equals(arr1, arr2) --> boolean =true/false
        int A[]={10, 20, 30};
        int B[]={10, 20, 30};
        if(Arrays.equals(A, B)) System.out.println("Both arrays are same");
        else  System.out.println("Both arrays are not same");
        //3.Arrays.compare(arr1, arr2)
        //-1-->1st array is smaller than 2nd array
        //1 -->1st array is greater than 2nd array
        //0 -->when both arrays are equal
        System.out.println(Arrays.compare(B, A));
        //4.Arrays.fill(arr_name, value) -->used to fill all elements
        int[] d=new int[10];//all the elements are 0's
        System.out.println("Before filling: " + Arrays.toString(d));
        Arrays.fill(d, -1);//filling all array elements with -1
        System.out.println("After filling: " + Arrays.toString(d));
        boolean bArray[]=new boolean[20];//default value:false
        Arrays.fill(bArray, true);
        //5.Arrayss.sort()
        int[] integerArray={7, 6, -2, 1, 4};
        int[] copyOfArray=integerArray.clone();
        System.out.println("Before sorting: " + Arrays.toString(integerArray));
        Arrays.sort(integerArray);
        System.out.println("After sorting: " + Arrays.toString(integerArray));
        Arrays.sort(names);//string array
        System.out.println(Arrays.toString(names));
        //6.Arrays.binarySearch()
        int[] arr = {10, 20, 30, 40};
        Arrays.sort(arr);
        int index = Arrays.binarySearch(arr, 30); // returns 2
       //7.Arrays.mismatch()
       int[] a = {1, 2, 3};
       int[] b = {1, 2, 4};
       int mismatchIndex = Arrays.mismatch(a, b); // returns 2
       //8. Arrays.copyOf()
       int[] original = {1, 2, 3};
       int[] copy = Arrays.copyOf(original, 5); // [1, 2, 3, 0, 0]
    }
}
//output:
// [10, 20, 30, 40, 50]
// [ash, alain, clemont]
// Both arrays are same
//0
// Before filling: [0, 0, 0, 0, 0, 0, 0, 0, 0, 0]
// After filling: [-1, -1, -1, -1, -1, -1, -1, -1, -1, -1]
// Before sorting: [7, 6, -2, 1, 4]
// After sorting: [-2, 1, 4, 6, 7]
//[alain, ash, clemont]