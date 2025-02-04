public class findMisNumInArr3 {
    public static int missingNumber(int arr[], int n){
        int natural=(n*(n+1))/2;
        int natural2=0;
        for(int i=0; i<n-1;i++){
           natural2= natural2+arr[i];
        }
     int ans=natural-natural2;
     if(ans==0){
        return -1;
     }
     return ans;
     
    }
    public static void main(String[] args) {
        int arr[]={1, 2, 4, 5};
        int n=5;
        System.out.println(missingNumber(arr, n));
    }
}
