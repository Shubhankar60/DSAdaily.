import java.util.*;

public class secLargest {
   public static int anss(int nums[]){
    int largest=0;
    for(int i=0; i<nums.length; i++){    
        if(nums[i]>largest){
            largest=nums[i];
        }
    }
    int sl=-1;
    for(int j=0; j<nums.length; j++){
      if(nums[j]>sl && nums[j]!=largest){
        sl=nums[j];
      }
    }
    return sl;
   }
    public static void main(String args[]){
        int nums[]={2, 3, 4, 6, 4, 7, 7};
     System.out.print(anss(nums));
    }
}
