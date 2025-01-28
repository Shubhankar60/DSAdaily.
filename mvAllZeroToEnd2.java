public class mvAllZeroToEnd2 {
    public static int [] moveZeros(int arr[], int n){
        int j=-1;
        for(int i=0; i<n; i++){
            if(arr[i]==0){
                j=i;
                break;
            }
        }

        if(j==-1)return arr;

        for(int i=j+1; i<n; i++){
            if(arr[i]!=0){
                int temp=arr[i];
                arr[i]=arr[j];
                arr[j]=temp;
                j++;
            }
        }
        return arr;
    }
    public static void main(String args[]){
        int arr[]={1, 2, 0, 4, 0, 8, 1};
        int n=7;
        int ans[]=moveZeros(arr, n);
        for(int i=0; i<n; i++){
            System.out.print(ans[i]+" ");
        }
        System.out.println();
    }
}
