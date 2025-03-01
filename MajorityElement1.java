public class MajorityElement1 {
    public  static int findElement(int arr[],int n){
        for(int i=0; i<n; i++){
            int cnt=0;
            for(int j=0; j<n; j++){
                if(arr[i]==arr[j]){
                    cnt++;
                }
            }
           if(cnt>(n/2)) return cnt;
        }
        return -1;
    }
    public static void main(String[] args) {
        int arr[]={1, 2, 3, 3, 3, 3};
        int n=6;
        System.out.print(findElement(arr, n));
    }
}
