import java.util.*;
public class largestEleinArr {
    public static void main(String args[]){
        int arr[]={2, 0, 4, 5, 8};
        System.out.println("Largest element in the array is :"+answer(arr));
    }
    public static int answer(int arr[]){
     int max=arr[0];
     for(int i=0; i<arr.length; i++){
        if(arr[i]>max){
            max=arr[i];
        }
     }
     return max;
    }
}
