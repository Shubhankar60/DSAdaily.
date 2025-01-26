import java.util.*;
public class ifArrisSorted {
    public static boolean anss(int arr[],int n){
       
        for(int i=0; i<n;i++){
            for(int j=i+1; j<n; j++){
                if(arr[j]<arr[i]){
                    return false;
                }
            }
        }
        return true;
       
    }
    public static void main(String args[]){
        int arr[]={8, 2, 3, 4, 5, 6};
        int n=arr.length;
        System.out.println(anss(arr,n));
    }
}
