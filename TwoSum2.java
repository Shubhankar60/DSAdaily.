
import java.util.HashMap;

public class TwoSum2{
    public static int[] solution2sum(int arr[], int n, int target){
        int[] ans=new int[2];
       ans[0]=ans[1]=-1;
       HashMap<Integer, Integer> mpp=new HashMap<>();
       for(int i=0; i<n; i++){
        int num=arr[i];
        int moreNeeded=target-num;
        if(mpp.containsKey(moreNeeded)){
            ans[0]=mpp.get(moreNeeded);
            ans[1]=i;
            return ans;
        }
        mpp.put(arr[i], i);
       }
       return ans;
    } 
    public static void main(String[] args) {
         int arr[]={2,6,5,8,11};
         int  target = 14;
         int n=5;
         int[] twosum=solution2sum(arr, n, target);
         System.out.println(twosum[0]+" , "+twosum[1]);

    }
}
