public class GCDofTwo {
    public static int findgcd(int n1,int n2){
        int gcd=1;
        for(int i=1; i<Math.min(n1,n2); i++){
            if(n1%i==0 && n2%i==0){
                gcd=i;
            }
           
        }
        return gcd;
    }
    public static void main(String args[]){
        int n1=35;
        int n2=15;
        System.out.println("gcd of two numbers "+findgcd(n1, n2));
    }
}
