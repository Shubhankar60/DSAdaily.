public class apearOnes3 {
    public static int apearOnesInArray(int arr[]){
       int n=arr.length;
        int xor=0;
        for(int i=0; i<n; i++){
             xor=xor^arr[i];
        }
        return xor;
    }
    public static void main(String[] args) {
        int arr[]={4, 1, 2, 1, 2};
        System.out.println(apearOnesInArray(arr));
    }
}
