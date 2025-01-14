public class reverseArray {
    public static void printArayy(int arr[],int n){
        System.out.print("Reverse arrray is :");
        for(int i=0; i<n; i++){
            System.out.print(arr[i]+" ");
        }
    }
    public static void revarray(int arr[],int n){
        int p1= 0;
         int p2=n-1;
        while(p2>p1){
            int temp=arr[p1];
            arr[p1]=arr[p2];
            arr[p2]=temp;
            p1++;
            p2--;
        }
        printArayy(arr, n);
    }
    public static void main(String args[]){
        int n=5;
        int arr[]={5, 4, 3, 2, 1};
        System.out.print("Input array is :");
        for(int i=0; i<n; i++){
            System.out.print(arr[i]+" ");
        }
        revarray(arr, n);
       
    }
}
