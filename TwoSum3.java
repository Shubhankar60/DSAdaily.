
import java.util.Arrays;

public class TwoSum3 {
    public static String solution2sum(int arr[], int n, int target){
     Arrays.sort(arr);
     int left=0; 
     int right=n-1;
     while(left<right){
        int sum=arr[left] +arr[right];
        if(sum==target){
            return "yes";
        }else if(sum<target)left++;
         else right--;
     }
     return "no";
    }
    public static void main(String[] args) {
        int n = 5;
        int[] arr = {2, 6, 5, 8, 11};
        int target = 14;
        String ans = solution2sum(arr, n, target);
        System.out.println("This is the answer for variant 1: " + ans);
    }
}
