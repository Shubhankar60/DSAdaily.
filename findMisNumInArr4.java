public class findMisNumInArr4 {
    public static  int missingnumber(int arr[], int n){
        int xor1=0;
        int xor2=0;
        for(int i=0; i<n-1; i++){
            xor1=xor1^(i+1);
            xor2=xor2^arr[i];
        }
        xor1=xor1^n;
        return xor1^xor2;
    }
    public static void main(String[] args) {
        int arr[]={1, 2, 4, 5};
        int n=5;
        System.out.println(missingnumber(arr, n));
    }
}
