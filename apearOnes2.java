public class apearOnes2 {
    public static int apearOnesInArray(int arr[]){
        int max=0;
        for(int i=0; i<arr.length; i++){
            max=Math.max(max, arr[i]);
        }

        int[] hash=new int[max+1];
        for(int i=0; i<arr.length;i++){
            hash[arr[i]]++;
        }
        for(int i=0; i<arr.length; i++){
            if(hash[arr[i]]==1)return arr[i];
        }
        return -1;
    }
    public static void main(String[] args) {
        int arr[]={1, 2, 2, 1, 3, 4, 4, 4};
        System.out.println(apearOnesInArray(arr));
    }
}
