public class maxConsecutiveOne {
    public static int consecutiveOnes(int arr[]){
        int max=0;
        int cnt=0;
        for(int i=0; i<arr.length; i++){
            if(arr[i]==1){
                cnt++;
            }else{
                cnt=0;
            }
            max=Math.max(max, cnt);
        }
        return max;
    }
    public static void main(String[] args) {
        int arr[]={1, 1, 0, 1, 1, 1, 0, 1, 1};
        System.out.println(consecutiveOnes(arr));
    }
}
