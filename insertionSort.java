public class insertionSort {
   public static void main(String[] args) {
    
   
    int arr[]={5, 3, 4, 7, 1, 9};
    int n=arr.length;
    for(int i=1; i<n; i++){
        int temp=arr[i];
        int j=i-1;
        while (j>=0 && arr[j]>temp) {
            arr[j+1]=arr[j];
            j--;
        }
        arr[j+1]=temp;
    }
    for(int k=0; k<n; k++){
        System.out.print(arr[k]+" ");
    }
}
}
