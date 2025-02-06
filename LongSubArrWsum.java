public class LongSubArrWsum {
    public static int resultOflongSubArrSum(int arr[], int n, int k){
       int len=0;
        for(int i=0; i<n; i++){
            int s=0;
            for(int j=i; j<n; j++){
                s=s+arr[j];

                if(s==k) len =Math.max(len , j-i+1);
            }
        }
        return len;
    }
    public static void main(String args[]){
        int arr[]={2, 3, 5};
        int n=3;
        int k=5;
        System.out.println(resultOflongSubArrSum(arr, n, k));
    }
}
