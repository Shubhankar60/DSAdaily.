public class ifArrisSorted2 {
    public static boolean anns(int arr[], int n){
        for(int i=1; i<n; i++){
            if(arr[i]<=arr[i-1]){

            }else{
                return false;
            }
        }
        return true;
    }
    public static void main(String[] args) {
        int arr[]={1, 3, 5, 2, 6};
        int n=arr.length;
        System.out.print(anns(arr, n));
    }
}
