public class OnetoNusingrec {
    public static void printn(int i,int n){
        if(i>n) return ;
        System.out.println(i);
        printn(i+1, n);
    }
    public static void main(String args[]){
        int n=10;
        int i=1;
        printn(i,n);
    }
    
}
