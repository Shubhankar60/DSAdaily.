public class sumOfN {
    public static void sumprint(int i, int sum){
        if(i<1){
            System.out.println(sum);
            return;
        }
        sumprint(i-1, sum+i);

    }
    public  static void main(String args[]){
        int i=5;
        int sum=0;
        sumprint(i,sum);
    }
}
