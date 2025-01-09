import java.lang.Math;
public class Checkarmstrong {
    public static boolean armstrong(int n){
        int num=n;
        int k = String.valueOf(num).length();
        int ld=0;
       
        int sum=0;
        while(n>0){
            ld=n%10;
            sum+=Math.pow(ld, k);
            n=n/10;
        }
        return sum==num ? true : false; 

      }
   public static void main(String args[]){
    int n=121;
    System.out.println(armstrong(n));
   }   
 }
