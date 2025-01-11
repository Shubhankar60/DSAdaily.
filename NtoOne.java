public class NtoOne {
    public static void printn(int n){
        if(n<1) return ;
        System.out.println(n);
        printn(n-1);
    }
    public static void main(String args[]){
        int n=10;
        printn(n);
    }
}
