public class apearOnes {
    public static int apearOneinArray(int arr[]){
        
        for(int i=0; i<arr.length; i++){
            int num=arr[i];
            int cnt=0;
            for(int j=0; j<arr.length; j++){
                if(arr[j]==num){
               cnt++;
                }
            }
            if(cnt==1)return num;
        }
        return -1;
    }
    public static void main(String[] args) {
        int arr[]={1, 2, 1, 2, 3, 4, 4, 5, 5, 5};
        System.out.println(apearOneinArray(arr));
    }
}
