public class longestSubArrSumPositiveneg{
    public static int longestsum(int arr[],int k){
        int maxlen=0;
        int n=arr.length;
        for(int i=0; i<n; i++){
            int s=0;
            for(int j=i; j<n; j++){
                s=s+arr[j];
                if(s==k){
                    maxlen=Math.max(maxlen, j-i+1);
                }
            }
        }
        return maxlen;
    }
    public static void main(String args[]){
        int arr[]={-1, 2, 1, 1, 1, 3, 0};
        int k=3;
        System.out.println("ans "+longestsum(arr, k));
    }
}