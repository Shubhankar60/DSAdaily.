public class Factorial {
    public static void printfactorial(int n, int fact){
        if(n<1){
            System.out.println(fact);
            return ;
        }
        printfactorial( n-1, fact*n);

    }
    public static void main(String args[]){
        int n=6;
        int fact=1;
        printfactorial(n,fact);
    }
}
