public class fibonaci {
    static int fib(int n){
        if(n<=1) return n;
        int last=(n-1);
        int slast=(n-2);
        return last+slast;
    }
    public static void main(String[] args) {
        int n=10;
        System.out.println(fib(n));
    }
}
