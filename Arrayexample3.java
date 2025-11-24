//min, max, sum of integer array
public class Arrayexample3 {
    public static void main(String[] args) {
        int[] nums = {5, 2, 9, 1, 7}; 
        int min = nums[0], max = nums[0], sum = 0;
        for (int num : nums) {
            if (num < min) min = num;
            if (num > max) max = num;
            sum += num;
        }
        System.out.println("Minimum: " + min);
        System.out.println("Maximum: " + max);
        System.out.println("Sum: " + sum);
    }
}
//output:
//Minimum: 1
// Maximum: 9
// Sum: 24